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

public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Salesperson> dataBase = new ArrayList<Salesperson>();
	Integer noIdentificacion;
	Double ventas;
	Scanner scanner = new Scanner(System.in);
	for(int i = 0; i<7; i++) {
		
			System.out.println("Enter the ID: ");
                	noIdentificacion = scanner.nextInt();
			System.out.println("Enter the values of the sales: ");
			ventas = scanner.nextDouble();
			Salesperson temporal = new Salesperson(noIdentificacion, ventas);
			dataBase.add(temporal);
		}
		Salesperson temp;
		for(int i = 0; i<dataBase.size(); i++) {
			for(int j = 0 ; j<dataBase.size(); j++) {
				if(dataBase.get(j).getNoIdentificacion()>dataBase.get(i).getNoIdentificacion()) {
					temp = dataBase.get(j);
					dataBase.set(j, dataBase.get(i));
					dataBase.set(i, temp);
					
				}
			}
		}
		for(int i=0; i< dataBase.size(); i++) {
			System.out.println("ID: "+dataBase.get(i).getNoIdentificacion());
			System.out.println("SALES: "+dataBase.get(i).getVentas());
			System.out.println();
		}
	

    }
    
}
