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

public class Ejercicio08 {
 public enum Days { MON, TUE, WED };
 public static void main(String[] args) {
 for(Days d : Days.values() )
;
 Days [] d2 = Days.values();
System.out.println(d2[2]);
}
}
/*
What is the result? (Choose all that apply.)
 A. TUE
 B. WED
 C. The output is unpredictable
 D. Compilation fails due to an error on line 4
 E. Compilation fails due to an error on line 6
 F. Compilation fails due to an error on line 8
 G. Compilation fails due to an error on line 9
    Repuesta B
*/