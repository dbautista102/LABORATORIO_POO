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
public class Ejercicio06 {
    
    String[] largas = new String[20];
    String[] cortas  =new String[20];
    int i1=0, j1=0;
    
    public void setString(String cadena){
        
        if(cadena.length()<=5){
            cortas[i1]=cadena;
            i1++;
        }
        else{
            largas[j1]=cadena;
            j1++;
        }
    }
    
    public void getCortas (){
        int i=0;
        if(cortas[i]==null){
            System.out.println("lista vacia");
        }
        else{
            while(i<20){
                if(cortas[i]!=null){
                    System.out.println(cortas[i]);
                    i++;
                }else{
                    i=20;
                }
            }
        }        
    }
    
    public void getLargaS (){
       int i=0;
        if(largas[i]==null){
            System.out.println("lista vacia");
        }
        else{
            while(i<20){
                if(largas[i]!=null){
                    System.out.println(largas[i]);
                    i++;
                }else{
                    i=20;
                }
            }
        }   
    }
    
    public void opcion(Integer opc){
        switch(opc){
            case 1:
                System.out.println("cadenas cortas:");
                this.getCortas();
                break;
            case 2:
                System.out.println("cadenas largas:");
                this.getLargaS();
                break;
        }
    }
    
    public void menu(){
        System.out.println("seleccione el numero de opcion: \n1.- palabraS cortas\n2.- palabras largas");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos  = new Scanner(System.in);
        // TODO code application logic here
        Ejercicio06 d = new Ejercicio06();
        for(int i=0;i<20;i++){
            System.out.println("dadena "+(i+1)+": ");
            String cadena = datos.nextLine();
            d.setString(cadena);
        }
        d.menu();
        int opc = datos.nextInt();
        d.opcion(opc);
        
    }
    
}
