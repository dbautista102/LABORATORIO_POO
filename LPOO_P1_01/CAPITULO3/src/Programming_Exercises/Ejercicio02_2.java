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

    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        
        double a;
        double b;
        a=datos.nextDouble();
        b=datos.nextDouble();
        computePercent(a,b);
        computePercent(b,a);
        // TODO code application logic here
    }
    
    public static void computePercent(double a, double b){
        System.out.println("los numeros son: "+a+"   "+b);
        double por = (a*100)/b;
        System.out.println(a+" es "+por+"% de "+b );
    }
    
}
