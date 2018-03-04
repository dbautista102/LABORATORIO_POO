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
public class Ejercicio14 {

    
    public static void main(String[] args) {
        double mexico = 114; 
        double usa = 312; 
        double mexInc = .0101; 
        double usaDec = .0015; 
        int c=0;
        while (usa>mexico){ 
            System.out.println("population of MEX: " +(int) mexico + "millions"); 
            System.out.println("population de USA: " + (int)usa + "millions\n"); 
            mexico+=mexico*mexInc; 
            usa-=usa*usaDec; 
            c++;
        } 
        System.out.println("The process takes : "+c+" years");
    }
    
}
