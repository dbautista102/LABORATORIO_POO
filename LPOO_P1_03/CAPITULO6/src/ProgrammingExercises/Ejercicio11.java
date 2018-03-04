/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author bautista
 */
public class Ejercicio11 {

  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int year;
        double saved;
      
        do {
            System.out.print("Years before the retirement: ");
            year = in.nextInt();
      
            System.out.print("Saved anual : ");
            saved = in.nextDouble();
         
            if (year < 1 || saved <= 0){
                System.out.println();
                System.out.println("try again !!.");
                System.out.println();
            }
        }while (year < 1 || saved <= 0);
      
        System.out.println("You have to save $"+(year*saved));
    }
    
}
