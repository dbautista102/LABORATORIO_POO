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
public class Ejercicio01_2 {

     public static void main (String args[]){
        Integer x, y;
        Scanner datos  = new Scanner (System.in);
        x = datos.nextInt();
        y = datos.nextInt();
        
        displayNumberPlus10(x,y);
        displayNumberPlus100(x,y);
        displayNumberPlus1000(x,y);
    }
    
    public static void displayNumberPlus10 (Integer x, Integer y){

        System.out.println("x = "+(x+10)+" y = "+(y+10));
    }
    
    public static void displayNumberPlus100 (Integer x, Integer y){

        System.out.println("x = "+(x+100)+" y = "+(y+100));
    }
    
    public static void displayNumberPlus1000 (Integer x, Integer y){

        System.out.println("x = "+(x+1000)+" y = "+(y+1000));
    }
    
}
