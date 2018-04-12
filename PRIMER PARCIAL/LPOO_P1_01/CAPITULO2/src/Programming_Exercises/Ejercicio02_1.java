package Programming_Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bautista
 */
public class Ejercicio02_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double Increases = 0.10;
        int NorthDiv =4000;
        int SouthDiv = 5500;
        System.out.println(" The next yearâ€™s projected sales for North Division with 10 percent increase is "+(NorthDiv*Increases+NorthDiv));
         System.out.println(" The next yearâ€™s projected sales for South Division with 10 percent increase is "+(SouthDiv*Increases+SouthDiv));
    }
    
}
