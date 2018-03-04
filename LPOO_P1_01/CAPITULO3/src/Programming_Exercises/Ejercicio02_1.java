package Programming_Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author bautista
 */
public class Ejercicio02_1 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {        
        double a = 2.0;
        double b = 5.0;
        computePercent(a,b);
        computePercent(b,a);
        // TODO code application logic here
    }
    
    public static void computePercent(double a, double b){
        System.out.println("Los numero son: "+a+"   "+b);
        double por = (a*100)/b;
        System.out.println(a+" es "+por+"% de "+b );
    }
    
}
