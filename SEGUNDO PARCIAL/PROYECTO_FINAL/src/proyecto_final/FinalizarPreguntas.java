/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author bautista
 */
public class FinalizarPreguntas extends JFrame{
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JButton principal;
    private JLabel texto;
    private JButton ver;
    private PreguntasM pr;
    private PreguntasA pa;
    private Integer tipo;
    public static  Integer contador =0;
    public FinalizarPreguntas(){
        addPanel();
         pr=new PreguntasM();
        pa=new PreguntasA();
        super.setSize(400, 250);
        super.setVisible(true);
        super.setTitle("Confirmación");
        setLocationRelativeTo(null);
        super.setAlwaysOnTop(true);
        super.setResizable(false);
    }
    
    public void addPanel(){
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        texto = new JLabel();
        principal = new JButton();
        ver = new JButton();
        
        
        //setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel2.setBackground(new Color(51, 102, 255));
        texto.setFont(new Font("Tahoma", 0, 14)); 
        texto.setText("El examen se ha finalizado exitosamente");
        principal.setText("Menu Principal");
        ver.setText("Ver preguntas");
        ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verActionPerformed(evt);
            }

            private void verActionPerformed(ActionEvent evt) {
                setVisible(false);
                if(tipo==1){
                PanelMostrar mt=new PanelMostrar();
                mt.setpm(pr);
                mt.setVisible(true);
                }else if(tipo==2){
                PanelMostrar mt1=new PanelMostrar();
                mt1.setAlumno(pa);
                mt1.setVisible(true);
       }
            contador++;
            }
        });
        principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                principalActionPerformed(evt);
            }

            private void principalActionPerformed(ActionEvent evt) {
               Login log = new Login();
                setVisible(false);
                log.setVisible(true);
            }
        });
        alineacion();
    }
    public void alineacion(){
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 39, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(principal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ver)
                .addGap(51, 51, 51))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addComponent(texto)
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(texto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(principal)
                    .addComponent(ver))
                .addGap(38, 38, 38))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }
    public void setpr(PreguntasM m){
        pr=m;
        tipo=1;
    }
    public void setPreguntasAlumno(PreguntasA ag){
        pa=ag;
        tipo=2;
    }
}
