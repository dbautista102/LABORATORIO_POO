/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.NumberFormat;
import javax.swing.*;
import javax.swing.text.NumberFormatter;

/**
 *
 * @author bautista
 */
public class MatrizPanel extends JPanel {

    private int tamano;
    private GridLayout matriz;
    private JFormattedTextField[][] campo;
    public static JButton limpiar;

    public MatrizPanel(int size) {
        super();
        this.tamano = size;
        limpiar = new JButton("limpiar");
        this.matriz = new GridLayout(this.tamano, this.tamano);
        this.setLayout(matriz);
        this.campo = new JFormattedTextField[size][size];
        NumberFormat formato = NumberFormat.getInstance();
        formato.setGroupingUsed(false);
        NumberFormatter formatter = new NumberFormatter(formato);
        formatter.setValueClass(Integer.class);
        formatter.setMinimum(Integer.MIN_VALUE);
        formatter.setMaximum(Integer.MAX_VALUE);
        formatter.setAllowsInvalid(false);
        formatter.setCommitsOnValidEdit(true);
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                this.campo[i][j] = new JFormattedTextField(formatter);
                this.campo[i][j].setColumns(4);
                super.add(campo[i][j]);
            }
        }
        limpiar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int n = size;
                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        campo[i][j].setText("");
                    }
                }
            }
        });
        
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int[][] getValores() {
        int [][] resultado = new int[campo.length] [campo.length];
        for (int i = 0; i < campo.length; i++) {
            for (int j = 0; j < campo.length; j++) {
                resultado[i][j] = Integer.valueOf(campo[i][j].getText());
            }
        }
        return resultado;
    }
}
