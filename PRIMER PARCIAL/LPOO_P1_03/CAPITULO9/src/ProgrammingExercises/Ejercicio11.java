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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    
    private static final int SALIR = 99;

    public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    Integer day, hour;
    Integer du, hu;
    String nombreCita;
    Boolean continuar = true;

    String[][] citas = new String[31][24];
    for(int i=0; i<31; i++) {
    	for(int j=0; j<24;j++) {
    		citas[i][j] = "";
    	}
    }
    while (continuar) {
       System.out.println("Enter a day (99 to end)");
       du = scanner.nextInt();
       if (du == SALIR) {
          continuar = false;
       } else {
          System.out.println("Enter the hour");
          hu = scanner.nextInt();
          scanner.nextLine();
          System.out.println("Name of the date");
          nombreCita = scanner.nextLine();
          citas[du - 1][hu] = nombreCita;
       }
    } 
    continuar = true;
    while (continuar) {
       System.out.println("\nEnter the day for dates");
       day = scanner.nextInt(); 
       if (day == SALIR) {
         continuar = false;
       } else {
          for (hour = 0; hour < citas[day].length; ++hour) {
             if (citas[day - 1][hour] == "") {
               System.out.print("\nDia: " + (day) + " Hora: " + hour + "  Nada programado");
             } else {
               System.out.print("\nDia: " + (day) + " Hora: " + hour + " "  + citas[day - 1][hour]);
             } 
          }
       }
    }

    }
    
}
