/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto_final;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import static java.awt.JobAttributes.DestinationType.FILE;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.io.File;
import javax.swing.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import static proyecto_final.DocenteComienzo.SpinnerN;
import static proyecto_final.Registro.TextU;
/**
 *
 * @author bautista
 */
public class HacerPreguntas extends javax.swing.JFrame {
    public static JFileChooser ventana;
    private DocenteComienzo ce;
    private Integer contador;
    private Integer n;
    private PreguntasM pg=new PreguntasM();
    private  Integer aux;
    public static String preg[];
    
    
    
    private JButton atras;               
    private JLabel LabelImagen;
    private JButton Siguiente;
    private ButtonGroup buttonGroup1;
    private ButtonGroup buttonGroup2;
    private JTextField cuenta;
    private JButton jButton1;
    private JLabel jLabel2;
    private JPanel jPanel1;
    private JPanel jPanel2;
    private JRadioButton opcion1;
    private JRadioButton opcion2;
    private JRadioButton opcion3;
    private JRadioButton opcion4;
    private JTextField pregunta;
    private JTextField respuesta1;
    private JTextField respuesta2;
    private JTextField respuesta3;
    private JTextField respuesta4;
    
    public HacerPreguntas() {
        AddPanel();
        ce=new DocenteComienzo();
        contador=0;
        super.setSize(600, 700);
        super.setVisible(true);
        super.setTitle("Crear Examen");
        setLocationRelativeTo(null);
        //super.setAlwaysOnTop(true);
        ce.setVisible(false);
    }
    public void setSemestre(Integer a){
        pg.setSemestre(a);
    }
    public void setMateria(String str){
        pg.setMateria(str);
    }
    public void settipoExamen(String str){
        pg.setTipoExamen(str);
    }
    public void setCarrera(String str){
        pg.setCarrera(str);
    }
       
    public void settotalPreguntas(Integer i){
     pg.setTotalPreguntas(i);
    }
    public void setPregExamen(Integer a){
        pg.setPregExamen(a);
    }
                             
    private void AddPanel() {

        buttonGroup1 = new ButtonGroup();
        buttonGroup2 = new ButtonGroup();
        jPanel1 = new JPanel();
        jPanel2 = new JPanel();
        Siguiente = new JButton();
        pregunta = new JTextField();
        jButton1 = new JButton();
        LabelImagen = new JLabel();
        jLabel2 = new JLabel();
        opcion1 = new JRadioButton();
        opcion2 = new JRadioButton();
        opcion3 = new JRadioButton();
        opcion4 = new JRadioButton();
        respuesta1 = new JTextField();
        respuesta2 = new JTextField();
        respuesta3 = new JTextField();
        respuesta4 = new JTextField();
        cuenta = new JTextField();
        atras = new JButton();
        atras.setText("Atrás ");
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new Color(255, 255, 255));
        jPanel2.setBackground(new Color(51, 102, 255));

       

