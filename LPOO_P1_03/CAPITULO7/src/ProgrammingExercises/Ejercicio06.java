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
import java.util.Scanner;
public class Ejercicio06 {

    
    public static void main(String[] args) {
       Scanner entrada= new Scanner(System.in);
        String cadena;
        int cont=0;
        
        System.out.print("Enter a String");
        cadena=entrada.nextLine();
        cadena=cleanWord(cadena);
        
        for(int i=0;i<cadena.length();i++){
            if(Character.isWhitespace(cadena.charAt(i)))
                 cont++;
        }
        System.out.println("Words found "+(cont+1));
        
    }
    private static String cleanWord(String word) {

		word = word.replace(",", ""); 
		word = word.replace(".", ""); 
		word = word.replace(":", ""); 
		word = word.replace("(", ""); 
		word = word.replace(")", ""); 
		word = word.replace("[", ""); 
		word = word.replace("]", ""); 
		word = word.replace("-", ""); 

		return word;

    }
    
}
