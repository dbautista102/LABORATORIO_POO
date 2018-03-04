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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Input number of eggs : ");
        Scanner inputDevice = new Scanner(System.in);
        int eggs = inputDevice.nextInt();
        int e1 = (eggs/12);
        int e2 = (eggs%12);
        System.out.println(" You ordered "+eggs+ " eggs. Thatâ€™ s "+ e1 + "dozen at $3.25 per dozen and "+ e2 +"  loose eggs at 45.0 cents each for a total of $"+(375e1*3.25+e2*0.45) );
    }
    
}
