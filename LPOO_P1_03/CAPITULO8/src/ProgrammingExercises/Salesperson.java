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
public class Salesperson {
    private Integer noidentificacion;
    private double ventas;
    
    public Salesperson(Integer noi, double ventas){
        this.noidentificacion = noi;
        this.ventas = ventas;
    }
    
    public void setNoIdentificacion(Integer noi){
        this.noidentificacion = noi;
    }
    
    public void setVentas(double ventas){
        this.ventas = ventas;
    }
    
    public Integer getNoIdentificacion(){
        return this.noidentificacion;
    }
    
    public double getVentas(){
        return this.ventas;
    }
}
