/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author bautista
 */
public class Ejercicio13 {

    
    public static void main(String[] args) {
        
        double n1=0,n2=0,n3=0,n4=0;
        double por=0;
         
     
        for(int i = 1;i<= 52; i++ ){
            int f = 1 + (int)(Math.random()*4);
            System.out.println("week " +i+ " will be inspected the factory " + f);
            switch(f){
                case 1:
                    n1++;
                    break;
                case 2:
                    n2++;
                    break;
                case 3:
                    n3++;
                    break;
                case 4:
                    n4++;
                    break;
            }
        }
        System.out.println();
        for(int i = 1; i <= 4; i++){
            switch (i){
                case 1:
                    por=(n1*100)/52;
                    break;
                case 2:
                    por=(n2*100)/52;
                    break;
                case 3:
                    por=(n3*100)/52;
                    break;
                case 4:
                    por=(n4*100)/52;
                    break;
            }
            System.out.println("the factory " + i + " was inspected at" + (int)por + "%");
            
        }
    
    }
}
