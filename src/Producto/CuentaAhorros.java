package Producto;

import Externo.Usuario;
import Fabrica.FabricaCuenta;
import Interfaz.iCuenta;

public class CuentaAhorros implements iCuenta {

    String id;
    String nombre;
    int edad;
    boolean estado;
    FabricaCuenta fabricaCuenta = new FabricaCuenta();

    public CuentaAhorros(String nombre, int edad, boolean estado) {
        this.id = fabricaCuenta.generarNumCuenta();
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    @Override
    public double getCreditoRotativo() {
        return 0;
    }

    @Override
    public Usuario obtenerCuenta() {
        return null;
    }

    @Override
    public String toString() {
        return "Cuenta de Ahorros : " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado=" + estado
                + ", Crédito rotativo= " + getCreditoRotativo() +' ';
    }

}
