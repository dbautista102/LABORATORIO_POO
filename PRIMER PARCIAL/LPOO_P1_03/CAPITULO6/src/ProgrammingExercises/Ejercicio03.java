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
public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        while(n!=999){
            System.out.print("Par: ");
            n = in.nextInt();
            if(n%2==0){
                System.out.println("Good job!");
            }else{
                System.out.println("Fatal Error");
            }
        }
    }
    
}
