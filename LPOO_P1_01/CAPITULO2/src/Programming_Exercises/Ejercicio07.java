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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dollars;
       Scanner value = new Scanner(System.in);
       System.out.println("Enter the  pounds:");
       dollars = value.nextInt(); 
       int a = dollars/20;
       int b = (dollars%20)/10;
       int c = (dollars%10)/5;
       int d =(dollars%5)/1;
       System.out.println("The number of dollars of 20s "+a);
       System.out.println("The number of dollars of 10s "+b);   
       System.out.println("The number of dollars of  5s "+c);
       System.out.println("The number of dollars of 1s "+d);
      }
    
}
