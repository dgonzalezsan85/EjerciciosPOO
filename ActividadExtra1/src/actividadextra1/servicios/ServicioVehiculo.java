package actividadextra1.servicios;

import actividadextra1.entidades.Vehiculo;
import java.util.Scanner;

public class ServicioVehiculo {

    private Scanner scanner = new Scanner(System.in);

    private Vehiculo vehiculo;

    public Vehiculo crearVehiculo() {
        vehiculo = new Vehiculo();

        System.out.print("Ingrese la marca: ");
        vehiculo.setMarca(scanner.next());

        System.out.print("Ingrese el modelo: ");
        vehiculo.setModelo(scanner.next());

        System.out.print("Ingrese el año: ");
        vehiculo.setAnio(scanner.nextInt());

        System.out.print("Ingrese el tipo: ");
        vehiculo.setTipo(scanner.next());

        return vehiculo;
    }
    
    public int moverse(int tiempo, Vehiculo vehiculo){
        int metros = 0;
        if (vehiculo.getTipo().equals("automovil")) {
            metros = tiempo*3;
        } else if (vehiculo.getTipo().equals("motocicleta")){
            metros =  tiempo*2;
        } else if (vehiculo.getTipo().equals("bicicleta")){
            metros =  tiempo*1;
        }
        return metros;
    }
    
    public int frenar(Vehiculo vehiculo){
        int metros = 0;
        if (vehiculo.getTipo().equals("bicicleta")) {
            metros = 0;
        } else {
            metros = 2;
        }
        return metros;
    }
    

}
