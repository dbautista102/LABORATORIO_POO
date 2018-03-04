/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author bautista
 */
public class Ejercicio16 {

    public static void main(String[] args) {
        
        Purchase prueba = new Purchase();
        Scanner in = new Scanner(System.in);
        
        System.out.print("Numero de factura: ");
        int F = in.nextInt();
        System.out.print("Cant. de venta: $");
        double sale = in.nextDouble(); 
        sale *= 100;
        sale +=0.5;
        
        
        sale = (int)sale;
        sale /= 100;
      
        while (F < 1000 || F> 8000){
            System.out.println("Invalid number, " + 
                    "\nTry again (between 1000 y 8000): ");
            F = in.nextInt(); 
        }
      
        while (sale < 0){
            System.out.println("Invalid number");
            sale = in.nextDouble();
        }
   
      
        prueba.setNumFact(F);
        prueba.setMontoVenta(sale);
        prueba.resultados();
    }
    
}
