/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;


/**
 *
 * @author bautista
 */
public class Poligono {
    Integer lados;
    Punto[] vertice;
    Linea[] arista;
    
    public Poligono(Punto[] vertice){
        this.lados = vertice.length;
        this.vertice = new Punto[lados];
        this.arista = new Linea[lados];
        
        for(int i=0;i<lados;i++){
            this.vertice[i] = new Punto(vertice[i].getX(), vertice[i].getY());
        }
        
        for(int i=0;i<lados;i++){
            if(i == (lados-1)){
                arista[i] = new Linea(vertice[i], vertice[0]);
            }else{
                arista[i] = new Linea(vertice[i], vertice[i+1]);                 
            }
        }
        
    }
    
    public Integer getLados(){
        return lados;
    }
    
    public Punto getVertice(Integer n){
        return vertice[n];
    }
    
    public Linea getArista(Integer n){
        return arista[n];
    }
    
    public Integer getMaxX(){
        Integer[] xValues = new Integer[lados];
        
        for(int i=0;i<lados;i++){
            xValues[i] = vertice[i].getX();
        }
        xValues = this.ordenar(xValues);
        
        return xValues[lados-1];
    }
    
    public Integer[] ordenar(Integer[] list){
        
        if(list.length == 1)return list;
        
        Integer pivot = list[list.length - 1]; 
        Integer[] right;
        Integer[] left;
        
        Integer current = 0;
        Integer wall = 0;
        Integer aux;
 
        while(current < (list.length-1)){
            if(list[current] < pivot){
                aux = list[current];
                list[current] = list[wall];
                list[wall] = aux;
                wall++;
            }
            current++;
        }
                
       
        if(wall!=(list.length-1)){
            aux = list[current];
            list[current] = list[wall];
            list[wall] = aux;
            wall++;
        }
        
        int i=0;
        left = new Integer[wall];
        while(i<wall){
            left[i] = list[i];
            i++;
        }
        
        int k=0;
        right = new Integer[list.length-wall];
        
        while(i<list.length){
            right[k] = list[i];
            k++; 
            i++;
        }
        
        
        if(left.length!=0) left = ordenar(left);            
       
        if(right.length !=0 )right = ordenar(right);
                 
        i = 0;
        
        while(i < left.length){
            list[i] = left[i];
            i++;
        }
        k=0;
        while(i<list.length){//longitud
            list[i] = right[k];
            k++; 
            i++;
        }
  
        return list;
    }
    
    public boolean adentro(Punto punto){
        Punto puntoFinal = new Punto(this.getMaxX()+1, punto.getY());
        Linea horizontalLine = new Linea(punto, puntoFinal);
        int counter = 0;
        for(int i=0;i<lados;i++){
            if(punto.getX()==vertice[i].getX() && punto.getY()==vertice[i].getY())
                counter++;
        }
        if(counter>0) return true;
            
        counter = 0;

        for(int i=0;i<lados;i++){
            if(this.getArista(i).interseccion(this.getArista(i), horizontalLine))
                counter++;    
        }
        
        
        
        if(counter%2 == 0)
            return false;
        else 
            return true;
        
    }
}