        Siguiente.setBackground(new Color(51, 102, 255));
        Siguiente.setFont(new Font("Tahoma", 1, 11)); 
        Siguiente.setForeground(new Color(255, 255, 255));
        Siguiente.setText("Siguiente");
        Siguiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SiguienteActionPerformed(evt);
            }
        });

        pregunta.addKeyListener(new java.awt.event.KeyAdapter() {
       public void keyTyped(java.awt.event.KeyEvent evt) {
                Character c = evt.getKeyChar();
                if(Character.isLetter(c)) {
                    evt.setKeyChar(Character.toUpperCase(c));
                }
            }
        });
         respuesta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextUMouseClicked(evt);
            }

            private void TextUMouseClicked(MouseEvent evt) {
                respuesta1.setText("");
            }
        });
         
          respuesta2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextUMouseClicked(evt);
            }

            private void TextUMouseClicked(MouseEvent evt) {
                respuesta2.setText("");
            }
        });
          respuesta3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextUMouseClicked(evt);
            }

            private void TextUMouseClicked(MouseEvent evt) {
                respuesta3.setText("");
            }
        });
          
           respuesta4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextUMouseClicked(evt);
            }

            private void TextUMouseClicked(MouseEvent evt) {
                respuesta4.setText("");
            }
        });
        buttonGroup1.add(opcion1);
        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opcion2);
        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opcion3);
        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(opcion4);
        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });
        
        
        
        
        
        pregunta.setFont(new Font("Tahoma", 0, 14)); 
        pregunta.setHorizontalAlignment(JTextField.CENTER);
        pregunta.setText("INGRESE LA PREGUNTA");

        
        pregunta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextUMouseClicked(evt);
            }

            private void TextUMouseClicked(MouseEvent evt) {
                pregunta.setText("");
            }
        });
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new Font("Tahoma", 0, 14)); 
        jLabel2.setText("Posibles respuestas: marque únicamente la respuesta correcta. ");

        opcion1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion1ActionPerformed(evt);
            }
        });

        opcion2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion2ActionPerformed(evt);
            }
        });

        opcion3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion3ActionPerformed(evt);
            }
        });

        opcion4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcion4ActionPerformed(evt);
            }
        });

        respuesta1.setText("Opcion 1");
        respuesta1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                respuesta1MouseClicked(evt);
            }
        });

        respuesta2.setText("Opcion 2");
        respuesta3.setText("Opcion 3");
        respuesta4.setText("Opcion 4");
        atras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atrasActionPerformed(evt);
            }

            private void atrasActionPerformed(ActionEvent evt) {
                if(contador>0){
            contador--;
//       
        if(contador>-1){
        cuenta.setText((" "+(contador+1)+"/"+n));
        pregunta.setText(pg.getPregunta(contador));
        pg.setPreguntas(pregunta.getText(), contador);
        respuesta1.setText(pg.mostrarUna(contador, 0));
        respuesta2.setText(pg.mostrarUna(contador, 1));
        respuesta3.setText(pg.mostrarUna(contador, 2));
        respuesta4.setText(pg.mostrarUna(contador, 3));
        Integer btn=pg.getbtn(contador);
                if(btn==1){
                    opcion1.setSelected(true);
                }else if(btn==2){
                    opcion2.setSelected(true);
                }else if(btn==3){
                    opcion3.setSelected(true);
                }else{
                    opcion4.setSelected(true);
                }
        }
        }
            }
        });
     alinear();   
    }                     
    public void alinear(){
         javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 462, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 22, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cuenta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(atras, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(377, 377, 377)
                                        .addComponent(Siguiente))))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(59, 59, 59)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(opcion2)
                                        .addComponent(opcion1)
                                        .addComponent(opcion3)
                                        .addComponent(opcion4))
                                    .addGap(69, 69, 69)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addComponent(jLabel2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pregunta, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion1)
                    .addComponent(respuesta1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion2)
                    .addComponent(respuesta2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(opcion3)
                    .addComponent(respuesta3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Siguiente)
                            .addComponent(atras))
                        .addGap(20, 20, 20))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(opcion4)
                            .addComponent(respuesta4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(72, Short.MAX_VALUE))))
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
    
    
    Integer a = Integer.parseInt(String.valueOf(DocenteComienzo.SpinnerN.getValue()));
    public void setn(Integer a){
        n=a;
        cuenta.setText(" 1/"+n);
    }
    private void SiguienteActionPerformed(java.awt.event.ActionEvent evt) {  
        preg=new String[100];
        if(pregunta.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Escriba una pregunta.", "Mensaje", 1,null );
        }else if(buttonGroup1.isSelected(null)){
           JOptionPane.showMessageDialog(this, "Seleccione una respuesta.", "Mensaje", 1,null );
        }else if(respuesta1.getText().equals("Opcion 1")|| respuesta2.getText().equals("Opcion 2") || respuesta3.getText().equals("Opcion 3") || respuesta4.getText().equals("Opcion 4")){
           JOptionPane.showMessageDialog(this, "Escriba todas las respuestas.", "Mensaje", 1,null );
       }else{
            if(contador < n-1){
            contador++;
            if(pg.getPregunta(contador)!=null){
                cuenta.setText((" "+(contador + 1)+"/"+n));
                pg.setPreguntas(pregunta.getText(), contador-1);
                pregunta.setText(pg.getPregunta(contador));
                respuesta1.setText(pg.mostrarUna(contador, 0));
                respuesta2.setText(pg.mostrarUna(contador, 1));
                respuesta3.setText(pg.mostrarUna(contador, 2));
                respuesta4.setText(pg.mostrarUna(contador, 3));
                aux=pg.getbtn(contador);
//               
                preg[contador]=respuesta1.getText();
                Integer btn=pg.getbtn(contador);
                    switch (btn){ 
                            case 1: opcion1.setSelected(true);
                                break;
                            case 2: opcion2.setSelected(true);
                                break;
                            case 3: opcion3.setSelected(true);
                                break;
                            case 4: opcion4.setSelected(true);
                                break;
                  }
            }else{
                
                cuenta.setText((" "+(contador + 1)+"/"+n));
                pg.setPreguntas(pregunta.getText(), contador-1);
                pg.setRespuestas(contador-1, 0, String.valueOf(respuesta1.getText()),aux);
                pg.setRespuestas(contador-1, 1, String.valueOf(respuesta2.getText()),aux);
                pg.setRespuestas(contador-1, 2, String.valueOf(respuesta3.getText()),aux);
                pg.setRespuestas(contador-1, 3, String.valueOf(respuesta4.getText()),aux);
                pregunta.setText("");
                respuesta1.setText("Opcion 1");
                respuesta2.setText("Opcion 2");
                respuesta3.setText("Opcion 3");
                respuesta4.setText("Opcion 4");
                buttonGroup1.clearSelection();
            }
            
        }else{
             pg.setPreguntas(pregunta.getText(), (n-1));
             pg.setRespuestas(n-1, 0, String.valueOf(respuesta1.getText()),aux);
             pg.setRespuestas(n-1, 1, String.valueOf(respuesta2.getText()),aux);
             pg.setRespuestas(n-1, 2, String.valueOf(respuesta3.getText()),aux);
             pg.setRespuestas(n-1, 3, String.valueOf(respuesta4.getText()),aux);
            cuenta.setText(String.valueOf(" "+(n)+"/"+n));
            FinalizarPreguntas finalizar=new FinalizarPreguntas();
            finalizar.setpr(pg);
            finalizar.setVisible(true);
            setVisible(false);
        }
        }
        
    }                                         
    File fichero;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        int resultado;


        JFileChooser ventana = new JFileChooser();

        FileNameExtensionFilter filtro = new FileNameExtensionFilter("JPG y PNG","jpg","png");

        ventana.setFileFilter(filtro);

        resultado= ventana.showOpenDialog(null);


        if (JFileChooser.APPROVE_OPTION == resultado){


        fichero = ventana.getSelectedFile();

        try{

               ImageIcon icon = new ImageIcon(fichero.toString());

                Icon icono = new ImageIcon(icon.getImage().getScaledInstance(LabelImagen.getWidth(), LabelImagen.getHeight(), Image.SCALE_DEFAULT));

                LabelImagen.setText(null);
               
               LabelImagen.setIcon( icono );


        }catch(Exception ex){

           
            JOptionPane.showMessageDialog(null, "Error abriendo la imagen "+ ex);
                 
        }
    
    }
    }                                        

    private void respuesta1MouseClicked(java.awt.event.MouseEvent evt) {                                        
        // TODO add your handling code here:
    }                                       

    private void opcion1ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       aux=1;
    }                                       

    private void opcion2ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       aux = 2;
    }                                       

    private void opcion3ActionPerformed(java.awt.event.ActionEvent evt) {                                        
        aux=3;
    }                                       

    private void opcion4ActionPerformed(java.awt.event.ActionEvent evt) {                                        
       aux=4;
    }                                       

      
                      
}
