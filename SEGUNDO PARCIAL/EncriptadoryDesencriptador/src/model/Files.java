/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.*;

/**
 *
 * @author bautista
 */
public class Files {
    
    private FileInputStream input;
    private FileOutputStream output;
    private List<Integer> file;
    private File inputFile;
    
    public Files(String path) {
        this.inputFile = new File(path);
        this.file = new List();
    }
    
    
    public void escribir() throws FileNotFoundException, IOException {
        String nombre = this.inputFile.getAbsolutePath();
        this.inputFile.delete();
        this.inputFile = new File(nombre);
        this.output = new FileOutputStream(inputFile);
        Nodo<Integer> aux = this.file.getInicio();
        while(aux != null){
            Integer b = aux.getData();
            this.output.write(b);
            aux = aux.getSig();
        }
        this.output.close();
    }
    
    public void leer() throws FileNotFoundException, IOException{
        this.input = new FileInputStream(inputFile);
        while(input.available()>0) {
            this.file.insertarFinal(input.read());
        }
        this.input.close();
    }
    
    public boolean Comparar(File file) throws IOException {
        int a = 0;
        int b = 0;
        boolean bandera = true;
        Llave<Character> llave = new Llave();
        llave.insertar('K');
        llave.insertar('E');
        llave.insertar('Y');
        Nodo<Character> aux = llave.getIni();
        FileInputStream nStream = new FileInputStream(file);
        this.input = new FileInputStream(inputFile);
        char c = 0;
        int d = 0;
        int e = 0;
        int f =0;
        while(input.available()>0 && nStream.available()>0) {
            a = this.input.read();
            b = nStream.read();
            c = aux.getData();
            d = (int)aux.getData();
            e = b+d;
            f = e-d;
            
            System.out.println(String.format("%d   %d   %s   %d   %d   %d", a,b,c,d,e,f));
            if( a == b) {
                bandera = true;
            } else {
                bandera = false;
            }
            aux = aux.getSig();
        }
        input.close();
        nStream.close();
        return bandera;
    }

    public List<Integer> getFile() {
        return file;
    }

    public File getInputFile() {
        return inputFile;
    }
    
    
}
