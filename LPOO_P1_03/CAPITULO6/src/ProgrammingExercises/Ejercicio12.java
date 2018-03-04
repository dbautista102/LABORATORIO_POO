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
public class Ejercicio12 {

    
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
        
        for (int x = 1; x <= year; x++) {
            for (int y = 0; y < x; y++)
                saved += (saved * 0.05);
        }
        
         System.out.println("You have to save $"+(year*saved));
    }
    
}
