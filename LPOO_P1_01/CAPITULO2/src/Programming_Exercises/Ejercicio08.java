package Programming_Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;

/**
 *
 * @author bautista
 */
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       double temp;
       Scanner value = new Scanner(System.in);
       System.out.println("Enter the  temperature in Fahrenheits:");
       temp = value.nextDouble(); 
       double Cel = ((temp-32)*(0.5555555556));
       System.out.println("Fahrenheits: "+temp+"  In Celsious: "+Cel);
       
    }
    
}
