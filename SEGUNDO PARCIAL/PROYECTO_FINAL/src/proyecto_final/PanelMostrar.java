/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import javax.swing.*;

/**
 *
 * @author bautista
 */
public class PanelMostrar extends JFrame {
    private JTextArea Pantalla;
    private JButton jButton1;
    private JButton jButton2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JScrollPane jScrollPane1;
    private PreguntasM pm; 
    private PreguntasA pa;
    public static Integer n;
    public static Integer n2;
    public static String[] preguntas;
    
    public PanelMostrar() {
       addPanel();
       pm=new PreguntasM();
       pa=new PreguntasA();
       super.setSize(450, 469);
        		
 
        setLocationRelativeTo(null);
        super.setVisible(true);
        super.setTitle("Login");
        super.setResizable(false);
    }
    
    public void addPanel(){
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        jScrollPane1 = new JScrollPane();
        Pantalla = new JTextArea();
        jButton1 = new JButton();
        jButton2 = new JButton();
        preguntas=new String[10000];
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel2.setBackground(new Color(0, 102, 255));
        
        Pantalla.setColumns(20);
        Pantalla.setRows(5);
        jScrollPane1.setViewportView(Pantalla);

        jButton1.setText("Aceptar y Salir");
        jButton2.setText("Cerrar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }

            private void BCancelarActionPerformed(ActionEvent evt) {
               //System.exit(0);
               D7 a = new D7();
               a.setVisible(true);
                setVisible(false);
            }
        });
        
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }

            private void BCancelarActionPerformed(ActionEvent evt) {
               Login log = new Login();
                setVisible(false);
                log.setVisible(true);
            }
        });
       Alin();
    }
    public void MostrarAlumno(){
        Pantalla.setText("Alumno: "+pa.getNombre());
        Pantalla.setText(Pantalla.getText()+"\nLicenciatura: "+pa.getCarrera());
        Pantalla.setText(Pantalla.getText()+"\nMatr�cula: "+pa.getMatricula());
        Pantalla.setText(Pantalla.getText()+"\nSemestre: "+pa.getSemestre());
        Pantalla.setText(Pantalla.getText()+"\nAsinatura: "+pa.getMateria());
        Pantalla.setText(Pantalla.getText()+"\nTipo de examen: "+pa.getTipoExamen());
        Pantalla.setText(Pantalla.getText()+"\nPREGUNTAS: ");
        for (int i = 0; i < pa.getPregExamen(); i++) {
            Pantalla.setText(Pantalla.getText()+"\n"+pa.mostrarContestar(i));
        }
        Pantalla.setText(Pantalla.getText()+"\nRESULTADO: "+pa.getAciertos()+"/"+pa.getPregExamen());
        Double cal= (double)(pa.getAciertos()*10)/pa.getPregExamen();
         Pantalla.setText(Pantalla.getText()+"\nCALIFICACI�N: "+cal);
        
    }
    public void setAlumno(PreguntasA preg){
        pa=preg;
        MostrarAlumno();
    }
    public void Mostrar(PreguntasM pg){
        pm=pg;
        for (int i = 0; i < pm.getTotalPreguntas(); i++) {
            if(pm.getPregunta(i)!=null){
            Pantalla.setText(Pantalla.getText()+"\n"+(i+1)+". "+pm.getPregunta(i));
            }else{
                i=pm.getTotalPreguntas();
            }
        }
    }
    public void setpm(PreguntasM pg){
       pm=pg;
       preguntas = new String[pm.getTotalPreguntas()];
        Pantalla.setEditable(false);
        Pantalla.setFont(new Font("Tahoma", 0, 14)); 
        Pantalla.setAlignmentX((JTextArea.CENTER_ALIGNMENT));
        Pantalla.setText(Pantalla.getText()+"\n\tCARRERA: "+pm.getCarrera());
        Pantalla.setText(Pantalla.getText()+"\n\tSEMESTRE: "+pm.getSemestre());
        Pantalla.setText(Pantalla.getText()+"\n\tASIGNATURA: "+pm.getMateria());
        Pantalla.setText(Pantalla.getText()+"\n\tDOCENTE : "+pm.getTipoExamen());
        Pantalla.setText(Pantalla.getText()+"\n\tTOTAL DE PREGUNTAS: "+pm.getTotalPreguntas());
        Pantalla.setText(Pantalla.getText()+"\n\tPREGUNTAS A RESPONDER: "+pm.getPregExamen());
         Pantalla.setText(Pantalla.getText()+"\n\tLISTADO DE PREGUNTAS: ");
        n = pm.getTotalPreguntas();
        n2 = pm.getPregExamen();
        for (int i = 0; i < pm.getTotalPreguntas(); i++) {
            Pantalla.setText(Pantalla.getText()+"\n\t"+(i+1)+". "+pm.getPregunta(i));
            preguntas[i]=pm.getPregunta(i);
        }
        
    }
    public void Alin(){
         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 47, Short.MAX_VALUE)
        );
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 176, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}
