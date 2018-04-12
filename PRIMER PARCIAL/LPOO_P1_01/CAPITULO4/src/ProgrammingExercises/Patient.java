package ProgrammingExercises;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author bautista
 */
public class Patient {
     private Integer IdNumber;
     private char type;
     private char rh;
     private Integer Age;

    public Patient() {
        this.IdNumber = 0;
        this.type = 'O';
        this.rh = '-';
        this.Age = 0;
    }

    public Integer getIdNumber() {
        return IdNumber;
    }

    public char getType() {
        return type;
    }

    public char getRh() {
        return rh;
    }

    public Integer getAge() {
        return Age;
    }
     
    

}
