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


public class Hijo extends Padre{
public Hijo (){
   super(1);
}
public void metodo01(Integer x){ //sobrecarga

}
public void metodo01(){//Sobrescritura
	 System.out.println("ACCEDIENDO AL METODO DEL PADRE");
	//super.metodo01(); accede al del padre
}

}





