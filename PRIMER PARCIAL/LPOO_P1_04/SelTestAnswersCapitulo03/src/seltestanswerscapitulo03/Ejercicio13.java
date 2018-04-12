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

 public class Ejercicio13 {
  int x = 3;
  public static void main(String[] args) {
  new Ejercicio13().go1();
  }
  void go1() {
  int x = 0; //Se agrego esta linea de inicializacion de variable
  go2(++x);
 }
 void go2(int y) {
 int x = ++y;
 System.out.println(x);
 }
 }

/*
What is the result?
 A. 2
 B. 3
 C. 4
 D. 5
 E. Compilation fails
 F. An exception is thrown at runtime

RESPUESTA E, PERO INICIALIMOS LA VARIABLE Y DA UN RESULTADO DE 2
*/