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

public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        String nums;
        Integer suma=0,entero;
        int posIni=0;
        
        nums=JOptionPane.showInputDialog(null,"Ingresar enteros separados por un espacio");
        for(int i=0;i<nums.length();i++){
            if(Character.isWhitespace(nums.charAt(i))){
                entero=Integer.parseInt(nums.substring(posIni, i));
                suma+=entero;
                posIni=i+1;
            }
            if(i==nums.length()-1&&Character.isDigit(nums.charAt(i))){
                if(i-posIni>0)
                    entero=Integer.parseInt(nums.substring(posIni, i+1));
                else
                    entero=Integer.valueOf(nums.substring(i));
                suma+=entero;
            }
        }
        String replace = nums.replace(' ', '+');
        JOptionPane.showMessageDialog(null,"El resultado de sumar "+replace+" es "+suma);

    }
    
}
