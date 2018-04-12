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
public class Ejercicio10 {

    public static void main(String[] args) {
       
		
        Scanner sc=new Scanner(System.in);
	
        System.out.println("Enter the age");
	int age = sc.nextInt();
		
        System.out.println("Price of the school");
	int cost= sc.nextInt();

        while (age>=18){
            System.out.println("Invalid age, try again");
            age=sc.nextInt();
	}

	int d=18-age;
        int pago = cost/d;
		
	System.out.println("You have to save $" + pago + " per year");
    }
    
}
