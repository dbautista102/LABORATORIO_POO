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
public class Ejercicio03 {
    public static void main(String[] args) {
        String statement;
        Scanner in=new Scanner(System.in);
        int cont=0;
        
        System.out.print("Ingresar String>> ");
        statement=in.nextLine();
        for(int i=0;i<statement.length();++i){
            if(statement.charAt(i)==' ')
                ++cont;
        }
        System.out.println("Espacios encontrados en la frase:\n"+statement+"\nEspacios>> "+cont);
    }

}
