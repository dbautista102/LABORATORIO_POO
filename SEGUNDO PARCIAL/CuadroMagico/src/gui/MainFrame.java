/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controller;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author bautista
 */
public class MainFrame extends JFrame {

    private MatrizPanel pnlMatriz;
    private Controller controlador;
    private  JFormattedTextField txtSize;
    public MainFrame() {
        super("Cuadro Magico");
        super.setSize(500, 500);
        super.setLayout(new BorderLayout());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.controlador = new Controller();
        this.pnlMatriz = new MatrizPanel(1);
        super.add(this.crearPnlTrabajo(), BorderLayout.NORTH);
        super.add(this.pnlMatriz);
        //super.add(this.crearPnlBotones(), BorderLayout.SOUTH);
        super.setVisible(true);
    }

    private JPanel crearPnlTrabajo() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        NumberFormat formato = NumberFormat.getInstance();
        formato.setGroupingUsed(false);
        NumberFormatter formatter = new NumberFormatter(formato);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(Integer.MIN_VALUE);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        txtSize = new JFormattedTextField(formatter);
        txtSize.setColumns(4);

        JButton btnCrear = new JButton("Crear Cuadro");
        
        btnCrear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int size = Integer.valueOf(txtSize.getText());
                MainFrame.super.remove(pnlMatriz);
                pnlMatriz = null;
                pnlMatriz = new MatrizPanel(size);
                MainFrame.super.add(pnlMatriz);
                MainFrame.super.repaint();
            }
        });
        
        panel.add(txtSize);
        panel.add(btnCrear);
        
        panel.add(crearPnlBotones());
        //panel.add(MatrizPanel.limpiar);
        return panel;
    }

    private JPanel crearPnlBotones() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btnCalcular = new JButton("Comprobar");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int[][] matriz = pnlMatriz.getValores();
                controlador.setArray(matriz);
                int n=Integer.parseInt(txtSize.getText());
                int cont;
                int con2;
                int suma=0;
                int sumadiag =0;
                for (int i = 0; i < n; i++) {
                    cont =0;
                    con2=0;
                    for (int j = 0; j < n; j++) {
                        cont = cont + matriz[i][j];
                        con2 = con2 + matriz[j][i];
                    }
                    if(cont!= con2){
                        suma++;
                    }
                    System.out.println("La suma de la fila "+ i + " es "+ cont);
                    System.out.println("La suma de la columna "+ i + " es "+ con2);
                }
                int a =0;
                int contCol = 1;
                int contFil = 0;
                int[] diagonalSec = new int[matriz.length];
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if(i==j){
                            sumadiag = sumadiag + matriz[i][j];
                        }
                        if (i == contFil && j == n - contCol) { 
                            contFil++;
                            contCol++;
                            diagonalSec[i] = matriz[i][j];
                        }
                    }
                    
                }
                int suma2=0;
                System.out.println("la suma de las diagonales es "+ sumadiag);
                for (int i = 0; i < diagonalSec.length; i++) {
                    suma2=suma2+diagonalSec[i];
                
                }
                System.out.println("la suma de la otra diagonal es "+ suma2);
                 int contador = 0;
                int numerosRepetido [] = new int[n*n];
                
                for (int i = 0; i < n; i++) {
                    
                    for (int j = 0; j < n; j++) {
                        
                        for (int k = i+1; k < n; k++) {
                            
                            for (int l = j+1; l < n; l++) {
                                if(matriz[i][j]==matriz[k][l]){
                                    for(int f = contador;f>-1;f--){   //RECORRER ARREGLO QUE CONTIRNE LOS NUMEROS REPETIDOS
                                        if(numerosRepetido[f]!= matriz[i][j]){//SI EL NUMERO REPETIDO NO ESTA EN EL ARREGLO                                   
                                            numerosRepetido[contador] = matriz[k][l];//AGREGA EL NUMERO AL ARREGLO                                 
                                }                               
                            }
                                        contador = contador +1;//AUMENTA TOPE DE ARREGLO
                                }
                            }
                        }
                        
                            
                        
                    }
                }
                int repetidos=0;
                 for(int i = 0;i<numerosRepetido.length;i++){//RECORRE EL ARREGLO DE NUMEROS REPETIDOS
                if(numerosRepetido[i]!=0){//SI EN NUMERO E DIFERENTE DE 0
                System.out.println("Numeros repetidos: "+numerosRepetido[i]);//IMPRIMIR LOS NUMEROS QUE SE REPITEN
                repetidos++;
            }
             }
                 int mal=0;
                 for (int i = 0; i < n; i++) {
                     for (int j = 0; j < n; j++) {
                         if((matriz[i][j]<=0)||(matriz[i][j]>(n*n))){
                             mal++;
                         }
                     }
                }
                 if((suma==0)&&(sumadiag==suma2)){
                    JOptionPane.showMessageDialog(MainFrame.this, "FELICIDADES!", "BIEN HECHO!!!", JOptionPane.DEFAULT_OPTION);
                }else  if(mal>0){
                    JOptionPane.showMessageDialog(MainFrame.this, String.format("Ingresaste numeros fuera de rango"), "Alert!",  JOptionPane.WARNING_MESSAGE);
                }else if((suma>0)||(suma2!=sumadiag)){
                    JOptionPane.showMessageDialog(MainFrame.this, String.format("La suma de los numeros no es correcta"), "Alert!",  JOptionPane.WARNING_MESSAGE);
                }else if(repetidos>0){
                    JOptionPane.showMessageDialog(MainFrame.this, String.format("Ingresaste numeros repetidos"), "Alert!",  JOptionPane.WARNING_MESSAGE);
                }
                
               
            }
        });
        panel.add(btnCalcular);
        return panel;
    }
   
}

class Test {

    public static void main(String[] args) {
        new MainFrame();
    }
}
