package ProgrammingExercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bautista
 */
public class Ejercicio07 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       SandwichFilling ins1 = new SandwichFilling("egg salad", 1203);
       System.out.println("Calories: "+ins1.getCalories()+" Type: "+ins1.getType());
       SandwichFilling ins2 = new SandwichFilling("meat fresh", 5672);
       System.out.println("Calories: "+ins2.getCalories()+" Type: "+ins2.getType());
       SandwichFilling ins3 = new SandwichFilling("fruits and vegetables", 234);
       System.out.println("Calories: "+ins3.getCalories()+" Type: "+ins3.getType());
    }
    
}
