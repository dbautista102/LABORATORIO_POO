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
public class Ejercicio01 {
    public static void main(String[] args) {
      String first= "David"; 
      String last = "Bautista";
      displaySalutation(last);
      displaySalutation(first, last);
        
    }

    private static void displaySalutation(String last) {
        System.out.println("Dear Mr. or Ms."+ last);
        System.out.println("Thank you for your recent order.");
    }
    private static void displaySalutation(String first, String last) {
        System.out.println("Dear "+ first+" "+last);
        System.out.println("Thank you for your recent order.");
    } 
}
