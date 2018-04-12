package Programming_Exercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author david
 */
public class Sandwich {

    private String ingredientes;
    private String tipopan;
    private double precio;
    
    public Sandwich(){
        ingredientes = "";
        tipopan = "";
        precio = 0;
    }
    
    public void setingrediente(String ingrediente){
        this.ingredientes= ingrediente;
    }
    
    public void settipopan(String tipopan){
        this.tipopan=tipopan;
    }
    
    public void setprecio(double precio){
        this.precio=precio;
    }
    
    public String getingredientes(){
        return this.ingredientes;
    }
    
    public String gettipopan(){
        return this.tipopan;
    }
    
    public double getprecio(){
        return this.precio;
    }   
}
