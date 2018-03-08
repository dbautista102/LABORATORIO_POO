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



public class Ejercicio11 {
	public static void main(String[] args) {
		GregorianCalendar now = new GregorianCalendar();
		GregorianCalendar nextMonth = new GregorianCalendar(now.get(GregorianCalendar.YEAR), 
				now.get(GregorianCalendar.MONTH)+1, 1);
		System.out.printf("Faltan %d dias para el siguiente mes%n%n",
		(nextMonth.get(GregorianCalendar.DAY_OF_YEAR)-now.get(GregorianCalendar.DAY_OF_YEAR)));
		
	}
}
