/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;
import java.util.GregorianCalendar;
/**
 *
 * @author bautista
 */



public class Ejercicio12 {
	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar yearEnd = new GregorianCalendar(now.get(GregorianCalendar.YEAR), 11, 31);
		System.out.println("Fin de año: "+yearEnd.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.println("Dia actual: "+now.get(GregorianCalendar.DAY_OF_YEAR));
		System.out.printf("Faltan %d dias para el fin de año mes%n%n",
		(yearEnd.get(GregorianCalendar.DAY_OF_YEAR)-now.get(GregorianCalendar.DAY_OF_YEAR)));
		
	}
}
