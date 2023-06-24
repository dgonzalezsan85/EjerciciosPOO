/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio08.Entidades;

/**
 *
 * @author danielgonzalez
 */
public class Cadena {
    
    private String frase;
    private int longitudF;
    
    public Cadena() {
    }

    public Cadena(String frase, int longitudF) {
        this.frase = frase;
        this.longitudF = longitudF;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getlongitudF() {
        return longitudF;
    }

    public void setlongitudF(int longitudF) {
        this.longitudF = longitudF;
    }

    @Override
    public String toString() {
        return "Cadena [frase=" + frase + ", longitud=" + longitudF + "]";
    }

    
    
}
