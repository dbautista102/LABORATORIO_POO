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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int guest;
       Scanner value = new Scanner(System.in);
       System.out.println("Enter the number of guests: ");
       guest = value.nextInt(); 
       System.out.println("************************************************");
       System.out.println("* Carlyâ€™s makes the food that makes it a party *");
       System.out.println("************************************************");
        System.out.println("The number of guest : "+guest+" The price per guest is $"+35+" The total price is $"+ guest*35 );
    }
    
}
