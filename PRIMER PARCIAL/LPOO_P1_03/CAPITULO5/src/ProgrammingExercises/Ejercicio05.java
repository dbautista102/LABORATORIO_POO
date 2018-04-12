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
        Double average;
        Integer actEx, servAct;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your high school grade point average:");
	average = in.nextDouble();
        System.out.println("Enter the number of extracurricular activities");
	actEx = in.nextInt();
        System.out.println("Enter the  number of service activities");
	servAct = in.nextInt();
        if((average>=3.8)&&(actEx>=1)&&(servAct>=1)){
            System.out.println("ScholarShip Candidate");
        }else if((average>=3.4&&average<=3.8)&&(actEx>=3)&&(servAct>=3)){
            System.out.println("ScholarShip Candidate");
        }else if((average>=3.0&&average<=3.4)&&(actEx>=2)&&(servAct>=3)){
            System.out.println("ScholarShip Candidate");
        }else{
            System.out.println("Not a Candidate");
        }
    }
    
}
