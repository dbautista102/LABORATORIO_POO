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
public class Ejercicio06 {

    public static void main(String[] args) {
        final double ki = 1.852;
        final double mi = 1.151;
        
        for(int i=15;i<=30;i++){
            System.out.println("Nudo: "+i);
            System.out.println("Km: "+(i*ki));
            System.out.println("Milla : "+(i*mi));
            System.out.println();
        }
    }
    
}
