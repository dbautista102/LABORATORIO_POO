/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;


/**
 *
 * @author bautista
 */
public class Ejercicio04 {

    public static void main(String[] args) {
     
        int n=1,n2=1,n3=1,n4=1,n5=1,n6=1,n7=1,n8=1,n9=1,n10=1;
        for(int i=1;i<=10;i++){
            switch(i){
                case 1:
                    n*=i;
                case 2:
                    n2*=i;
                case 3:
                    n3*=i;
                case 4:
                    n4*=i;
                case 5:
                    n5*=i;
                case 6:
                    n6*=i;
                case 7:
                    n7*=i;
                case 8:
                    n8*=i;
                case 9:
                    n9*=i;
                case 10:
                    n10*=i;
            }
        }
        System.out.println("Factorial 1: "+n+"\nFactorial 2: "+n2+"\nFactorial 3: "+n3+"\nFactorial 4: "
                +n4+"\nFactorial 5: "+n5+"\nFactorial 6: "+n6+"\nFactorial 7: "+n7+"\nFactorial 8: "+n8
                +"\nFactorial 9: "+n9+"\nFactorial 10: "+n10);
    }
    
}
