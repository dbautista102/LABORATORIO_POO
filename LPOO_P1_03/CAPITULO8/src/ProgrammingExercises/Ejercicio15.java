/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author jdani
 */
import java.util.Scanner;
public class Ejercicio15 {

    
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
    String marca;
    int resol;
    DigitalCamera[] camArray = new DigitalCamera[4];
     
    for (int i = 0; i < camArray.length; i++)
    {
      System.out.println("Camara " + (i + 1) 
        + " marca: >>");
      marca = input.nextLine();
      System.out.println("Camara " + (i + 1)
        + " resolucion: >>");
      resol = input.nextInt(); 
      camArray[i] = new DigitalCamera(marca, resol);
      input.nextLine();
    }
       
    for (int i = 0; i < camArray.length; i++)
    {
      camArray[i].displayDigitalCamera();
    }

    }
    
}
