/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author bautista
 */
import java.util.Scanner;

public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter an integer: ");
	number = in.nextInt();
        if((number%2)==0){
            System.out.println("Your number is even");
        }else{
            System.out.println("Your number is odd");
        }
		

    }
    
}
