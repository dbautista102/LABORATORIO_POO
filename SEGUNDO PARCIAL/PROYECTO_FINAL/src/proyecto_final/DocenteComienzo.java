/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import javax.swing.*;
import javafx.scene.control.Spinner;

/**
 *
 * @author bautista
 */
public class DocenteComienzo extends JFrame{
    
    private JButton BCancelar;
    private JButton BComenzar;
    private JLabel Ldocente;
    private JLabel Lmateria;
    private JLabel Lnp;
    private JLabel Lpe;
    private JLabel Lsemestre;
    private JLabel Lusuario;
    public static JSpinner SpinnerE;
    public static JSpinner SpinnerN;
    public static JTextField TextD;
    public static JTextField TextM;
    public static JTextField TextS;
    private JTextField TextU;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel carreraL;
    public static JTextField carreraT;
    public DocenteComienzo(){
        AddPanel();
       
        super.setSize(550, 380);
        super.setVisible(true);
        super.setTitle("Crear Examen");
        setLocationRelativeTo(null);
        super.setAlwaysOnTop(true);
        super.setResizable(false);
    }
    
    
    public void AddPanel(){
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        Lmateria = new JLabel();
        TextM = new JTextField();
        Lsemestre = new JLabel();
        TextS = new JTextField();
        Lnp = new JLabel();
        SpinnerN = new JSpinner();
        Lpe = new JLabel();
        SpinnerE = new JSpinner();
        Ldocente = new JLabel();
        TextD = new JTextField();
        Lusuario = new JLabel();
        TextU = new JTextField();
        BComenzar = new JButton();
        BCancelar = new JButton();
        carreraL = new JLabel();
        carreraT = new JTextField();
        
        carreraL.setFont(new Font("Tahoma", 0, 14)); 
        carreraL.setText("Carrera");
        carreraT.setHorizontalAlignment(JTextField.CENTER);
        carreraT.setText("CARRERA");
        carreraT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextMMouseClicked(evt);
            }

            private void TextMMouseClicked(MouseEvent evt) {
                carreraT.setText(" ");
            }
        });
        carreraT.addKeyListener(new java.awt.event.KeyAdapter() {
       public void keyTyped(java.awt.event.KeyEvent evt) {
                Character c = evt.getKeyChar();
                if(Character.isLetter(c)) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }
            }
        });
        TextD.setText(Registro.TextN.getText()+" "+ Registro.TextA.getText());
        TextD.setHorizontalAlignment(JTextField.CENTER);
        TextU.setText(Registro.TextU.getText());
        TextU.setHorizontalAlignment(JTextField.CENTER);
        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel2.setBackground(new Color(51, 102, 255));
        Lmateria.setFont(new Font("Tahoma", 0, 14)); 
        Lmateria.setText("Materia");

        TextM.setFont(new Font("Tahoma", 0, 12)); 
        TextM.setHorizontalAlignment(JTextField.CENTER);
        TextM.setText("Materia");
        TextM.addKeyListener(new java.awt.event.KeyAdapter() {
       public void keyTyped(java.awt.event.KeyEvent evt) {
                Character c = evt.getKeyChar();
                if(Character.isLetter(c)) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }
            }
        });
        TextM.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextMMouseClicked(evt);
            }

            private void TextMMouseClicked(MouseEvent evt) {
                TextM.setText(" ");
            }
        });

        Lsemestre.setFont(new Font("Tahoma", 0, 14)); 
        Lsemestre.setText("Semestre");

        TextS.setFont(new Font("Tahoma", 0, 12)); 
        TextS.setHorizontalAlignment(JTextField.CENTER);
        TextS.setText("Semestre");
        TextS.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextSMouseClicked(evt);
            }

            private void TextSMouseClicked(MouseEvent evt) {
               TextS.setText("");
            }
        });
        TextS.addKeyListener(new KeyAdapter() {
        public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        if (!(Character.isDigit(c) ||
        (c == KeyEvent.VK_BACK_SPACE) ||
        (c == KeyEvent.VK_DELETE))) {
        getToolkit().beep();    
       e.consume();
    }
    }
    });
        Lnp.setFont(new Font("Tahoma", 0, 14)); 
        Lnp.setText("Numero de preguntas a realizar");
        SpinnerN.setValue(1);
        Lpe.setFont(new Font("Tahoma", 0, 14)); 
        Lpe.setText("Preguntas en el examen");
        SpinnerE.setValue(1);

        Ldocente.setFont(new Font("Tahoma", 0, 14)); 
        Ldocente.setText("Docente");
        TextD.setEditable(false);
        Lusuario.setFont(new Font("Tahoma", 0, 14)); 
        Lusuario.setText("Usuario");
        TextU.setEditable(false);

        BComenzar.setBackground(new Color(51, 102, 255));
        BComenzar.setFont(new Font("Tahoma", 1, 11));
        BComenzar.setForeground(new Color(255, 255, 255));
        BComenzar.setText("Comenzar");

        BCancelar.setText("Cancelar");
        
        BCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCancelarActionPerformed(evt);
            }

            private void BCancelarActionPerformed(ActionEvent evt) {
                setVisible(false);
                Login log1 = new Login();
                log1.setVisible(true);
            }
        });
       
       
        BComenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BComenzarActionPerformed(evt);
            }

            private void BComenzarActionPerformed(ActionEvent evt) {
                setVisible(false);
                Integer vb = Integer.parseInt(String.valueOf(DocenteComienzo.SpinnerN.getValue()));
                Integer a = Integer.parseInt(String.valueOf(DocenteComienzo.SpinnerN.getValue()));
                Integer a2 = Integer.parseInt(String.valueOf(DocenteComienzo.SpinnerE.getValue()));
                Integer a3 = Integer.parseInt(String.valueOf(DocenteComienzo.TextS.getText()));
                String b1 = String.valueOf(DocenteComienzo.carreraT.getText());
                String b2 = String.valueOf(DocenteComienzo.TextM.getText());
                String b3 = String.valueOf(DocenteComienzo.TextD.getText());
                
                HacerPreguntas ap = new HacerPreguntas();
                ap.setn(vb);
                ap.setCarrera(b1);
                ap.setMateria(b2);
                ap.settipoExamen(b3);
                ap.settotalPreguntas(a);
                ap.setPregExamen(a2);
                ap.setSemestre(a3);
                ap.setVisible(true);
                
               
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
            .addGap(0, 26, Short.MAX_VALUE)
        );

        
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(BCancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BComenzar)
                .addGap(37, 37, 37))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lmateria)
                    .addComponent(Lsemestre)
                    .addComponent(Lnp)
                    .addComponent(Lpe)
                    .addComponent(Ldocente)
                    .addComponent(Lusuario)
                    .addComponent(carreraL))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextM, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(TextS, javax.swing.GroupLayout.DEFAULT_SIZE, 161, Short.MAX_VALUE)
                    .addComponent(TextD)
                    .addComponent(TextU)
                    .addComponent(carreraT)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(SpinnerE, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)
                        .addComponent(SpinnerN, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(68, 68, 68))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Ldocente)
                    .addComponent(TextD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lusuario)
                    .addComponent(TextU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Lmateria))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lsemestre)
                    .addComponent(TextS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lnp)
                    .addComponent(SpinnerN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lpe)
                    .addComponent(SpinnerE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(carreraL)
                    .addComponent(carreraT, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BCancelar)
                    .addComponent(BComenzar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }
}
