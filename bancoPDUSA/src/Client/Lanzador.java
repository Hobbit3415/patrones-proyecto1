package Client;



import Externo.Usuario;
import Fabrica.FabricaCuenta;
import Interfaz.iCuenta;
import Producto.Cuenta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lanzador {

    public static void main(String[] args) throws IOException {

        //Quemando los datos.
        Usuario u1 = new Usuario( "Brayan Pérez", 27, true); //true empleado, false des
        Usuario u2 = new Usuario( "Pepe Sánchez", 21, false);
        Usuario u3 = new Usuario( "Arnulfo López", 19, true);
        Usuario u4 = new Usuario("Lord Leyvardo", 18, false);
        Usuario u5 = new Usuario("Pepperoncino", 17, false);
        Usuario u6 = new Usuario( "Camaroncio", 54, true);


        FabricaCuenta fabricaCuenta = new FabricaCuenta();
        iCuenta cuenta = fabricaCuenta.getCuenta(u1.getNombre(), u1.getEdad(), u1.getEsEmpleado());

        System.out.println(cuenta);


        //if (cuenta != null){
          //  System.out.println(cuenta.toString()+ " ");
        //} else {
          //  System.out.println("Tipo de cuenta invalida ");
        //}
    }
}
