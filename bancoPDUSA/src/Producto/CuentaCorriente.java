package Producto;

import Externo.Usuario;
import Fabrica.FabricaCuenta;
import Interfaz.iCuenta;

public class CuentaCorriente implements iCuenta {

    String id;
    String nombre;
    int edad;
    boolean estado;
    FabricaCuenta fabricaCuenta = new FabricaCuenta();

    public CuentaCorriente(String nombre, int edad, boolean estado) {
        this.id = fabricaCuenta.generarNumCuenta();
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
    }

    @Override
    public double getCreditoRotativo() {
        ;return 2000000;
    }

    @Override
    public Usuario obtenerCuenta() {

        return null;
    }

    @Override
    public String toString() {
        return "Cuenta Corriente : " +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", estado= " + estado
                + ", Crédito rotativo= " + getCreditoRotativo() +' ';
    }
}
