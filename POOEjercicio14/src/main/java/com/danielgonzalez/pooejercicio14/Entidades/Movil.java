/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio14.Entidades;

/**
 *
 * @author danielgonzalez
 */
public class Movil {

    private String marca, modelo;
    private double precio, memoriaRAM, almacenamiento;
    private int[] codigo;

    public Movil() {
    }

    public Movil(String marca, String modelo, double precio, double memoriaRAM, double almacenamiento, int[] codigo) {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(double memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

}
