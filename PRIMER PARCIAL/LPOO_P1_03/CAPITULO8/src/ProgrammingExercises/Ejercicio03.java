/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;


public class Ejercicio03 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        String mueble;
        int precio;
        String[] muebles = {"Mesa", "Escritorio", "Tocador", "Centro de entretenimiento"};
        
        for(int i = 0; i<4;i++){
            System.out.println(i+1+" " +muebles[i]);
        }
        
        do{
            System.out.println("\nEscriba el nombre del mueble que desea");
            mueble = sc.nextLine();
            switch(mueble){
            case "mesa":
            case "MESA":
                precio= 250;
                break;
            case "escritorio":
            case "ESCRITORIO":
                precio= 325;
                break;
            case "tocador":
            case "TOCADOR":
                precio= 420;
                break;
            case "centro de entretenimiento":
            case "CENTRO DE ENTRETENIMEINTO":
                precio= 600;
                break;
            default: 
                precio = 0;
                break;
            }
        } while(precio==0);
        
        System.out.println("\nEl total a pagar es: $"+precio);
    }    
}
