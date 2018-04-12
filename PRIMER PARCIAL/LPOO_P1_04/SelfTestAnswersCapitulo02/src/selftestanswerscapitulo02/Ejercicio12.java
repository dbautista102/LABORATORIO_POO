/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selftestanswerscapitulo02;

/**
 *
 * @author bautista
 */

class Building {
Building() { System.out.print("b "); }
Building(String name) {
 this(); System.out.print("bn " + name);
 }
 }
 public class Ejercicio12 extends Building {
Ejercicio12() { System.out.print("h "); }
Ejercicio12(String name) {
this(); System.out.print("hn " + name);
}
public static void main(String[] args) { new Ejercicio12("x "); }
}
/*
What is the result?
 A. h hn x
 B. hn x h
 C. b h hn x
 D. b hn x h
 E. bn x h hn x
 F. b bn x h hn x
 G. bn x b h hn x
 H. Compilation fails


RESPUESTA C
*/