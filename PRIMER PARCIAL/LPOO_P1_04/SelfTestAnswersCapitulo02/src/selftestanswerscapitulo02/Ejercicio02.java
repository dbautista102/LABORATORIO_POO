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

class Top {
 public Top(String s) { System.out.print("B"); }
}
    public class Ejercicio02 extends Top {
    
    
    public static void main(String [] args) {
    new Ejercicio02("C");
    System.out.println(" ");
}

    public Ejercicio02(String s) {
        super(s);
    }
}


/*
What is the result?
 A. BD
 B. DB
 C. BDC
 D. DBC
 E. Compilation fails
Respuesta E

La llamada super () implícita en el constructor de Bottom2 no se puede satisfacer porque
no hay un constructor no-arg en la parte superior. Un constructor predeterminado, no-arg es generado por el
compilador solo si la clase no tiene un constructor definido explícitamente.
Pero si lo componemos la RESPUESTA ES B
*/