/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author bautista
 */
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
	System.out.print("Integer 1: ");
        int n1=in.nextInt();
        System.out.print("Integer  2: ");
        int n2=in.nextInt();
		
	if(n1>n2){
            for (int i=n2;i<=n1;i++){
		System.out.print(i+"  ");
            }
        }else if(n2>n1){
            for (int i=n1;i<=n2;i++){
		System.out.print(i+"  ");
            }
        }else if(n1==n2){
		System.out.print("The values are the same");
        }else{
            System.out.print("Fatal Error");
        }

	System.out.println();
    }
    
}
