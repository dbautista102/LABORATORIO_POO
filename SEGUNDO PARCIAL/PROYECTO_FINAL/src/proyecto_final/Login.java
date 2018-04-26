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
import static proyecto_final.Registro.TextU;

/**
 *
 * @author bautista
 */
public class Login extends JFrame{
    private JButton Cancelar;
    private JLabel LabelC;
    private JLabel LabelN;
    private JButton Registro;
    private JButton Sesion;
    private JPasswordField TextC;
    private JTextField TextU;
    private JLabel jLabel1;
    private JPanel jPanel1;
    private JPanel jPanel2;
    public static String usuario;
    public static String contraseña;
    public static String tipo;
    public Login(){
        addPanel();
        super.setSize(440, 469);
        		
 
        setLocationRelativeTo(null);
        super.setVisible(true);
        super.setTitle("Login");
        super.setResizable(false);
    }
    
    public void addPanel(){
        jPanel1 = new JPanel();
        TextU = new JTextField();
        Sesion = new JButton();
        jLabel1 = new JLabel();
        Registro = new JButton();
        Cancelar = new JButton();
        jPanel2 = new JPanel();
        TextC = new JPasswordField();
        LabelN = new JLabel();
        LabelC = new JLabel();
        
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel1.setSize(379, 469);
        Sesion.setBackground(new Color(51, 102, 255));
        Sesion.setFont(new Font("Tahoma", 1, 11)); 
        Sesion.setForeground(new Color(255, 255, 255));
        Sesion.setText("INICIAR SESIÓN");

        jLabel1.setText("¿Aún no te has registrado?");
        Registro.setText("Regístrate");
        Cancelar.setText("Cancelar");
        jPanel2.setBackground(new Color(153, 153, 255));
        
        LabelN.setFont(new Font("Tahoma", 0, 14)); 
        LabelN.setText("USUARIO");
        LabelC.setFont(new Font("Tahoma", 0, 14)); 
        LabelC.setText("CONTRASEÑA");

        
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }

            private void CancelarActionPerformed(ActionEvent evt) {
                //setVisible(false); 
                setVisible(false);
            }
        });
        TextU.addKeyListener(new java.awt.event.KeyAdapter() {
       public void keyTyped(java.awt.event.KeyEvent evt) {
                Character c = evt.getKeyChar();
                if(Character.isLetter(c)) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }
            }
        });
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }

            private void RegistroActionPerformed(ActionEvent evt) {
                //setVisible(false); 
                Registro registro = new Registro();
                registro.setVisible(true);
            }
        });
        
        Sesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SesionActionPerformed(evt);
            }

            private void SesionActionPerformed(ActionEvent evt) {
                if((!TextU.getText().equals(usuario))||(!TextC.getText().equals(contraseña)) ){
                     JOptionPane.showMessageDialog(TextC, "Usuario o Contraseña Invalida", "Error Login", 1, null);//this, "Escriba una pregunta.", "Mensaje", 1,null 
                }else{
                    //System.out.println(tipo);
                    if(tipo.equals("PROFESOR")){
                        setVisible(false);
                        DocenteComienzo DC = new DocenteComienzo();
                        DC.setVisible(true);
                    }else if(tipo.equals("ALUMNO")){
                        D7 al = new D7();
                        setVisible(false);
                        al.setVisible(true);
                        
                        
                    }
                }
                //System.out.println(usuario);
                //System.out.println(contraseña);
                
            }
        });
        Alineacion();

        
    }
    public void Alineacion(){
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelN, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(TextC)
                    .addComponent(TextU, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE))
                .addGap(25, 25, 25))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Cancelar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 68, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Registro)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(TextU, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                    .addComponent(LabelN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LabelC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TextC, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                .addGap(53, 53, 53)
                .addComponent(Sesion, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 148, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Registro)
                    .addComponent(Cancelar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }
}

class test{
    public static void main(String[] args) {
        new Login ();
    }
}