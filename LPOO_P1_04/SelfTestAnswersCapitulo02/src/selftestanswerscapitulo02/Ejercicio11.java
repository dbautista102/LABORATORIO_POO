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

class Alpha {
static String s = " ";
protected Alpha() { s += "alpha "; }
}
class SubAlpha extends Alpha {
private SubAlpha() { s += "sub "; }
}
public class Ejercicio11 extends Alpha {
private Ejercicio11() { s += "subsub "; }
public static void main(String[] args) {
new Ejercicio11();
System.out.println(s);
}
}
/*
What is the result?
 A. subsub
 B. sub subsub
 C. alpha subsub
 D. alpha sub subsub
 E. Compilation fails
 F. An exception is thrown at runtime

RESPUESTA C ALPHA SUBSUB
*/