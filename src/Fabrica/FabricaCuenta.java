package Fabrica;


import Interfaz.iCuenta;
import Producto.Cuenta;
import Producto.CuentaAhorros;
import Producto.CuentaCorriente;
import Producto.TarjetaCredito;
import Producto.TarjetaDebito;

import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

import FactoryTarjetas.IAbstractFactoryTarjetas;
import FactoryTarjetas.MastercardFactory;


public class FabricaCuenta {

    public ArrayList<CuentaCorriente> listaCuentaCorr = new ArrayList();
    public ArrayList<CuentaAhorros> listaCuentaAh = new ArrayList();

    public int rangoNumeroAleatorio(int min, int max){
        return ThreadLocalRandom.current().nextInt(min,max +1);
    }
    public String generarNumCuenta(){
        String numeros= "1234567890";
        String cadena = "";

        for (int i =0; i<15; i++){
            int indiceRandom = rangoNumeroAleatorio(0, numeros.length()-1);
            char caracterRandom = numeros.charAt(indiceRandom);
            cadena+= caracterRandom;
        }

        return cadena;
    }

    public iCuenta getCuenta (String nombre, int edad, boolean estado) {
        if (edad==18 && estado==false){
            listaCuentaAh.add(new CuentaAhorros(nombre, edad, estado));
            
            return new CuentaAhorros(nombre, edad, estado);
            
        } else if (edad>18){
            return new CuentaCorriente(nombre, edad, estado);
        } else
            System.out.println("Lo sentimos, no cumple con las condiciones para crear una cuenta");
        return null;
    }
}
