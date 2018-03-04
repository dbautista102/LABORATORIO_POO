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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
		Services salon[] = new Services[6];
		salon[0] = new Services("ASH", 3.30, 5);
		salon[1] = new Services("FHS", 4.60, 1);
		salon[2] = new Services("RKR", 43.30, 10);
		salon[3] = new Services("SLF", 58.45, 25);
		salon[4] = new Services("OAP", 788.0, 5);
		salon[5] = new Services("ÑR5", 687.10, 35);
		System.out.println("Como lo quieres ordenar\n1.- Por descripcion\n2.- Por precio\n3.- Por tiempo");
		Integer opcion = scanner.nextInt();
		switch (opcion) {
		case 1:
			ordenarDescri(salon);
			break;
		case 2:
			ordenarPrecio(salon);
			break;
		case 3:
			ordenarTiempo(salon);
			break;
		default:
			break;
		}
		System.out.println();
		for(int i =0; i<salon.length; i++) {
			System.out.println("Descipcion: "+ salon[i].getDes());
			System.out.println("Price : "+salon[i].getPrice());
			System.out.println("Time: "+salon[i].getMinu());
			System.out.println();
		}
		scanner.close();
	}
	public static void ordenarDescri(Services arreglo[]) {
		Services temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getDes().compareTo(temp.getDes())>=0 )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
	public static void ordenarPrecio(Services arreglo[]) {
		Services temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getPrice() > temp.getPrice() )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}
	public static void ordenarTiempo(Services arreglo[]) {
		Services temp;
		Integer a = 1;
		Integer b;
		while(a < arreglo.length) {
			temp = arreglo[a];
			b = a-1;
			while(b >= 0 && arreglo[b].getMinu()> temp.getMinu() )
			{
				arreglo[b + 1] = arreglo[b];
				--b;
			}
			arreglo[b+1] = temp; 
			a++;
		}
	}

    }
    

