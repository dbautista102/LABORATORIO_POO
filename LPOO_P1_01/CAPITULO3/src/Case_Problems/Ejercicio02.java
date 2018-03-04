/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



import java.util.Scanner;

/**
 *
 * @author bautista
 */

 import java.util.Scanner;

public class Ejercicio02 {
	private static Scanner in = new Scanner(System.in);

	public static int solicitud() {

		System.out.println("Introduzca cuantas personas asistiran: ");
		int invitados = in.nextInt();

		return invitados;
	}

	public static String getEventNumber() {

		System.out.println("Introduzca el numero de evento : ");
		in.nextLine();
		String eventNumber = in.nextLine();

		return eventNumber;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Event evento = new Event();
		evento.setNumberOfGuestsForEvent(solicitud());
		evento.setEventNumber(getEventNumber());
		new Ejercicio01().Message();
		System.out.println(evento.toString()); 
	}

}
