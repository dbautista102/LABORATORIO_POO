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
public class Ejercicio03_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input number of inches : ");
        Scanner inputDevice = new Scanner(System.in);
        double inches = inputDevice.nextDouble();
        final int inch = 12;
        System.out.println(inches+" inches  become "+(int)(inches/inch)+" feet and " +(int)(inches%inch)+" Inches");//inches
        System.out.println();
    }
    
}
