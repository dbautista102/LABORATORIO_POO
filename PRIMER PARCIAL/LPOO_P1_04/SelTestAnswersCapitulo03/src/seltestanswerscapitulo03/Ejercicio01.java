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

class CardBoard {
 Short story = 200;
 CardBoard go(CardBoard cb) {
 cb = null;
 return cb;
 }
 public static void main(String[] args) {
 CardBoard c1 = new CardBoard();
 CardBoard c2 = new CardBoard();
 CardBoard c3 = c1.go(c2);
 c1 = null;
 // do Stuff
} }

/*
When // doStuff is reached, how many objects are eligible for GC?
 A. 0
 B. 1
 C. 2
 D. Compilation fails
 E. It is not possible to know
 F. An exception is thrown at runtime
RESPUESTA C ya que Solo un objeto CardBoard (c1) es elegible, pero tiene un Short asociado
objeto envoltorio que también es elegible.
*/