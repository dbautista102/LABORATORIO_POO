/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poligonos;

import modelo.Linea;
import modelo.Punto;

/**
 *
 * @author bautista
 */
public class Poligonos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
      
      Linea l1 = new Linea (2,2,3,7);
      Linea l2 = new Linea (-5,6,-9,1);
      System.out.println(l1);
      System.out.println(l2);
      //System.out.println(l2.orientacion(p1));
      
        System.out.println("SE INTERSECTAN ?? : "+l1.Interseccion(l2));
    
    }
    
}
