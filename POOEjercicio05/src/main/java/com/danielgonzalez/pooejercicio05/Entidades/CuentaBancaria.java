/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio05.Entidades;

/**
 *
 * @author danielgonzalez
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private long DNI;
    private int saldoActual;
    private double interes;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, long DNI, int saldoActual, double interes) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
        this.interes = interes;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public int getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    @Override
    public String toString() {
        return "CuentaBancaria{" + "numeroCuenta=" + numeroCuenta + ", DNI=" + DNI + ", saldoActual=" + saldoActual + ", interes=" + interes + '}';
    }
    
    
}
