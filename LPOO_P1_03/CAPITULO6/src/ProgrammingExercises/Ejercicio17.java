/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

import java.util.Scanner;

/**
 *
 * @author bautista
 */
public class Ejercicio17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean condi = false;
        int yyyy;
        int idTra;
        int numTra = 0;
        int empleado = 0;
        int bendiciones = 0;
        int nH = 0;

        
        do{
            if (condi){
                System.out.println("Año entre 2013 y 2025.");
            }
            System.out.print("AÑO(2013-2025): ");
            yyyy = in.nextInt();
            condi = true;
        }while (yyyy < 2013 || yyyy > 2025);
        
        condi = false;
        do{
            if (condi){
                System.out.println("DATO entre 0 y 9999.");
            }
            System.out.print("Id  (0-9999): ");
            numTra = in.nextInt();
            condi = true;
        }while (numTra < 0 || numTra > 9999);

        condi = false;
        do{
            if (condi){
                System.out.println("Solo hay un rango de 1 a 3 en ID");
            }
            System.out.print("ID empleado (1-3): ");
            empleado = in.nextInt();
            condi = true;
        }while (empleado < 1 || empleado > 3);

        condi = false;
        do{
            if (condi){
                System.out.println("Son aceptados desde 1 a 9 ");
            }
            System.out.print("Numero de niños (1-9): ");
            bendiciones = in.nextInt();
            condi = true;
        }while (bendiciones < 1 || bendiciones > 9);

        condi = false;
        do{
            if (condi){
                System.out.println("Solo laboramos 12 horas");
            }
            System.out.print("Numero de horas (1-12): ");
            nH = in.nextInt();
            condi = true;
        }while (nH < 1 || nH > 12);

        

        idTra = BabysittingJob.nuevoidJob(yyyy,numTra);

        BabysittingJob prueba = new BabysittingJob(idTra, empleado, bendiciones, nH);
        prueba.resultados();
    }
    
}
