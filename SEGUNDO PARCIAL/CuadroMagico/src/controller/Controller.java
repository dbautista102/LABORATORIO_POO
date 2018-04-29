/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

/**
 *
 * @author bautista
 */
public class Controller {
    
    
    private int tamano;
    private int[][] array;
    
    public Controller() {
        
    }
    public Controller(int size) {
        this.tamano = size;
        this.array = new int[this.tamano][this.tamano];
    }
    
    public void setValor(int X, int Y, int n) {
        this.array[X][Y] = n;
    }
    
    

    public void setTamano(int tamano) {
        this.tamano = tamano;
        this.array = null;
        this.array = new int[this.tamano][this.tamano];
    }

    public void setArray(int[][] array) {
        this.array = array;
    }
}

