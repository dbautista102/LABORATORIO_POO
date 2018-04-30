/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import static Model.Orientation.Colinear;

/**
 *
 * @author bautista
 */
public class Linea {
    private Punto inicio;
    private Punto fin;
    
    public Linea(Punto inicio, Punto fin){
        this.inicio = inicio;
        this.fin = fin;
    }
 public Integer maxX(){
        if(inicio.getX()>=fin.getX())
            return inicio.getX();
        else
            return fin.getX();
    }
    
    public Integer minX(){
        if(inicio.getX()<=fin.getX())
            return inicio.getX();
        else
            return fin.getX();
    }
    
    public Integer maxY(){
        if(inicio.getY()>=fin.getY())
            return inicio.getY();
        else
            return fin.getY();
    }
    
    public Integer minY(){
        if(inicio.getY()<=fin.getY())
            return inicio.getY();
        else
            return fin.getY();
    }

    public Punto getInicio() {
        return inicio;
    }

    public Punto getFin() {
        return fin;
    }
    
   
    public boolean punto(Punto p){
        if (p.getX() <= this.maxX() && p.getX() >= this.minX() &&
            p.getY() <= this.maxY() && p.getY() >= this.minY())
                return true;
        
         return false;
    }
    
    public boolean interseccion(Linea s1, Linea s2){
        //general case
        Orientation d1 = s2.getInicio().calculateOrientation(s1, s2.getInicio()); 
        Orientation d2 = s2.getFin().calculateOrientation(s1, s2.getFin()); 
        Orientation d3 = s1.getInicio().calculateOrientation(s2, s1.getInicio()); 
        Orientation d4 = s1.getFin().calculateOrientation(s2, s1.getFin()); 
        
       
        if(d1!=d2 && d3!=d4)
            return true;
       
        if (d1 == Colinear && s1.punto(s2.getInicio())) return true;

       if (d2 == Colinear && s1.punto(s2.getInicio())) return true;

        if (d3 == Colinear && s1.punto(s2.getInicio())) return true;

         if (d4 == Colinear && s1.punto(s2.getInicio())) return true;
         
        return false; 
        
    }
}
