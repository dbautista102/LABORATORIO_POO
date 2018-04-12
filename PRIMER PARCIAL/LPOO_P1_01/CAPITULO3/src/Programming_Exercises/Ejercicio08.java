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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double f= anual(in());
        System.out.println("At the year you 'll have inverted  $"+ f);
    }
    
    public static int in(){
        Scanner prueba = new Scanner (System.in);
        Integer a;
        a = prueba.nextInt();
        return a;
    }
    
    public static double anual(Integer inicial){
        return inicial*1.05;
    }
    
}
