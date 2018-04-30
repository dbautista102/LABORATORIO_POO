/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Punto;
import Model.Poligono;
import Model.Linea;

/**
 *
 * @author bautista
 */
public class Main {
    public static void main(String[] args) {

        
        Integer lados = 3;
        
        Integer x = 7; 
        Integer y = -2;
        
        Punto punto = new Punto(x,y);
        
        Punto[] vertice = new Punto[lados];
        
        Integer[] xS = {6,-4,3};
        Integer[] yS = {5,-3,7};
        
        for(int i=0; i<lados; i++){
            vertice[i] = new Punto(xS[i], yS[i]);
        }
        
        Poligono poligono = new Poligono(vertice);
        
        if(poligono.adentro(punto)){
            System.out.println("Punto en el poligono");
        }else{
            System.out.println("Punto no en el poligono");
        }
            
    }
}
