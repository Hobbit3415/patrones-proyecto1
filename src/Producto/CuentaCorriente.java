package Producto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Externo.Usuario;
import Fabrica.FabricaCuenta;
import FactoryTarjetas.IAbstractFactoryTarjetas;
import FactoryTarjetas.MastercardFactory;
import Interfaz.iCuenta;

public class CuentaCorriente implements iCuenta {

    String id;
    String nombre;
    int edad;
    boolean estado;
    FabricaCuenta fabricaCuenta = new FabricaCuenta();
    IAbstractFactoryTarjetas factoryMaster = new MastercardFactory();
    TarjetaCredito tc = new TarjetaCredito();
    TarjetaDebito td = new TarjetaDebito();
    Calendar date = new GregorianCalendar(2021, 9, 17);
    int year = date.get(Calendar.YEAR);

    public CuentaCorriente(String nombre, int edad, boolean estado) {
        this.id = fabricaCuenta.generarNumCuenta();
        this.nombre = nombre;
        this.edad = edad;
        this.estado = estado;
        tc.setCupo(3500000);
        this.year = year;
    }

    
    
    public int getYear() {
		return year;
	}



	public void setYear(int year) {
		this.year = year;
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



	@Override
	public double getCDT() {
	
		return 1;
	}
	
}






