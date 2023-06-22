package actividadextra1;

import actividadextra1.entidades.Vehiculo;
import actividadextra1.servicios.ServicioVehiculo;

public class ActividadExtra1 {

    public static void main(String[] args) {
        ServicioVehiculo sv = new ServicioVehiculo();
        int dis1, dis2, dis3;

        Vehiculo automovil = sv.crearVehiculo();
        Vehiculo motocicleta = sv.crearVehiculo();
        Vehiculo bicicleta = sv.crearVehiculo();

        System.out.println("--- 5 Segundos ---");
        System.out.println("Distancia automovil: " + sv.moverse(5, automovil));
        System.out.println("Distancia motocicleta: " + sv.moverse(5, motocicleta));
        System.out.println("Distancia bicicleta: " + sv.moverse(5, bicicleta));

        System.out.println("--- 10 Segundos ---");
        System.out.println("Distancia automovil: " + sv.moverse(10, automovil));
        System.out.println("Distancia motocicleta: " + sv.moverse(10, motocicleta));
        System.out.println("Distancia bicicleta: " + sv.moverse(10, bicicleta));

        System.out.println("--- 60 Segundos ---");
        System.out.println("Distancia automovil: " + sv.moverse(60, automovil));
        System.out.println("Distancia motocicleta: " + sv.moverse(60, motocicleta));
        System.out.println("Distancia bicicleta: " + sv.moverse(60, bicicleta));

        System.out.println("--- FINAL 300 Segundos ---");
        dis1 = sv.moverse(300, automovil) + sv.frenar(automovil);
        dis2 = sv.moverse(300, motocicleta) + sv.frenar(motocicleta);
        dis3 = sv.moverse(300, bicicleta) + sv.frenar(bicicleta);
        
        if (dis1 > dis2 && dis1 > dis3) {
            System.out.println("El vehiculo que llego mas lejos es el automovil y recorrio: " + dis1);
        } else if (dis2 > dis1 && dis2 > dis3){
            System.out.println("El vehiculo que llego mas lejos es la motocicleta y recorrio: " + dis2);
        } else {
            System.out.println("El vehiculo que llego mas lejos es la bibicleta y recorrio: " + dis3);
        }
    }

}
