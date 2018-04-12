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
public class Ejercicio07 {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 50; i++) {
            for (int j = 0;j < i; j++)
                sum += 1 + j;
        System.out.println("Add between  1 y " + i + " = " + sum);
        sum = 0;
      }
    }
    
}
