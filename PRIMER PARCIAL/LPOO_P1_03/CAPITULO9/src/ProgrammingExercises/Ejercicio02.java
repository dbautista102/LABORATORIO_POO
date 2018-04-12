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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Integer[] array = new Integer[5];
       Integer temp;
       Integer x = 1;
       Integer y;
       Double suma = 0.0;
	Scanner scanner = new Scanner(System.in);
	for(int i = 0; i<array.length; i++) {
		System.out.printf("Enter an Integer"+ (i+1) +": ");
		array[i] = scanner.nextInt();
	}
	while(x<array.length) {
		temp = array[x];
		y = x-1;
		while((y >= 0) && (array[y] > temp) )
		{
			array[y + 1] = array[y];
			y=y-1;
		}
		array[y+1] = temp;
		x++;
	}
	
	for(int i = 0; i<array.length; i++) {
		suma+=array[i];
	}
	System.out.println("The Mean is : "+suma/array.length);
	System.out.println("The Median is:  "+array[2]);
	

    }
    
}
