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

public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                String mat;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Major: ");
		for (majors maj: majors.values()){
			System.out.println(maj);		
		}
		mat=in.nextLine();
		switch (mat){
			case "ACC":
			case "CIS":
			System.out.println("Materia en división empresarial");
			break;
			case"CHEM":
			case"PHYS":
			System.out.println("Materia en división de ciencias");
			break;
			case"ENG":
			case"HIS":
			System.out.println("Materia en division de humanidades");
			break;
			default:
			System.out.println("Materia Incorrecta");
		}
		
    }
}
enum majors{ACC, CHEM, CIS, ENG, HIS, PHYS}
    
    
