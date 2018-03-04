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
public class Ejercicio08 {
     public static void main(String[] args) {
        Sandwitch t1 = new Sandwitch("rye", 1203, "Eggs with meat", 4562);
        System.out.println("Bread Type: "+t1.getType()+"\n Bread Calories: "+t1.getCalories()+"\n Sandwitch calories: "+t1.getCalories1()+"\n Sandwitch Type: "+t1.getType1()+"\n SubCalories "+(t1.getCalories()*2+t1.getCalories1())+"\n"+Bread.MOTTO);
        System.out.println();
        Sandwitch t2 = new Sandwitch("Nose que pner", 562, "Nose que poner", 910);
        System.out.println("Bread Type: "+t2.getType()+"\n Bread Calories: "+t2.getCalories()+"\n Sandwitch calories: "+t2.getCalories1()+"\n Sandwitch Type: "+t2.getType1()+"\n SubCalories "+(t2.getCalories()*2+t2.getCalories1())+"\n"+Bread.MOTTO);
        System.out.println();
        Sandwitch t3 = new Sandwitch("Otra vez", 5422, "Hi there", 9273);
        System.out.println("Bread Type: "+t3.getType()+"\n Bread Calories: "+t3.getCalories()+"\n Sandwitch calories: "+t3.getCalories1()+"\n Sandwitch Type: "+t3.getType1()+"\n SubCalories "+(t3.getCalories()*2+t3.getCalories1())+"\n"+Bread.MOTTO);
     
     
     }
}
