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
public class Ejercicio03 {
    
    public static void main(String[] args) {
		Integer temp;
		Integer x = 1;
		Integer y;
		Double suma = 0.0;
		Integer n;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the elements MAX 20");
		n = scanner.nextInt();
		if(n<=20){
			Integer[] arreglo = new Integer[n];
			for(int i = 0; i<arreglo.length; i++) {
				System.out.printf("Enter the Intege: " +(i+1)+": ");
				arreglo[i] = scanner.nextInt();
			}
			while(x < arreglo.length) {
				temp = arreglo[x];
				y = x-1;
				while(y >= 0 && arreglo[y] > temp )
				{
					arreglo[y + 1] = arreglo[y];
					--y;
				}
				arreglo[y+1] = temp;
				x++;
			}
			
			for(int i = 0; i<arreglo.length; i++) {
				suma+=arreglo[i];
			}
			System.out.println("The Mean is : "+suma/arreglo.length);
			Double mediana;
			if(arreglo.length%2 == 0) {
				mediana = ((arreglo.length/2) + ((arreglo.length/2)+1))/2.0;
			}else {
				mediana = arreglo.length/2.0;
			}
				
			System.out.println("The median is : "+mediana);
			scanner.close();
		}else {
			System.out.println("ERROR");
		}
    }
	
}
