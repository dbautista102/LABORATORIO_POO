package Programming_Exercises;

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
public class Ejercicio01_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int NumberOfFeetInMile = 5280;
        double DistanceInMiles;
        System.out.println("Input the distance to your uncle's house ");
        Scanner inputDevice = new Scanner(System.in);
        DistanceInMiles = inputDevice.nextDouble();
         System.out.println("The distance to my uncle's house is "+ DistanceInMiles+ " Miles or "+ NumberOfFeetInMile*DistanceInMiles +" Feets" );
    }
    
}
