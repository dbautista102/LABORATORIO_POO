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
public class Ejercicio07 {

    
    public static void main(String[] args) {
        
        String cadena1, cadena2, cadena3;
        Scanner in=new Scanner(System.in);
        
        System.out.print("Ingresa una cadena>> ");
        cadena1=in.nextLine();
        System.out.print("Ingresa una segunda cadena>> ");
        cadena2=in.nextLine();
        System.out.print("Ingresa una tercer cadena>> ");
        cadena3=in.nextLine();
        
        if(!verifyAlpha(cadena1,cadena2) || !verifyAlpha(cadena2, cadena3))
            System.out.println("No se ingresaron en orden alfabético");
        else
            System.out.println("Se ingresaron en orden alfabético");
    }
    public static boolean verifyAlpha(String a, String b){
	String aLower = a.toLowerCase();
     String bLower = b.toLowerCase();
        return a.compareTo(b)<=0; 

    }
    
}
