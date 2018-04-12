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
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String words;
        StringBuilder acronimo=new StringBuilder();
        char c;
        
        words=JOptionPane.showInputDialog(null,"Enter 3 words to get the acronym");
        for(int i=0;i<words.length();i++){
            c=words.charAt(i);
            if(i==0){
                c=Character.toUpperCase(c);
                acronimo.append(c);
            }else{
                if(words.charAt(i)==' '){
                    ++i;
                    c=words.charAt(i);
                    c=Character.toUpperCase(c);
                    acronimo.append(c);
                }
            }
        }
        acronimo.setLength(3);
        JOptionPane.showMessageDialog(null,"El acrónimo de "+words.toLowerCase()+" es "+acronimo);

    }
    
}
