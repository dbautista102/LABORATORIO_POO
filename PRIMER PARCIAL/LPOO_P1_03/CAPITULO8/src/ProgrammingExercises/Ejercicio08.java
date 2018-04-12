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
public class Ejercicio08 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Salesperson[] s = new Salesperson[10];
        Integer nu =111;
        double ven= 25000.0;
        for(int i=0;i<10;i++){
            s[i]= new Salesperson(nu, ven);
            nu = nu + 1;
            ven = ven + 5000.0;
        }

        for(int i=0;i<10;i++){
            System.out.println("vendedor "+(i+1)+": "+ s[i].getNoIdentificacion()+"   "+s[i].getVentas());
        }
    }
    
}
