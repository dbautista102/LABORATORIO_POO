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
public class Ejercicio02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Integer a = 20, b=50, c=89;
       computeBill(a);
       computeBill(a,b);
       computeBill(a,b,c);
    }

    private static void computeBill(Integer a) {
        double adeudo= a*1.08;
        System.out.println("You have 8% of tax, the total is"+ adeudo);
        
    }

    private static void computeBill(Integer a, Integer b) {
        double adeudo = (a*b)*1.08;
        System.out.println("The total is"+ adeudo);
    }

    private static void computeBill(Integer a, Integer b, Integer c) {
       double adeudo = ((a*b)-c)*1.08;
        System.out.println("The total is"+ adeudo);
    }
    
    
}
