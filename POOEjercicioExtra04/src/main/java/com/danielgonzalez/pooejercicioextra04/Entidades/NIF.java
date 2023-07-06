/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra04.Entidades;

/**
 *
 * @author danielgonzalez
 */
public class NIF {

    private long DNI;
    private char letra;

    public NIF() {

    }

    public NIF(long dNI, char letra) {
        this.DNI = dNI;
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long dNI) {
        DNI = dNI;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

}
