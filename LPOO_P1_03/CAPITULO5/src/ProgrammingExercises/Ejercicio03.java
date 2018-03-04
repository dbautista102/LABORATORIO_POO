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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer number;
        Scanner in = new Scanner(System.in);
        System.out.println("Choose a number:\n1.- Park View\n2.- Glof Course View\n3.- Lake View: ");
	number = in.nextInt();
        if(number==1){
                System.out.println("Chosen View: Park view \nPrice Of the Condo: $150,000");
        }else if(number ==2){
                System.out.println("Chosen View: golf course views \nPrice Of the Condo: $170,000");
        }else if(number==3){
                System.out.println("Chosen View: Lake views \nPrice of The Condo: $210,000");
        }else{
                System.out.println("Chosen View: Incorrect \nPrice Of the Condo: $0");
        
        }
    }
    
}
