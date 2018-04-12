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
public class Ejercicio04 {
    public static void main(String[] args) {		
		Recording[] array = new Recording[5];
                Scanner in = new Scanner(System.in);
		String title, artist;
		Integer time, opcion;
		for(int i=0; i<array.length; i++) {
			System.out.printf("Enter the title of the song : " +(i+1)+":  ");
			title = in.nextLine();
			System.out.printf("Enter the artist of the song "+(i+1)+":  ");
			artist = in.nextLine();
			System.out.printf("Enter the time of the song in seconds"+(i+1)+":  ");
			time = in.nextInt();
			array[i] = new Recording(title, artist, time);
			in.nextLine();

		}
		System.out.println("Sort by:\n1.-Title\n2.-Artist\n3.-Time");
		opcion = in.nextInt();
		switch(opcion) {
		case 1:
			Recording temp;
			Integer a = 1;
			Integer b;
			while(a < array.length) {
				temp = array[a];
				b = a-1;
				while(b >= 0 && array[b].getTitle().compareTo(temp.getTitle())>=0 )
				{
					array[b + 1] = array[b];
					--b;
				}
				array[b+1] = temp; 
				a++;
			}
			break;
		case 2:
			Recording temp2;
			Integer a2 = 1;
			Integer b2;
			while(a2 < array.length) {
				temp2 = array[a2];
				b2 = a2-1;
				while(b2 >= 0 && array[b2].getArtist().compareTo(temp2.getArtist())>=0 )
				{
					array[b2 + 1] = array[b2];
					--b2;
				}
				array[b2+1] = temp2; 
				a2++;
			}
			break;
		case 3:
			Recording temp3;
			Integer a3 = 1;
			Integer b3;
			while(a3 < array.length) {
				temp3 = array[a3];
				b3 = a3-1;
				while(b3 >= 0 && array[b3].getPlayingTime() > temp3.getPlayingTime() )
				{
					array[b3 + 1] = array[b3];
					--b3;
				}
				array[b3+1] = temp3;
				a3++;
			}
			break;
		default:
			System.out.println();	
		}
	
		for(int i = 0; i < array.length ; i++) {
			System.out.printf("Title of the song %d: %s%n", i, array[i].getTitle());
			System.out.printf("Artist of the song %d: %s%n", i, array[i].getArtist());
			System.out.printf("Time of the song %d: %d%n", i, array[i].getPlayingTime());
			System.out.println();
		}
		
	}

}
