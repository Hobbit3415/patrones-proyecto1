package Client;



import Externo.Usuario;
import Fabrica.FabricaCuenta;
import Interfaz.iCuenta;
import Producto.CreditoRotativo;
import Producto.Cuenta;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Lanzador {

    public static void main(String[] args) throws IOException, CloneNotSupportedException {

        //Quemando los datos.
        Usuario u1 = new Usuario( "Brayan Pérez", 27, true); //true empleado, false des
        Usuario u2 = new Usuario( "Pepe Sánchez", 21, false);
        Usuario u3 = new Usuario( "Arnulfo López", 19, true);
        Usuario u4 = new Usuario("Lord Frasser", 18, false);
        Usuario u5 = new Usuario("Pepperoncino", 18, false);
        Usuario u6 = new Usuario( "Camaroncio", 54, true);


        FabricaCuenta fabricaCuenta = new FabricaCuenta();
        iCuenta cuenta = fabricaCuenta.getCuenta(u5.getNombre(), u5.getEdad(), u5.getEsEmpleado());
        iCuenta cuenta1 = fabricaCuenta.getCuenta(u1.getNombre(), u1.getEdad(), u1.getEsEmpleado());
        
        //cuenta.agregarDeposito(20000);
        cuenta1.abrirCDT(1500000);
        //cuenta1.agregarDep(780000);
        System.out.println(cuenta1.getCDT().getMonto()); 
        //cuenta.agregarDeposito(21500000);
        System.out.println(cuenta1.getCDT().clone()); 
        
        System.out.println(cuenta1.getCDT().getDuracion());

        System.out.println(cuenta1.getCreditoRotativo());
        CreditoRotativo c = cuenta1.getCreditoRotativo().clone();

        System.out.println(c);
        //System.out.println();
        //cuenta.getCDT(1200000).
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
