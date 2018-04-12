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

public class Ejercicio10 {
	public static void main(String[] args) {
		System.out.println("a. The square root of 37: "+Math.sqrt(37.0));
		System.out.println("b. The sine and cosine of 300: ");
		System.out.println("\tsine: "+Math.sin(300));
		System.out.println("\tcosine: "+Math.cos(300));
		System.out.println("c. The value of the floor, ceiling, and round of 22.8:");
		System.out.println("\tfloor: "+Math.floor(22.8));
		System.out.println("\tceiling: "+Math.ceil(22.8));
		System.out.println("\tround : "+Math.round(22.8));
		System.out.println("d. The larger and the smaller of the character “ D” and the integer 71:");
		System.out.println("\tLarger of D and 71: "+Math.max('D', 71));
		System.out.println("\tSmaller of D and 71: "+Math.min('D', 71));
		System.out.println("e. A random number between 0 and 20: "+Math.round(Math.random()*20));
	}
}
