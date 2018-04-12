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

    public MainFrame() {
        super("Determinantes");
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
        JFormattedTextField txtSize = new JFormattedTextField(formatter);
        txtSize.setColumns(4);

        JButton btnCrear = new JButton("Crear matriz");
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

        return panel;
    }

    private JPanel crearPnlBotones() {
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JButton btnCalcular = new JButton("Calcular determinante");
        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                int[][] matriz = pnlMatriz.getValores();
                controlador.setArray(matriz);
                int det = controlador.calcularDeterminante();
                JOptionPane.showMessageDialog(MainFrame.this, String.format("El determinante es: %d", det));
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
