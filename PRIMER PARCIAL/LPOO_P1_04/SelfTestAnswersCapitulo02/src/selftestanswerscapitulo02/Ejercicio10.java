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

public class Ejercicio10 extends Singer {
public static String sing() { return "fa"; }
public static void main(String[] args) {
Ejercicio10 t = new Ejercicio10();
Singer s = new Ejercicio10();
System.out.println(t.sing() + " " + s.sing());
}
}
class Singer { public static String sing() { return "la"; } }

/*
What is the result?
 A. fa fa
 B. fa la
 C. la la
 D. Compilation fails
 E. An exception is thrown at runtime
RESPUESTA B fa la
*/