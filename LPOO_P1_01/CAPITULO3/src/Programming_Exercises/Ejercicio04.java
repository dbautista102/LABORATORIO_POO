package Programming_Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;
/**
 *
 * @author david
 */
public class Ejercicio04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Scanner prueba = new Scanner(System.in);
       Integer d;
       d = prueba.nextInt();
       inchs(d);
       galones(d);
    }
    
    public static void inchs(Integer a){
        System.out.println(""+a+" inches are "+ a*2.54 + " cm");
    }
    
    public static void galones(Integer b){
        System.out.println(""+b+ " galones are "+ b*3.7854 + " lt");
    }
}
