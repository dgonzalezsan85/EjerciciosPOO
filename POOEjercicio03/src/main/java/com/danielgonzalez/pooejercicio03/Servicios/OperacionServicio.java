/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio03.Servicios;

import com.danielgonzalez.pooejercicio03.Entidades.Operacion;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class OperacionServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Operacion crearOperacion(){
        
        Operacion op = new Operacion();
        
        System.out.println("Ingrese el primer numero: ");
        op.setNum1(leer.nextDouble());
        
        System.out.println("Ingrese el primer numero: ");
        op.setNum2(leer.nextDouble());
        
        return op;
    }
    
    public double sumar(Operacion oper){
        
        return oper.getNum1() + oper.getNum2();
    }
    
    public double restar(Operacion oper){
        
        return oper.getNum1() - oper.getNum2();
    }
    
    public double multiplicar(Operacion oper){
        
        if (oper.getNum1() == 0 || oper.getNum2() == 0) {
            System.out.println("Error no se puede multiplicar por 0");
            return 0;
        } else {
            return oper.getNum1() * oper.getNum2();
        }       
    }
    
    public double dividir(Operacion oper){
        
        if (oper.getNum1() == 0 || oper.getNum2() == 0) {
            System.out.println("Error no se puede dividir por 0");
            return 0;
        } else {
            return oper.getNum1() / oper.getNum2();
        }       
    }
}
