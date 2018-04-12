/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bautista
 */

import java.util.Scanner;

public class Ejercicio01 {
	public static int Invited() {
                int inv; 
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of persons : ");
		inv = in.nextInt();
		
		return inv;
	}

	 public static void Message() {
        System.out.println("************************************************");
        System.out.println("* Carlyâ€™s makes the food that makes it a party *");
        System.out.println("************************************************");
			
	 }
	 
	 public static void Operation(int i) {
		 boolean x; 
			
			System.out.println("Number of invited: " +i);
			System.out.println("Price per host  : $35");
			System.out.println("total price :   "+(i*35));
			if(i>=50){
                            x =true;
                        }else{
                            x= false;
                        }
			
			System.out.println("the event is a large event: "+x);
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i =Invited();
		Message();
		Operation(i);
		
	}

}
