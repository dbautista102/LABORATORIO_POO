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
public class Sandwitch {
    private Bread bread;
    private SandwichFilling sandwichFilling;
    
    public Sandwitch(String type, int calories, String fillings, int cals) {
        bread = new Bread(type, calories);
        sandwichFilling = new SandwichFilling(fillings, cals);
    }
    
    public String getType() {
        return bread.getType();
    }
    public Integer getCalories() {
        return bread.getCalories();
    }
    public Integer getCalories1() {
        return sandwichFilling.getCalories();
    }
    public String getType1() {
        return sandwichFilling.getType();
    }

}
