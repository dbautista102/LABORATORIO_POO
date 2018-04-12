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
public class Services {
    private String description;
	private Double price;
	private Integer minutes; 
	public Services (String descri, Double price, Integer minu) {
		this.description = descri;
		this.price = price;
		this.minutes = minu;
	}
	public String getDes() {
		return description;
	}
	public Double getPrice() {
		return price;
	}
	public Integer getMinu() {
		return minutes;
	}

}
