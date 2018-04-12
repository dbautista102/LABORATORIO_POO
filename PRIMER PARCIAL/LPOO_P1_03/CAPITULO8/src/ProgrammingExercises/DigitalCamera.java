/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;

/**
 *
 * @author bautista
 */
public class DigitalCamera {
    private String marca;
  private int resol;
  private int precio;
  
  public DigitalCamera(String mar, int resolu)
  {
    marca = mar;
    if (resol > 10)
      resol = 10;
    else 
      resol = resolu;
    if (resol < 6)
      precio = 99;
    else 
      precio = 129;
  }  
  public void displayDigitalCamera() 
  {
    System.out.println("marca: " + marca
      + "\nresolucion is " + resol 
      + "\nprecio $" + precio);
  }
}

