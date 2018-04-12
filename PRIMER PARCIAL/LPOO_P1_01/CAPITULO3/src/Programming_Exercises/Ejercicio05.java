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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner (System.in);
        Integer an;
        Integer la;
        Integer al;
        System.out.println("Ingrese el ancho");
        an = datos.nextInt();
        System.out.println("Ingrese el largo");
        la = datos.nextInt();
        System.out.println("Ingrese la altura");
        al = datos.nextInt();
        
        System.out.println("Un cuarto de  "+an+" pies de ancho, "+ la +" pies de largo "+ al + " pies de alto necesita $"+ gastos(area(an, la, al)));
    }
    
    public static int area (Integer x, Integer y, Integer z){
        return (x*z*2)+(y*z*2);
    }
    
    public static double gastos(Integer area){
        return (area/350)*32;
    }
}
