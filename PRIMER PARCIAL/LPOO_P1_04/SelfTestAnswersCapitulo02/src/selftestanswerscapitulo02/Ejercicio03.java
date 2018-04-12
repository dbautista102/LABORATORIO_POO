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

class Clidder {
 private final void flipper() { System.out.println("Clidder"); }
}
public class Ejercicio03 extends Clidder {
 public final void flipper() { System.out.println("Clidlet"); }
 public static void main(String [] args) {
 new Ejercicio03().flipper();
} }

/*
What is the result?
 A. Clidlet
 B. Clidder
 C.Clidder
Clidlet
 D.Clidlet
Clidder
 E. Compilation fails
RESPUESTA A
*/