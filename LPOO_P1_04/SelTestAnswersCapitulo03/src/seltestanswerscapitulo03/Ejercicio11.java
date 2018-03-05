/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package seltestanswerscapitulo03;

/**
 *
 * @author bautista
 */

class Beta { }
 class Alpha {
 static Beta b1;
 Beta b2;
 }
 public class Ejercicio11 {
 public static void main(String[] args) {
 Beta b1 = new Beta(); Beta b2 = new Beta();
 Alpha a1 = new Alpha(); Alpha a2 = new Alpha();
 a1.b1 = b1;
 a1.b2 = b1;
 a2.b2 = b2;
 a1 = null; b1 = null; b2 = null;
 // do stuff
}
}
/*
When line 16 is reached, how many objects will be eligible for garbage collection?
 A. 0
 B. 1
 C. 2
 D. 3
 E. 4
 F. 5
RESPUESTA B

*/