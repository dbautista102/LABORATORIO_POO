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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int days;
        double pounds;
        double cost;

      System.out.println("Enter the  pounds:");
      pounds = value.nextDouble();

      System.out.println("Enter number of days:");
      days = value.nextInt();

      cost = (.5*pounds)*days;

      System.out.println("The total is : " + cost);
    }
    
}
