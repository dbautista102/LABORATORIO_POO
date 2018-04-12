/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Case_Problems;

/**
 *
 * @author bautista
 */
import java.util.Scanner;
public class Ejercicio01 {
    private static String NEvent;
    private static int numberOfGuest;
    private static String NEvent1;
    private static int numberOfGuest1;
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the event number");
        NEvent=in.nextLine();
        System.out.println("Enter the number of guest");
        numberOfGuest=in.nextInt();
        in.nextLine();
        System.out.println("Enter the event number 2");
        NEvent1=in.nextLine();
        System.out.println("Enter the number of guest 2");
        numberOfGuest1=in.nextInt();
        in.nextLine();
        Event object1 = new Event(NEvent, numberOfGuest);
        object1.display(numberOfGuest);
        Event object2 = new Event(NEvent1, numberOfGuest1);
        object2.display(numberOfGuest1);
        compare (numberOfGuest, numberOfGuest1);
        
    }
    public static void compare(int x, int y){
        Ejercicio01 prueba = new Ejercicio01();
        if(x==y){
            System.out.println("The events are same "+ prueba.NEvent+ "and "+prueba.NEvent1+" and the number of guests are "+ x);
        }else if(x>y){
            System.out.println("The Larger event is"+ prueba.NEvent+  "and the number of guests are "+ x);
        }else {
            System.out.println("The Larger event is "+ prueba.NEvent1+ " and the number of guests are "+ y);
        }
    }
        
    }
