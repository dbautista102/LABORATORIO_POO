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
public class Ejercicio04_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BloodData test1 = new BloodData();
        System.out.println(" RH FACTOR "+test1.getRhFactor()+" Type Blood "+test1.getBloodType());
        BloodData test2 = new BloodData("AB", '-');
        System.out.println(" RH FACTOR "+test2.getRhFactor()+" Type Blood "+test2.getBloodType());
    }
    
}
