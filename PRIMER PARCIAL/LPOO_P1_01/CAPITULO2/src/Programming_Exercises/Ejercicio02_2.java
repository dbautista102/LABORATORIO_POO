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
public class Ejercicio02_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double North, South;
        final double Increases = 0.10;
        System.out.println("Input the North' sales:");
        Scanner inputDevice = new Scanner(System.in);
        North = inputDevice.nextDouble();
        System.out.println("Input the South' sales:");
        Scanner inputDevice1 = new Scanner(System.in);
        South = inputDevice1.nextDouble();
         System.out.println(" The next yearâ€™s projected sales for North Division with 10 percent increase is "+(North*Increases+North));
         System.out.println(" The next yearâ€™s projected sales for South Division with 10 percent increase is "+(South*Increases+South));
    }
    
}
