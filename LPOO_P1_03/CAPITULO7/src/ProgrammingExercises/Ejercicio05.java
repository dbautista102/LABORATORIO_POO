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
public class Ejercicio05 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String cadenaPrim, cadenaSeg;
        Scanner in=new Scanner(System.in);
        StringBuilder encontrados=new StringBuilder();
        int cont=0;
        
        System.out.print("Enter a string ");
        cadenaPrim=in.nextLine();
        System.out.print("Enter another string");
        cadenaSeg=in.nextLine();
        
        for(int i=0;i<cadenaSeg.length();i++){
            for(int j=0;j<cadenaPrim.length();j++){
                if(cadenaPrim.charAt(j)== cadenaSeg.charAt(i)){
                    cont++;
                    encontrados.append(" ").append(cadenaPrim.charAt(j));
                }
            }
        }
        System.out.println(cont+" caracteres en "+cadenaPrim+" tambien se encuentran en "+cadenaSeg);
        System.out.println("Los "+cont+" caracteres son los siguientes:\n"+encontrados);

    }
    
}
