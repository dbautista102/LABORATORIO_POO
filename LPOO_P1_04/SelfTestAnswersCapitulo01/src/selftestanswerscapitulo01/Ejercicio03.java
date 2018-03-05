/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selftestanswerscapitulo01;

/**
 *
 * @author bautista
 */
    class Voop {
        public static void main(String[] args) {
        doStuff(1);
        doStuff(1,2);
        
    }
        static void doStuff(int doArgs) { 
            System.out.println("Con el primer metodo: "+doArgs);
        }
        static void doStuff(int x, int doArgs) { 
        System.out.println("Con el segundo metodo: "+doArgs +"  "+ x);}
    }
/*Which, inserted independently at line 6, will compile? (Choose all that apply.)
 A. static void doStuff(int... doArgs) { }
 B. static void doStuff(int[] doArgs) { }
 C. static void doStuff(int doArgs...) { }
 D. static void doStuff(int... doArgs, int y) { }
 E. static void doStuff(int x, int... doArgs) { }
Respuesta A Y E
*/