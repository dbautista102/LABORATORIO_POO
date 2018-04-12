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

class X { void do1() { } }
class Y extends X { void do2() { } }

class Chrome {
public static void main(String [] args) {
 X x1 = new X();
 X x2 = new Y();
 Y y1 = new Y();
  ((Y)x2).do2(); // insert code here
 }
 }

/*
Which, inserted at line 9, will compile? (Choose all that apply.)
 A. x2.do2();
 B. (Y)x2.do2();
 C. ((Y)x2).do2();
 D. None of the above statements will compile


Respuesta C
*/