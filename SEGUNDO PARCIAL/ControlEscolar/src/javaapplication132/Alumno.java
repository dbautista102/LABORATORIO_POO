/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication132;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author bautista
 */
public class Alumno extends  JPanel{
    private JScrollPane js;
    private JTextField name;
    private JTextField ncontrol;
    private JTextField pat;
    private JTextField mat;
    private JTextField fecha;
    private JTextField carrera;
    private JTextField prom;
    private JButton alta;
    private JButton nuevo;
    private JButton modificar;
    private JButton Eliminar;
    private JButton Cali;
    private JTable tabla;
    DefaultTableModel modelo = new DefaultTableModel();
    
    public Alumno() {
        
        initComponents();
        modelo.addColumn("No.Control");
        modelo.addColumn("Nombre");
        modelo.addColumn("Apellido Paterno");
        modelo.addColumn("Apellido Materno");
        modelo.addColumn("Fecha Nacimiento");
        modelo.addColumn("Carrera");
        modelo.addColumn("Promedio");
        
        tabla.setModel(modelo);
    }
    
     private void initComponents() {

        name = new JTextField(10);
        ncontrol = new JTextField(10);
        pat = new JTextField(10);
        mat = new JTextField(10);
        fecha = new JTextField(7);
        carrera = new JTextField(15);
        prom = new JTextField(8);
        
        alta = new JButton("Dar Alta");
        nuevo = new JButton("Nuevo");
        modificar = new JButton("Modificar");
        Eliminar = new JButton("Eliminar");
        Cali = new JButton("Mas..");
        
        tabla = new JTable();
        js = new JScrollPane();
        
        name.setText("Name");
        ncontrol.setText("NControl");
        pat.setText("Apellido Paterno");
        mat.setText("Apellido Materno");
        fecha.setText("Fecha Nacimiento");
        carrera.setText("Carrera");
        prom.setText("Promedio");
        
        
        
        alta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
               String dato[] = new String[7];
               dato[0] = ncontrol.getText();
               dato[1]= name.getText();
               dato[2]= pat.getText();
               dato[3]= mat.getText();
               dato[4]= fecha.getText();
               dato[5]= carrera.getText();
               dato[6]= prom.getText();
               modelo.addRow(dato);
            }
        });
        
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
               ncontrol.setText(" ");
               name.setText(" ");
               pat.setText(" ");
               mat.setText(" ");
               fecha.setText(" ");
               carrera.setText(" ");
               prom.setText(" ");
               ncontrol.requestFocus();
            }
        });
        
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
               int filaSelect = tabla.getSelectedRow();
               if(filaSelect >= 0){
                   ncontrol.setText((String) tabla.getValueAt(filaSelect, 0));
                   name.setText((String) tabla.getValueAt(filaSelect, 1));
                   pat.setText((String) tabla.getValueAt(filaSelect, 2));
                   mat.setText((String) tabla.getValueAt(filaSelect, 3));
                   fecha.setText((String) tabla.getValueAt(filaSelect, 4));
                   carrera.setText((String) tabla.getValueAt(filaSelect, 5));
                   prom.setText((String) tabla.getValueAt(filaSelect, 6));
                   modelo.removeRow(filaSelect);
               }else{
                   JOptionPane.showMessageDialog(js, "SELECCIONA UNA FILA PRIMERO");
               }
            }
        });
        
         Eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
               int filaSelect = tabla.getSelectedRow();
               if(filaSelect >= 0){
                   modelo.removeRow(filaSelect);
               }else{
                   JOptionPane.showMessageDialog(js, "SELECCIONA UNA FILA PRIMERO");
               }
            }
        });
        
         Cali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }

            private void jButton1ActionPerformed(ActionEvent evt) {
               SubFrame prueban = new SubFrame();
               prueban.setVisible(true);
            }
        });
        
        js.setViewportView(tabla);
      
        this.add(ncontrol);
        this.add(name);
        this.add(pat);
        this.add(mat);
        this.add(fecha);
        this.add(carrera);
        this.add(prom);
        
        this.add(alta);
        this.add(nuevo);
        this.add(modificar);
        this.add(Eliminar);
         this.add(Cali);
        this.add(js);
        
        
}
}
