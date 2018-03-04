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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner prueba = new Scanner (System.in);
        Integer yact;
        Integer year;
        yact=prueba.nextInt();
        year = prueba.nextInt();
        System.out.println("You'll pay $"+ Pago(yact, year));
        
    }
    
    public static int Pago (Integer x, Integer y){
        int a = (x-y)/10;
        return (a+15)*20;
    }
}
