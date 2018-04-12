/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import controller.Controlador;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Usuario
 */
public class MainFrame extends JFrame {
    
    private Controlador controlador;
    
    public MainFrame() {
        super("Sopa de letras");
        this.controlador = new Controlador();
        super.setSize(200, 200);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLayout(new BorderLayout());
        
        super.add(this.crearPanelBotones(),BorderLayout.CENTER);
        super.setVisible(true);
    }
    
    private JPanel crearPanelBotones() {
        JPanel panel = new JPanel();
        JButton btnChoose = new JButton("Choose File");
        JButton btnSolve = new JButton("Resolve");
        JFileChooser fileChooser = new JFileChooser();
        panel.setLayout(new FlowLayout());
        btnSolve.setEnabled(false);
        btnChoose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int returnVal = fileChooser.showOpenDialog(panel);

            if (returnVal == JFileChooser.APPROVE_OPTION) {
                    try {
                        controlador.abrirArchivo(fileChooser.getSelectedFile());
                        btnSolve.setEnabled(true);
                    } catch (IOException ex) {
                        JOptionPane.showMessageDialog(MainFrame.this,"Ha habido un error");
                    }
            }
            }
        });
        btnSolve.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                try {
                    controlador.generarArchivoDeSalida();
                    JOptionPane.showMessageDialog(MainFrame.this,String.format("Archivo generado con exito  [%s]",controlador.getGestorArchivos().getoArchivo().getPath()));
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(MainFrame.this,"Ha habido un error");
                }
            }
        });
        
        panel.add(btnChoose);
        panel.add(btnSolve);
        
        return panel;
    }
}
