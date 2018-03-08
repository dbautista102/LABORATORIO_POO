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
	private Double radius;
	private Double diameter;
	private Double area;
	public Circle() {
		radius = 1.0;
		diameter = radius*2;
		area = Math.PI*Math.pow(radius, 2.0); 
	}
	public Double getRadius() {
		return radius;
	}
	public Double getDiameter() {
		return diameter;
	}
	public Double getArea() {
		return area;
	}
	public void setRadius(Double radio) {
		radius = radio;
		diameter = radius*2;
		area = Math.PI*Math.pow(radius, 2.0); 
	}
}

