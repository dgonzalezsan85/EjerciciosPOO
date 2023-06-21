/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.pooejercicio05;

import com.danielgonzalez.pooejercicio05.Entidades.CuentaBancaria;
import com.danielgonzalez.pooejercicio05.Servicios.CuentaBancariaServicio;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
/*
Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
*/
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        CuentaBancariaServicio cbs = new CuentaBancariaServicio();
        
        CuentaBancaria cuenta = cbs.crearCuenta();
        
        System.out.println("Ingrese la cantidad de dinero a consignar: ");
        double ingreso = leer.nextDouble();
        
        cbs.ingresar(ingreso, cuenta);
        
        System.out.println("Ingrese la cantidad de dinero que desea retirar: ");
        int retiro = leer.nextInt();
        
        cbs.retirar(retiro, cuenta);
        
        cbs.extraccionRapida(cuenta);
        
        cbs.consultarSaldo(cuenta);
        
        cbs.consultarDatos(cuenta);
    }
    
}
