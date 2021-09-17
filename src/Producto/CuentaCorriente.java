package Producto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Externo.Usuario;
import Fabrica.FabricaCuenta;
import FactoryTarjetas.IAbstractFactoryTarjetas;
import FactoryTarjetas.MastercardFactory;
import Interfaz.iCuenta;
import model.PrototipoCDT;
import model.PrototipoCRotativo;

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
    double monto;
    int cRotativo = 2000000;
    int month = date.get(Calendar.MONTH);

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
    public CreditoRotativo getCreditoRotativo() {

        CreditoRotativo cr = new PrototipoCRotativo(cRotativo, month, 29, 0.02);

        return cr;
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
	public CDT getCDT() {
		double deposito = abrirCDT(monto);
		CDT pt = new PrototipoCDT(deposito); 
		return pt;
	}

	@Override
	public double abrirCDT(double monto) {
		
		this.monto = monto;
		return monto;
	}

	@Override
	public double agregarDep(double monto) {
		this.monto+=monto;
		return monto;
	} 
	
}






