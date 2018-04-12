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
class Dims {
 public static void main(String[] args) {
 int[][] a = {{1,2,}, {3,4}};
 int[] b = (int[]) a[1];
 Object o1 = a;
 int[][] a2 = (int[][]) o1;
 // linea eliminada int[] b2 = (int[]) o1;
 System.out.println(b[1]);
 } }
/*
What is the result?
 A.2
 B. 4
 C. An exception is thrown at runtime
 D. Compilation fails due to an error on line 4
 E. Compilation fails due to an error on line 5
 F. Compilation fails due to an error on line 6
 G. Compilation fails due to an error on line 7
RESPUESTA ES C HAY UNA EXCEPCION pero si se elimna la linea 7 la salida es 4
*/