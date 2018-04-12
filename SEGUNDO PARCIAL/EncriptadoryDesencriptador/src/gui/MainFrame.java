/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controlador;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;

/**
 *
 * @author Usuario
 */
public class MainFrame extends JFrame {
    
    private JButton btnElegir;
    private JButton btnResolver;
    private Controlador Controler;   
    private JButton btnDesencriptar;
    private JPasswordField pssLlave;
    private JButton btnAceptar;
    private JLabel lblArchivo;
    
    public MainFrame() {
        super("Encriptador");
        this.Controler = new Controlador();
        super.setSize(500, 200);
        
       
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        
        //super.add(this.PanelButtons(),BorderLayout.CENTER);
        super.add(this.crearPanelTrabajo(),BorderLayout.CENTER);
        super.setVisible(true);
    }
    
    private JPanel crearPanelTrabajo() {
        JPanel panel = new JPanel();
        panel.setBackground(Color.GRAY);
        panel.setLayout(new FlowLayout());
        this.pssLlave = new JPasswordField(20);
        this.btnAceptar = new JButton("Aceptar");
        this.lblArchivo = new JLabel("ARCHIVO NO SELECCIONADO");
        
        this.btnAceptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String contrasena = new String(MainFrame.this.pssLlave.getPassword());
                        MainFrame.this.Controler.setLlave(contrasena);
                        MainFrame.this.btnElegir.setEnabled(true);
                    }
                }).start();
            }
        });
        panel.add(new JLabel("Contraseña: "));
        panel.add(this.pssLlave);
        panel.add(this.btnAceptar);
        panel.add(this.lblArchivo);
        panel.add(this.PanelButtons(), BorderLayout.CENTER);
        return panel;
    }
    
    private JPanel PanelButtons() {
        JPanel panel = new JPanel();
        //panel.setBackground(Color.yellow);
        this.btnElegir = new JButton("Seleccionar archivo");
        this.btnResolver = new JButton("Encriptar");
        this.btnDesencriptar = new JButton("Desencriptar");
        JFileChooser fileChooser = new JFileChooser();
        panel.setLayout(new FlowLayout());
        btnElegir.setEnabled(false);
        btnResolver.setEnabled(false);
        btnDesencriptar.setEnabled(false);
        btnElegir.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int returnVal = fileChooser.showOpenDialog(panel);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                        Controler.seleccionarArchivo(fileChooser.getSelectedFile().getAbsolutePath());
                        lblArchivo.setText("Archivo: "+fileChooser.getSelectedFile().getAbsolutePath());
                        btnResolver.setEnabled(true);
                        btnDesencriptar.setEnabled(true);
                    }
            }
            }
        );
        btnResolver.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Controler.encriptar();
                    
                    JOptionPane.showMessageDialog(MainFrame.this,String.format("Archivo Desencriptado"));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(MainFrame.this,"ERROR AL DESENCRIPTAR");
                }
            }
        });
        
        btnDesencriptar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    Controler.desencriptar();
                    JOptionPane.showMessageDialog(MainFrame.this,String.format("Archivo Encriptado"));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(MainFrame.this,"ERROR AL ENCRIPTAR");
                }
            }
        });
        
        panel.add(btnElegir);
        panel.add(btnResolver);
        panel.add(btnDesencriptar);
        
        return panel;
    }
}

class Test {
    public static void main(String[] args) {
        new MainFrame();
    }      
}

