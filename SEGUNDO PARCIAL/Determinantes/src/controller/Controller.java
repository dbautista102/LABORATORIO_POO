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
    
    private int[][] getSubmatriz(int[][] matriz, int posX, int posY) {
        int size = matriz.length - 1;
        int[][] result = new int[size][size];
        int x = 0, y = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if (i != posX) {
                    if (j != posY) {
                        result[y][x] = matriz[i][j];                        
                        x++;
                    }
                    if (x == size) {
                        x = 0;
                        y++;
                    }
                }
            }
        }
        return result;
    }
    
    public int calcularDeterminante() {
        return this.calcularDeterminante(this.array);
    }
    
    private int calcularDeterminante(int[][] original) {
        boolean signo = true;
        int resultado = 0;
        if(original.length == 1){
            return original[0][0];
        } else {
            for (int i = 0; i < original.length; i++) {
                if(signo) {
                    resultado += original[0][i] * this.calcularDeterminante(this.getSubmatriz(original, 0, i));
                } else {
                    resultado -= original[0][i] * this.calcularDeterminante(this.getSubmatriz(original, 0, i));
                }
                signo = !signo;
            }
            return resultado;
        }
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

