package ProgrammingExercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bautista
 */
public class BirdSighting {
    private String specie;

    public String getSpecie() {
        return specie;
    }

    public Integer getNumber() {
        return number;
    }

    public Integer getDay() {
        return day;
    }
    private Integer number;
    private Integer day;

    public BirdSighting() {
        this.specie = "Robin";
        this.number = 1;
        this.day = 1;
    }
    public BirdSighting(String specie, Integer number, Integer day) {
        this.specie = specie;
        this.number = number;
        this.day = day;
    }
    
}
