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
public class Student {
    private Integer numcontrol;
    private Integer horasgan;
    private Integer puntos;
    
    public Student(){
        numcontrol = 9999;
        puntos = 12;
        horasgan = 3;
    }
    
    public void setNumcontrol (Integer num){
        this.numcontrol = num;
    }
    
    public void setHorasgan (Integer horas){
        this.horasgan = horas;
    }
    
    public void setPuntos (Integer puntos){
        this.puntos = puntos;
    }
    
    public double promedio (){
        double promedio;
        promedio = this.puntos/this.horasgan;
        return promedio;
    }
    
    public Integer getNumcontrol (){
        return this.numcontrol;
    }
    
    public int getHorasgan(){
        return this.horasgan;
    }
    
    public int getPuntos(){
        return this.puntos;
    }
}
