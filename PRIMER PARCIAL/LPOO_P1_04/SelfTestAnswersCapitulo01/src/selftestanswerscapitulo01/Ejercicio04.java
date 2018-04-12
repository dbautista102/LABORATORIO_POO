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
    enum Animals {
    DOG("woof"), CAT("meow"), FISH("burble");
    String sound;
    Animals(String s) { sound = s; }
    }
    class TestEnum {
        static Animals a;
        public static void main(String [] args) {
            System.out.println(a.DOG.sound + " " + a.FISH.sound);
        }
    }

/*What is the result?
 A. woof burble
 B. Multiple compilation errors
 C. Compilation fails due to an error on line 2
 D. Compilation fails due to an error on line 3
 E. Compilation fails due to an error on line 4
 F. Compilation fails due to an error on line 9
RESPUESTA A
*/