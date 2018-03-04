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
public class Ejercicio09 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
                Scanner in = new Scanner(System.in);
		String diauser;
		String[][] days = new String[2][7];
		days[0][0] = "Lunes";
		days[0][1] = "Martes";
		days[0][2] = "Miercoles";
		days[0][3] = "Jueves";
		days[0][4] = "Viernes";
		days[0][5] = "Sabado";
		days[0][6] = "Domingo";
		for(int i=0;i<5;i++) {
			days[1][i] = "9 to 9";
		}
		days[1][5] = "10 to 6";
		days[1][6] = "11 to 5";
		
		System.out.println("Enter a day of the week");
		diauser = in.nextLine();
		for(int i = 0; i<7; i++) {
			if(diauser.compareTo(days[0][i]) == 0) {
				System.out.println("Srvice in this day "+ days[1][i]);
			}
		}
		

    }
    
}
