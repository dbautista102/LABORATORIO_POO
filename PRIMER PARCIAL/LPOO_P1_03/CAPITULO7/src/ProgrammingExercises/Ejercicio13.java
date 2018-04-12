/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author bautista
 */
import javax.swing.JOptionPane;

public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre,direccion;
        StringBuilder id=new StringBuilder();
        char c;
        
        nombre=JOptionPane.showInputDialog(null,"Ingresar nombre completo");
        direccion=JOptionPane.showInputDialog(null,"Ingresar dirección (# y nombre de la calle)");
        for(int i=0;i<nombre.length();i++){
            c=nombre.charAt(i);
            if(i==0){
                c=Character.toUpperCase(c);
                id.append(c);
            }else{
                if(nombre.charAt(i)==' '){
                    ++i;
                    c=nombre.charAt(i);
                    c=Character.toUpperCase(c);
                    id.append(c);
                }
            }
        }
        for(int i=0;i<direccion.length();i++){
            if(!Character.isWhitespace(direccion.charAt(i)) && Character.isDigit(direccion.charAt(i))){
                c=direccion.charAt(i);
                id.append(c);
            }
        }
        JOptionPane.showMessageDialog(null,nombre+" con direccion en "+direccion+" le corresponde el ID "+id);

    }
    
}
