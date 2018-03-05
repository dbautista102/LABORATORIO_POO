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

class Mixer {
 Mixer() { }
 Mixer(Mixer m) { m1 = m; }
 Mixer m1;
 public static void main(String[] args) {
 Mixer m2 = new Mixer();
 Mixer m3 = new Mixer(m2); m3.go();
 Mixer m4 = m3.m1; m4.go();
 Mixer m5 = m2.m1; m5.go();
 }
 void go() { System.out.print("hi "); }
}
/*
What is the result?
 A.hi
 B.hi hi
 C.hi hi hi
 D. Compilation fails
 E.hi, followed by an exception
 F.hi hi, followed by an exception

RESPUESTA ES F despues hay una excepcion porque el objeto
m2 instancia a m1 y nunca es inicializable su variable. asi que cuando
 m5 trata de usar la variable, hay una excepcion 
*/