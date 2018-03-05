/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selftestanswerscapitulo01;

/**
 *
 * @author bautista
 */

public class Ejercicio09 extends Hobbit {
 public static void main(String[] args) {
 Short myGold = 7;
 System.out.println(countGold(myGold, 6));
 }
 }
class Hobbit {
  int countGold(int x, int y) { return x + y; }
}

/*
What is the result?
 A. 13
 B. Compilation fails due to multiple errors
 C. Compilation fails due to an error on line 6
 D. Compilation fails due to an error on line 7
 E. Compilation fails due to an error on line 11
Respuesta D
*/