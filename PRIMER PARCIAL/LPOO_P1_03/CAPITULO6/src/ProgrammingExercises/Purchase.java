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
public class Purchase {
    int numFact;
    double mVenta;
    double impuesto;
    
    public void setNumFact(int fact){
        numFact = fact;
    }
   
    public void setMontoVenta(double venta){
        mVenta = venta;
        impuesto = venta * 0.05;
    }
   
    public void resultados(){
        System.out.println("\n\nNumber of invoice" + numFact);
        System.out.println("Total sale: $" + mVenta);
        System.out.println("The taxs for the sale$" + impuesto);
        System.out.println("The earnings are $" + (mVenta +impuesto));
    }
}
