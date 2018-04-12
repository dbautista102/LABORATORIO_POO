package Programming_Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author david
 */
public class Ejercicio10_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Student p1 = new Student();
        p1.setNumcontrol(2345);
        p1.setHorasgan(3);
        p1.setPuntos(7);
        
        System.out.println("promedio: " + p1.promedio());
        System.out.println("numero de control: "+ p1.getNumcontrol());
        System.out.println("horas acreditadas: "+ p1.getHorasgan());
        System.out.println("puntos: "+ p1.getPuntos());
    }
    
}
