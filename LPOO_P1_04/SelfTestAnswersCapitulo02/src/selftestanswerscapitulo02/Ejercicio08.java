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

class Dog {
public void bark() { System.out.print("woof "); }
}
class Hound extends Dog {
public void sniff() { System.out.print("sniff "); }

public void bark() { System.out.print("howl "); }
}
public class Ejercicio08 {
public static void main(String[] args) { new Ejercicio08().go(); }
void go() {
new Hound().bark();
((Dog) new Hound()).bark();

}
}

/*
What is the result? (Choose all that apply.)
 A. howl howl sniff
 B. howl woof sniff
 C. howl howl followed by an exception
 D. howl woof followed by an exception
 E. Compilation fails with an error at line 14
 F. Compilation fails with an error at line 15


RESPUESTA F, pero si componemos el codigo el resultado sera howl howl
*/