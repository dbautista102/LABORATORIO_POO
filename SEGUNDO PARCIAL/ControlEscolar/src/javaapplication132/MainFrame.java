/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates  
 * and open the template in the editor.
 */
package javaapplication132;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JFrame;

/**
 *
 * @author bautista
 */
public class MainFrame extends JFrame {
    private Alumno panel;
    public MainFrame() {
        super("Control");
        super.setSize(2000, 600);
        super.setLayout(new BorderLayout());
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.panel = new Alumno();
        panel.setLayout(new FlowLayout());
        //super.add(this.panel);
        super.add(this.panel, BorderLayout.CENTER);
      
        super.setVisible(true);
    }
}
class Test {

    public static void main(String[] args) {
        new MainFrame();
        
    }
}