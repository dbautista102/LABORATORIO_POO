
package selftestanswerscapitulo01;

/**
 *
 * @author bautista
 */


public class   Ejercicio01{
    public static void main(String[] args) {
       
    
    Padre p = new Padre(5);
    Hijo n = new Hijo();
    p.metodo01();//A
    n.metodo01();//B

   

    }
}



/*Which is true? (Choose all that apply.)
 A. "X extends Y" is correct if and only if X is a class and Y is an interface
 B. "X extends Y" is correct if and only if X is an interface and Y is a class
 C. "X extends Y" is correct if X and Y are either both classes or both interfaces
 D. "X extends Y" is correct for all combinations of X and Y being classes and/or interfaces

ANSWER C.
*/