/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

public class Ejercicio02 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int con = 0; 
        double total = 0;
        double prom = 0;
        final int QUIT = 99999;
        final int MAX = 10;
        double[] arr = new double[10];
        double uin;
    
        System.out.println("ingrese un numero de hasta "+ MAX + ", para salir ingrese 99999 >>");
        uin = sc.nextDouble();
        while ((uin == QUIT && con == 0) || uin != QUIT && con < 10) {
            if (uin == QUIT && con == 0){
                System.out.println("Error: tiene que ingresar al menos un numero ");
                System.out.println("Enter un numero de hasta "+ MAX + ", para salir ingrese 99999 >>");
                uin = sc.nextDouble();
            }
            if (uin != QUIT){
                arr[con] = uin;
                total += arr[con];
                System.out.println("Continue ingresando un numero de hasta "+ MAX + ", pa salir ingrese 99999");
                uin = sc.nextDouble();
                con++;
            } 
        } 
        prom = total / con;
        System.out.println("se ingreso: ");
        
        for (int i = 0; i < con; i++) {
        System.out.print(arr[i] + " distencia del promedio: " + Math.abs(prom - arr[i]));
        if (i != con - 1)
            System.out.print("\n");
        }
        System.out.println("\nThe el promedio de los numeros es: "+ prom);
    }
    
}
