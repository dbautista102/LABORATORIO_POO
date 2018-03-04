/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;


public class Ejercicio01 {

    public static void main(String[] args) {
        int[] matriz  = new int[8];
        
        for(int i = 0; i<8; i++){
            matriz[i] = i+1;
        }
        System.out.println("\t\t\t1 to 8");
        for(int i = 0; i<8;i++){
            System.out.print("["+matriz[i]+"]\t");
        }
        
        System.out.println("\n\n");
        System.out.println("\t\t\t8 to 1");
        for(int i = 7; i>=0;i--){
            System.out.print("["+matriz[i]+"]\t");
        }
        System.out.println();
    }
    
}
