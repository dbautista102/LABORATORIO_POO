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
public class List<T extends Comparable<T>> {
    private Nodo<T> Ini;
    
    public List(){
        this.Ini = null;
    }
    
    
    public void insertarFinal(Comparable<T> e) {
        Nodo nodo = new Nodo(e, false);
        if (Ini == null) {
            Ini = nodo;
        } else {
            Nodo aux = Ini;
            while(aux.getSig() != null) {
                aux = aux.getSig();
            }
            aux.setSig(nodo);
        }
    }
    
    public void InInicio(Comparable<T> e) {
        Nodo nodo = new Nodo(e, false);
        if (Ini == null) {
            Ini = nodo;
        } else {
            nodo.setSig(Ini);
            Ini = nodo;
        }
    }
    public void mostrar(){
        Nodo aux = Ini;
        while (aux != null) {
            System.out.println(aux.getData());
            aux = aux.getSig();
        }
    }
    
    public void Ordenado(Comparable<T> e) {
        Nodo<T> nodo = new Nodo(e, false);
        if (Ini == null) {
            Ini = nodo;
        } else {
            Nodo<T> auxiliar = Ini;
            if (auxiliar.getData().compareTo(nodo.getData())>0){
                nodo.setSig(Ini);
                Ini = nodo;
            } else {
                Nodo anterior = null;
                while(auxiliar != null && nodo.getData().compareTo(auxiliar.getData())>0) {
                    anterior = auxiliar;
                    auxiliar = auxiliar.getSig();
                }
                nodo.setSig(auxiliar);
                anterior.setSig(nodo);
            }
        }
    }

    public Nodo<T> getInicio() {
        return  Ini;
    }
    
    
}
