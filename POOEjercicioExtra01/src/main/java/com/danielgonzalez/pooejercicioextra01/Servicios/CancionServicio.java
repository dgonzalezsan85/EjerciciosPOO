/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicioextra01.Servicios;

import com.danielgonzalez.pooejercicioextra01.Entidades.Cancion;
import java.util.Scanner;

/**
 *
 * @author danielgonzalez
 */
public class CancionServicio {
    
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Cancion crearCancion(){
        
        Cancion cancion = new Cancion();
        
        System.out.println("Ingrese el titulo de la cancion: ");
        cancion.setTitulo(leer.next());
        
        System.out.println("Ingrese el autor de la cancion: ");
        cancion.setAutor(leer.next());
        
        return cancion;
    }
}
