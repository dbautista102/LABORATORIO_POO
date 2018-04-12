package Programming_Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author david
 */
public class Ejercicio09{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Sandwich s = new Sandwich();
        
        s.setingrediente("atun");
        s.settipopan("trigo");
        s.setprecio(29.99);
        
        System.out.println("engradiente: "+ s.getingredientes());
        System.out.println("tipo de pan: "+ s.gettipopan());
        System.out.println("precio: " + s.getprecio());        
    }
    
}
