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
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
		ArrayList<Salesperson> dataBase = new ArrayList<Salesperson>();
		Integer kep, opcion;
		Scanner scanner = new Scanner(System.in);
		Integer noIdentificacion;
		Double ventas;
		Boolean encontrado;
		do {
			encontrado = false;
			System.out.println("Enter a number");
			System.out.println("1.- add field\n2.- Delete field\n3.- Modify field\n");
			opcion = scanner.nextInt();
			switch(opcion) {
			case 1:
				if(dataBase.size() >= 20) {
					System.out.println("DB FULL");
				}else {
					System.out.println("ENTER ID: ");
					noIdentificacion = scanner.nextInt();
					for(int i = 0; i<dataBase.size(); i++) {
						if(noIdentificacion - dataBase.get(i).getNoIdentificacion() == 0) {
							encontrado = true;
						}
					}
					if(!encontrado) {
						System.out.println("VALUE OF THE SALES: ");
						ventas = scanner.nextDouble();
						Salesperson temporal = new Salesperson(noIdentificacion, ventas);
						dataBase.add(temporal);
					}else {
						System.out.println("ID already exist, try again");
					}
				}
				break;
			case 2:
				if(dataBase.isEmpty()) {
					System.out.println("DB empty");
				}else {
					System.out.println("Enter the ID: ");
					noIdentificacion = scanner.nextInt();
					for(int i = 0; i<dataBase.size(); i++) {
						if(noIdentificacion - dataBase.get(i).getNoIdentificacion() == 0) {
							encontrado = true;
							dataBase.remove(i);
							System.out.printf("Th element deleted"+noIdentificacion+"\n");
						}
					}
					if(!encontrado) {
						System.out.println("The ID doesnt exist");
					}
				}
				break;
			case 3:
				if(dataBase.isEmpty()) {
					System.out.println("The DATA BASE is empty");
				}else {
					System.out.println("Enter the ID: ");
					noIdentificacion = scanner.nextInt();
					for(int i = 0; i<dataBase.size(); i++) {
						if(noIdentificacion - dataBase.get(i).getNoIdentificacion() == 0) {
							encontrado = true;
							
							System.out.print("Enter the new date for the sale: ");
							dataBase.get(i).setVentas(scanner.nextDouble());
						}
					}
					if(!encontrado) {
						System.out.println("El ID DOESNT EXIST");
					}
				}
				break;
				default:
					System.out.println("INVALID NUMBER");
			}
			Salesperson temp;
			//ORDENAR
			for(int i = 0; i<dataBase.size(); i++) {
				for(int j = 0 ; j<dataBase.size(); j++) {
					if(dataBase.get(j).getNoIdentificacion()<dataBase.get(i).getNoIdentificacion()) {
						temp = dataBase.get(j);
						dataBase.set(j, dataBase.get(i));
						dataBase.set(i, temp);
						
					}
				}
			}
			System.out.println();
			System.out.println("DATA BASE : ");
			for(int i=0; i< dataBase.size(); i++) {
				System.out.println("ID: "+dataBase.get(i).getNoIdentificacion());
				System.out.println("SALES: "+dataBase.get(i).getVentas());
				System.out.println();
			}
			System.out.println("CONTINUES 1.- YES/ 2.- NO");
			kep = scanner.nextInt();
		}while(kep == 1);
		scanner.close();
	}

}
