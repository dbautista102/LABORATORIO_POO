/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProgrammingExercises;


public class Ejercicio05 {
    private int[] num = new int[8];
    
    public static void main(String[] args) {
        Ejercicio05 n = new Ejercicio05();
        n.setNumeros(1,-3,6,1,5,15,34,15);
        
        System.out.println("\t\t\tArreglo: ");
        for(int i=0;i<8;i++){
            System.out.print("["+n.getNumeros(i)+"]\t");
        }
        System.out.println("\n\t\t\tArreglo inverso: ");
        for(int i=7;i>=0;i--){
            System.out.print("["+n.getNumeros(i)+"]\t");
        }
        System.out.println("\n\nSuma: "+n.suma());
        System.out.println("Menores a 5: "); n.menorFive();
        System.out.println("\nNumero menor: ");n.menor();
        System.out.println("\nNumero mayor: ");n.mayor();
        System.out.println("\nPromedio: "+ n.promedio());
        System.out.println("Numeros mayores al promedio: ");n.mayorepromedio();
        System.out.println("\n\n\n");
    }
    
    public void setNumeros(Integer n1,Integer n2, Integer n3, Integer n4, Integer n5,Integer n6, Integer n7, Integer n8){
        this.num[0]=n1;
        this.num[1]=n2;
        this.num[2]=n3;
        this.num[3]=n4;
        this.num[4]=n5;
        this.num[5]=n6;
        this.num[6]=n7;
        this.num[7]=n8;
    }
    
    public int getNumeros(int i){
            return num[i];
    }
    
    public int suma(){
        Integer suma=0;
        for(int i = 0; i<8;i++){
            suma = suma+num[i];
        }
        return suma;
    }
    
    public void menorFive(){
        for(int i=0;i<8;i++){
            if(num[i]<5){
                System.out.print("["+num[i]+"]\t");
            }
        }
    }
    
    public void menor(){
        int menor = num[1];
        for(int i=0;i<8;i++){
            if(menor>num[i]){
                menor = num[i];
            }
        }
        System.out.print("["+menor+"]\t");
    }
    
    public void mayor(){
        int mayor = num[1];
        for(int i=0;i<8;i++){
            if(mayor<num[i]){
                mayor = num[i];
            }
        }
        System.out.print("["+mayor+"]\t");
    }
    
    public double promedio(){
        return (suma())/8.0;
    }
    
    public void mayorepromedio(){
        for(int i=0;i<8;i++){
            if(num[i]>promedio()){
                System.out.print("["+num[i]+"]\t");
            }
        }
    }
}
