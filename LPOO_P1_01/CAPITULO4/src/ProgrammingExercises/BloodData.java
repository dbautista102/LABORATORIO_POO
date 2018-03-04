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
public class BloodData {
    private String BloodType;
    private char RhFactor;

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public void setRhFactor(char RhFactor) {
        this.RhFactor = RhFactor;
    }

    public String getBloodType() {
        return BloodType;
    }

    public char getRhFactor() {
        return RhFactor;
    }
    public BloodData(){
        this.BloodType="O";
        this.RhFactor='+';
    }
    public BloodData(String BloodType, char RhFactor) {
        this.BloodType = BloodType;
        this.RhFactor = RhFactor;
    }
}
