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
import java.util.Scanner;

public class Ejercicio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner in=new Scanner(System.in);
        
        
        System.out.print("Baby Name1 : ");
        String name1=in.nextLine();
        System.out.print("Baby Name2 :  ");
        String name2=in.nextLine();
        System.out.print("Baby Name3 : ");
        String name3=in.nextLine();
        
        System.out.println("The babys name can be:");
        System.out.println(imprimir(name1,name2));
        System.out.println(imprimir(name1,name3));
        System.out.println(imprimir(name2,name1));
        System.out.println(imprimir(name2,name3));
        System.out.println(imprimir(name3,name1));
        System.out.println(imprimir(name3,name2));
    }
    
    public static String imprimir(String name, String name2){
        return name+" "+name2;
    }
    

}
