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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
		String[][] h = new String[2][4];
		Scanner in = new Scanner(System.in);
                Boolean ex;
		String cursoABuscar;
		
		
		for(int i=0; i < 4; i++) {
			System.out.println("Name of the course (CIS 150): ");
			h[0][i] = in.nextLine();
			
			System.out.println("Time of the  (CIS 5:10) : ");
			h[1][i] = in.nextLine();
			
		}
			ex = false;
			System.out.println("IName of the course: ");
			cursoABuscar = in.nextLine();
			for(int i=0; i<4; i++) {
				if(cursoABuscar.compareTo(h[0][i])==0) {
					ex = true;
					System.out.println("Hour of the course : "+ h[1][i]);
				}
			}
			if(ex==false) {
				System.out.println("Invalid course");
			}
			
		
	
    }
    
}
