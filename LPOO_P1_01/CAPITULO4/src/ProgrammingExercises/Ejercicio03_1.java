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
public class Ejercicio03_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BirdSighting test1 = new BirdSighting();
        System. out .println("Especie: "+test1.getSpecie()+" Day "+ test1.getDay()+ " Number "+test1.getNumber());
        BirdSighting test2 = new BirdSighting("Cardo", 30, 31);
        System. out .println("Especie: "+test2.getSpecie()+" Day "+ test2.getDay()+ " Number "+test2.getNumber());
    }
    
}
