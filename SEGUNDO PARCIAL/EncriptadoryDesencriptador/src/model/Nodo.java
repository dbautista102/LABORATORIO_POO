/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author bautista
 */
public class Nodo<T> {
    private T data;
    private Nodo<T> sig;
    
    public Nodo(T dato, boolean circular){
        this.data = dato;
        if(circular) {
            this.sig = this;
        } else {
            this.sig = null;
        }
    }
    public void setData(T data) {
        this.data = data;
    }

    public Nodo<T> getSig() {
        return sig;
    }


    public T getData() {
        return data;
    }

    public void setSig(Nodo<T> sig) {
        this.sig = sig;
    }
    
    
}
