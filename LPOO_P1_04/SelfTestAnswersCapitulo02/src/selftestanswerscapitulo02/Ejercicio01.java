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
public class Ejercicio01 {
 public abstract interface Frobnicate { public void twiddle(String s); }
 //CLASE DE LA RESPUESTA B
 public abstract class Frob implements Frobnicate { }
 
}

//CLASE DE LA RESPUESTA E
class Frob implements Ejercicio01.Frobnicate {
 public void twiddle(String i) { }
 public void twiddle(Integer s) { }
 }
/*
Which is a correct class? 
RESPUESTA B Y E
*/
