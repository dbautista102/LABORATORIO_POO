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
public class Painting {
    private String titulo;
    private String artista;
    private String medio;
    private double precio;
    
    public Painting(){
        titulo = "tit";
        artista = "art";
        medio = "mes";
        precio = 100.0;
    }
    
    public double comision(){
        double com = precio*0.2;
        return com;
    }
    
    public void setTitulo(String t){
        this.titulo = t;
    }
    
    public void setArtista(String a){
        this.artista = a;
    }
    
    public void setMedio(String m){
        this.medio = m;
    }
    
    public void setPrecio(double p){
        this.precio =p;
    }
    
    public String getTitulo(){
        return this.titulo;
    }
    
    public String getArtista(){
        return this.artista;
    }
    
    public String getMedio(){
        return this.medio;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    
}