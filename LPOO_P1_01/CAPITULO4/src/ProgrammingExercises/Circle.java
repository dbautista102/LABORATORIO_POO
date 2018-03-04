package ProgrammingExercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.lang.Math;
/**
 *
 * @author bautista
 */
public class Circle {
    private Integer radious;

    public void setRadious(Integer radious) {
        this.radious = radious;
        this.diameter = this.radious*2;
        this.area = java.lang.Math.PI * this.radious * this.radious;
    }

    public Integer getRadious() {
        return radious;
    }
    private Integer diameter;
    private double area;

    public Circle() {
        this.radious = 1;

    }

   
    
    
}
