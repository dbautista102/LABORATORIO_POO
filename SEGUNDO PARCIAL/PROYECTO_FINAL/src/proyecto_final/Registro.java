/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.*;

/**
 *
 * @author bautista
 */
public class Registro extends JFrame {
    private JButton Atras;
    private JComboBox<String> ComboBoxAP;
    private JLabel LabelA;
    private JLabel LabelC;
    private JLabel LabelN;
    private JLabel LabelTA;
    private JButton Registrarse;
    public static  JTextField TextA;
    private JPasswordField TextC;
    public static  JTextField TextN;
    public static  JTextField TextU;
    private JLabel jLabel5;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JLabel Titulo;
    public JTextField getTextA() {
        return TextA;
    }

    public void setTextA(JTextField TextA) {
        this.TextA = TextA;
    }

    public JPasswordField getTextC() {
        return TextC;
    }

    public void setTextC(JPasswordField TextC) {
        this.TextC = TextC;
    }

    public JTextField getTextN() {
        return TextN;
    }

    public void setTextN(JTextField TextN) {
        this.TextN = TextN;
    }

    public JTextField getTextU() {
        return TextU;
    }

    public void setTextU(JTextField TextU) {
        this.TextU = TextU;
    }
    
    public Registro(){
        //super(padre, true);
        AddPanel();
        super.setSize(410, 400);
        super.setVisible(true);
        super.setTitle("Registro");
        setLocationRelativeTo(null);
        super.setAlwaysOnTop(true);
        super.setResizable(false);
    }
    
    public void AddPanel(){
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        LabelN = new JLabel();
        TextN = new JTextField();
        ComboBoxAP =new JComboBox<>();
        TextA = new JTextField();
        LabelA = new JLabel();
        jLabel5 = new JLabel();
        TextU = new JTextField();
        TextC = new JPasswordField();
        LabelTA = new JLabel();
        LabelC = new JLabel();
        Registrarse = new JButton();
        Atras = new JButton();
         Titulo = new JLabel("REGISTRO");
        
        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel2.setBackground(new Color(153, 153, 255));
        TextC.setHorizontalAlignment(JTextField.CENTER);
        LabelN.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        LabelN.setHorizontalAlignment(SwingConstants.LEFT);
        LabelN.setText("Nombres (s)");
        TextN.addKeyListener(new java.awt.event.KeyAdapter() {
       public void keyTyped(java.awt.event.KeyEvent evt) {
                Character c = evt.getKeyChar();
                if(Character.isLetter(c)) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }
            }
        });
        TextN.setHorizontalAlignment(JTextField.CENTER);
        TextN.setText("NOMBRE (S)");
        TextN.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextNMouseClicked(evt);
            }

            private void TextNMouseClicked(MouseEvent evt) {
                TextN.setText("");
            }
        });
        TextA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextAMouseClicked(evt);
            }

            private void TextAMouseClicked(MouseEvent evt) {
                TextA.setText("");
            }
        });
        TextA.addKeyListener(new java.awt.event.KeyAdapter() {
       public void keyTyped(java.awt.event.KeyEvent evt) {
                Character c = evt.getKeyChar();
                if(Character.isLetter(c)) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }
            }
        });
        TextU.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextUMouseClicked(evt);
            }

            private void TextUMouseClicked(MouseEvent evt) {
                TextU.setText("");
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
        Registrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarseActionPerformed(evt);
            }

            private void RegistrarseActionPerformed(ActionEvent evt) {
                 Login login = new Login();
                setVisible(false);                 
               
                login.usuario = TextU.getText();
                login.contraseña = TextC.getText();
                login.tipo = ComboBoxAP.getSelectedItem().toString();
                login.setVisible(false);
            }
        });
        
        ComboBoxAP.setModel(new DefaultComboBoxModel<>(new String[] { "ALUMNO", "PROFESOR" }));

        TextA.setHorizontalAlignment(JTextField.CENTER);
        TextA.setText("APELLIDOS");
        LabelA.setFont(new Font("Tahoma", 0, 14)); 
        LabelA.setHorizontalAlignment(SwingConstants.LEFT);
        LabelA.setText("Apellidos");

        jLabel5.setFont(new Font("Tahoma", 0, 14)); 
        jLabel5.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel5.setText("Usuario");

        TextU.setHorizontalAlignment(JTextField.CENTER);
        TextU.setText("USUARIO");

        LabelTA.setFont(new Font("Tahoma", 0, 14)); 
        LabelTA.setText("Tipo de acceso");

        LabelC.setFont(new Font("Tahoma", 0, 14)); // NOI18N
        LabelC.setHorizontalAlignment(SwingConstants.LEFT);
        LabelC.setText("Contraseña");

        Registrarse.setBackground(new Color(51, 102, 255));
        Registrarse.setFont(new Font("Tahoma", 1, 11)); // NOI18N
        Registrarse.setForeground(new Color(255, 255, 255));
        Registrarse.setText("REGISTRARSE");

        Atras.setText("Atras");
        Atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AtrasActionPerformed(evt);
            }

            private void AtrasActionPerformed(ActionEvent evt) {
                 setVisible(false);
                
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
            .addGap(0, 47, Short.MAX_VALUE)
        );

        

        

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(LabelC)
                                    .addComponent(LabelTA))
                                .addGap(27, 27, 27)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TextC)
                                    .addComponent(TextA)
                                    .addComponent(TextN, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                                    .addComponent(TextU)
                                    .addComponent(ComboBoxAP, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(LabelA, javax.swing.GroupLayout.DEFAULT_SIZE, 84, Short.MAX_VALUE)
                                .addComponent(LabelN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(Atras)))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 107, Short.MAX_VALUE)
                .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelN, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelA, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextU, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TextC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelC, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTA)
                    .addComponent(ComboBoxAP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(Registrarse, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Atras)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );
    }
}
