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
public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String temp;
        Integer x = 1;
	Integer y;
        String[] arreglo = {"america", "francia", "Reino Unido", "grecia", "mexico", "kenia", "Kendall", "Malone", "Tatiana"};
		
		
		while(x < arreglo.length) {
			temp = arreglo[x];
			y = x-1;
			while(y >= 0 && arreglo[y].compareTo(temp)>=0 )
			{
				arreglo[y + 1] = arreglo[y];
				--y;
			}
			arreglo[y+1] = temp;
			x++;
		}
		for(int i=0; i<arreglo.length; i++) {
			System.out.printf("%s%n",arreglo[i]);
		}

    }
    
}
