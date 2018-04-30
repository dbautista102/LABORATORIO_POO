/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author bautista
 */
public class Punto {
    private Integer x;
    private Integer y;

    public Punto(Integer x, Integer y){
        this.x = x;
        this.y = y;
    }
    
    public Integer getX() {
        return x;
    }

    public Integer getY() {
        return y;
    }
    
    public Orientation calculateOrientation(Punto p1, Punto p2, Punto p3){
        int result = (p2.getY() - p1.getY()) * (p3.getX() - p2.getX()) - (p2.getX() - p1.getX()) * (p3.getY() - p2.getY());
        

        if(result==0) return Orientation.Colinear;
        

        return (result > 0)? Orientation.Clockwise: Orientation.CounterClockwise; 
    }
    
    public Orientation calculateOrientation(Linea s, Punto p3){
        Punto p1 = s.getInicio();
        Punto p2 = s.getFin();
        return calculateOrientation(p1,p2,p3);
    }
    
}
