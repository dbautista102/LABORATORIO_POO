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
public class Ejercicio03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner prueba = new Scanner(System.in);
        Integer price;
        price = prueba.nextInt();
        range(price);
        
    }
    
    public static void range(Integer var){
        System.out.println("the bomb has to be between  $"+(var*3.5)/100+ " and $"+(var*4.0)/100);
    }
}
