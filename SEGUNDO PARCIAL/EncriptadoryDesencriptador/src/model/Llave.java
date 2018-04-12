/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Usuario
 */
public class Llave<T> {
    private Nodo<T> Ini;
    
    public void insertar(T dato) {
        Nodo<T> nuevo = new Nodo(dato, true);
        if (this.Ini == null) {
            this.Ini = nuevo;
        } else {
            Nodo<T> aux = Ini;
            while (aux.getSig() != this.Ini) {
                aux = aux.getSig();
            }
            aux.setSig(nuevo);
            nuevo.setSig(this.Ini);
        }
    }

    public Nodo<T> getIni() {
        return Ini;
    }
    
    @Override
    public String toString() {
        Nodo<T> aux = this.Ini;
        String Result = "";
        while(aux.getSig() != this.Ini) {
            Result += String.valueOf(aux.getData());
            aux = aux.getSig();
        }
        Result += String.valueOf(aux.getData());
        return Result;
    }
}
