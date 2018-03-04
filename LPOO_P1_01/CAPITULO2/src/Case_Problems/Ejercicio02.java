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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int min;
       Scanner value = new Scanner(System.in);
       System.out.println("Enter the number of minutes: ");
       min = value.nextInt(); 
       int me = min%60;
       int h = min/60;
         System.out.println("sssssssssssssssssssssssssssssssssss");
        System.out.println("s Sammyâ€™s makes it fun in the sun s.");
        System.out.println("sssssssssssssssssssssssssssssssssss");
       System.out.println("The number of hours: " +h+ "The n umber of minutos extras: "+ me+ "The total $"+((h*40)+(me*1)));
    }
    
}
