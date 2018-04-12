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
public class Ejercicio15 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("Cars sold by Pam: ");
        int Pam = in.nextInt();
        System.out.print("Cars sold by Leo: ");
        int Leo = in.nextInt();
        System.out.print("Cars sold by Kim: ");
        int Kim = in.nextInt();
        System.out.print("Cars sold byBob: ");
        int Bob = in.nextInt();
        System.out.print("\nCars sold by :\nPam: ");
        for(int i=0;i<Pam;i++){
            System.out.print("X");
        }
        System.out.print("\nLeo: ");
        for(int i=0;i<Leo;i++){
            System.out.print("X");
        }
        System.out.print("\nKim: ");
        for(int i=0;i<Kim;i++){
            System.out.print("X");
        }
        System.out.print("\nBob: ");
        for(int i=0;i<Bob;i++){
            System.out.print("X");
        }
        System.out.println("\n\n");
    }
    
}
