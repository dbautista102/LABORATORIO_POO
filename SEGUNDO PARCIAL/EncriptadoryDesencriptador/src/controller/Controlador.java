/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.File;
import java.io.IOException;
import model.*;

/**
 *
 * @author bautista
 */
public class Controlador {
    private Files gestor;
    private Llave<Character> llave;
    
    public Controlador() {
        this.llave = new Llave<Character>();
    }
    
    public void seleccionarArchivo(String ruta) {
        this.gestor = new Files(ruta);
    }
    public void setLlave(String llave) {
        for (int i = 0; i < llave.length(); i++) {
            this.llave.insertar(llave.charAt(i));
        }
    }
    public void setLlave(Llave<Character> llave) {
        this.llave = llave;
    }
    
    

    public Files getGestor() {
        return gestor;
    }

    public Llave<Character> getLlave() {
        return llave;
    }
    
    

    public void encriptar() throws IOException {
        this.gestor.leer();
        
        List<Integer> archivo = this.gestor.getFile();
        Nodo<Character> aux = llave.getIni();
        int valor = 0;
        Nodo<Integer> nAux = archivo.getInicio();
        while (nAux != null) {
            valor = nAux.getData()+(int)aux.getData();
            if(valor>255){
                valor -= 255;
            }
            nAux.setData(valor);
            aux = aux.getSig();
            nAux = nAux.getSig();
        }
       
        this.gestor.escribir();
    }
    
    public void desencriptar() throws IOException {
        this.gestor.leer();
        List<Integer> archivo = this.gestor.getFile();
        Nodo<Character> aux = llave.getIni();
        int valor = 0;
        Nodo<Integer> nAux = archivo.getInicio();
        while (nAux != null) {
            valor = nAux.getData()-(int)aux.getData();
            if(valor<0){
                valor += 255;
            }
            nAux.setData(valor);
            aux = aux.getSig();
            nAux = nAux.getSig();
        }
        this.gestor.escribir();
    }
}
    