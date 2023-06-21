/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio05.Servicios;

import com.danielgonzalez.pooejercicio05.Entidades.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class CuentaBancariaServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public CuentaBancaria crearCuenta() {

        CuentaBancaria cuenta = new CuentaBancaria();

        System.out.println("Ingrese el número de la cuenta: ");
        cuenta.setNumeroCuenta(leer.nextInt());

        System.out.println("Ingrese el DNI del cliente: ");
        cuenta.setDNI(leer.nextLong());

        System.out.println("Ingrese el saldo actual: ");
        cuenta.setSaldoActual(leer.nextInt());

        return cuenta;

    }
    
    public void ingresar(double ingreso, CuentaBancaria cuenta){
        
        int ingresoInt = (int) ingreso;
        
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingresoInt);
        
        System.out.println("Ingreso realizado, su saldo actual es: " + cuenta.getSaldoActual());
        
    }
    
    public void retirar(double retiro, CuentaBancaria cuenta){

        int retiroInt = (int) retiro;
        
        if (retiroInt <= cuenta.getSaldoActual()){
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiroInt); 
            System.out.println("Retiro realizado, su saldo actual es: " + cuenta.getSaldoActual());
            
        } else {
            cuenta.setSaldoActual(0);
        }  
    }
    
    public void extraccionRapida (CuentaBancaria cuenta){
        
        System.out.println("Ingrese la cantidad de dinero que desea retirar (Máx 20% del Saldo Actual): ");
        int retiro = leer.nextInt();
        
        if (retiro > cuenta.getSaldoActual() * 0.2) {
            System.out.println("No se puede realizar el retiro, solo puede retirar maximo el 20% del saldo actual \n"
                + "que corresponde a: " + (cuenta.getSaldoActual() * 0.2));
        } else {
            System.out.println("Retiro reslizado con exito, su saldo es igual a: " + cuenta.getSaldoActual());
        }
    }
    
    public void consultarSaldo(CuentaBancaria cuenta){
        
        System.out.println("Su salto actual es: " + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(CuentaBancaria cuenta){
        
        System.out.println(cuenta.toString());
    }
}
