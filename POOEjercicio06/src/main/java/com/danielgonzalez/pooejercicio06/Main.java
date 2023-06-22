/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.danielgonzalez.pooejercicio06;

import com.danielgonzalez.pooejercicio06.Entidades.Cafetera;
import com.danielgonzalez.pooejercicio06.Servicios.CafeteraServicio;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CafeteraServicio cs = new CafeteraServicio();
        
        Cafetera caf = cs.llenarCafetera();
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("");
        System.out.println("Ingrese la cantidad de tazas a servir, max 10 que es la capacidad de la cafetera: ");
        int ingreso = leer.nextInt();
        
        cs.servirTaza(ingreso, caf);
        
        System.out.println("Ingrese la cantidad de tazas de cafe a ingresar a la cafetera");
        int agregar = leer.nextInt();
        
        cs.agregarCafe(agregar, caf);
        
        cs.vaciarCafetera(caf);
    }
    
}
