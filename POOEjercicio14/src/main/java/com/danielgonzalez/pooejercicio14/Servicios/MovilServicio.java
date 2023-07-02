/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.danielgonzalez.pooejercicio14.Servicios;

import java.util.Scanner;

import com.danielgonzalez.pooejercicio14.Entidades.Movil;

/**
 *
 * @author danielgonzalez
 */
public class MovilServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Movil movil = new Movil();

    public void cargarCelular() {

        System.out.println("Ingrese la marca del celular: ");
        movil.setMarca(leer.next());
        System.out.println();
        System.out.println("Ingrese el modelo del celular: ");
        movil.setModelo(leer.next());
        System.out.println();
        System.out.println("Ingreser el precio del celular: ");
        movil.setPrecio(leer.nextDouble());
        System.out.println();
        System.out.println("Ingreser el tamaño de la memoria RAM del celular: ");
        movil.setMemoriaRAM(leer.nextInt());
        System.out.println();
        System.out.println("Ingreser el almacenamiento interno (GB) del celular: ");
        movil.setAlmacenamiento(leer.nextInt());
        System.out.println("");
        ingresarCodigo();

    }

    public void ingresarCodigo() {

        int[] codigo = new int[7];
        int i = 1;

        for (int codigoMovil : codigo) {
            System.out.println("Ingrese el codigo del celular No. " + (i++));
            codigoMovil = leer.nextInt();
        }

        movil.setCodigo(codigo);

    }
}
