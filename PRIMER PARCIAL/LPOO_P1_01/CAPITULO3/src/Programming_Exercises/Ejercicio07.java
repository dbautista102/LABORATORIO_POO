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
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner datos =  new Scanner (System.in);
        Integer hs;
        Integer hse;
        double pagoporhora;
        hs=datos.nextInt();
        hse=datos.nextInt();
        pagoporhora=datos.nextDouble();
        System.out.println("El pago es " + (hs*pagoporhora)+horasextras(pagoporhora, hse));
    }
    
    public static double horasextras (double pago, Integer horasex){
        return pago*horasex*1.5;
    }
}
