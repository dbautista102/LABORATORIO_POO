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

class Alien {
 String invade(short ships) { return "a few"; }
 String invade(short... ships) { return "many"; }
}
class Defender {
 public static void main(String [] args) {
 System.out.println(new Alien().invade()); //linea de error System.out.println(new Alien().invade(7))
} }

/*
What is the result?
 A.many
 B. a few
 C. Compilation fails
 D. The output is not predictable
 E. An exception is thrown at runtime
RESPUESTA C Hay un error de compilacion pero componiendolo la salida es many
*/