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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long number;
       Scanner value = new Scanner(System.in);
       System.out.println("Enter the  number ticket:");
       number = value.nextLong(); 
       long rema = number%10;
       long nnum = (number/10)%7;
       if(rema == nnum){
            System.out.println("True");
       }else{
            System.out.println("False");
       }
      
    }
    
}
