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
public class Bread {
    private String type;
    private Integer calories;
    public static final  String MOTTO= "The staff of life";
    public String getType() {
        return type;
    }

    public Integer getCalories() {
        return calories;
    }

    public Bread(String type, Integer calories) {
        this.type = type;
        this.calories = calories;
    }
}
