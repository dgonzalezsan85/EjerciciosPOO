/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra06.Entidades;

/**
 *
 * @author danielgonzalez
 */
public class Ahorcado {

    private String[] palabra;
    private int letrasEncontradas;
    private int maxJugadas;

    public Ahorcado() {

    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int maxJugadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.maxJugadas = maxJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public int getMaxJugadas() {
        return maxJugadas;
    }

    public void setMaxJugadas(int maxJugadas) {
        this.maxJugadas = maxJugadas;
    }

}
