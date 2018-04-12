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
public class Ejercicio06 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Bread Obj1 = new Bread("rye", 1203);
        System.out.println("Calories "+Obj1.getCalories()+" Type "+Obj1.getType()+"\n"+Bread.MOTTO);
        Bread Obj2 = new Bread("Integral", 1003);
        System.out.println("Calories "+Obj2.getCalories()+" Type "+Obj2.getType()+"\n"+Bread.MOTTO);
         Bread Obj3 = new Bread("Sweet", 1403);
        System.out.println("Calories "+Obj3.getCalories()+" Type "+Obj3.getType()+"\n"+Bread.MOTTO);
    }
    
}
