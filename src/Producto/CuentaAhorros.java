package Producto;

import java.util.Calendar;
import java.util.GregorianCalendar;

import Externo.Usuario;
import Fabrica.FabricaCuenta;
import FactoryTarjetas.IAbstractFactoryTarjetas;
import FactoryTarjetas.MastercardFactory;
import Interfaz.iCuenta;
import model.PrototipoCDT;

public class CuentaAhorros implements iCuenta {

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
	int limiteTransacion = 0;
	int x = 260;
	double monto;

	public CuentaAhorros(String nombre, int edad, boolean estado) {
		this.id = fabricaCuenta.generarNumCuenta();
		this.nombre = nombre;
		this.edad = edad;
		this.estado = estado;
		this.tc = factoryMaster.generarCreditoMastercard(id, nombre);
		this.td = factoryMaster.generarDebitoMastercard(id, nombre);
		tc.setCupo(1000000);
		this.year = year;

		if (edad == 18) {
			this.limiteTransacion = 200000;
		} else if (edad >= 18 && estado == true) {
			this.limiteTransacion = 2000000 + x;
		}
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public TarjetaCredito getTc() {
		return tc;
	}

	public void setTc(TarjetaCredito tc) {
		this.tc = tc;
	}

	public TarjetaDebito getTd() {
		return td;
	}

	public void setTd(TarjetaDebito td) {
		this.td = td;
	}

	@Override
	public CreditoRotativo getCreditoRotativo() {
		return null;
	}

	@Override
	public Usuario obtenerCuenta() {
		return null;
	}

	@Override
	public String toString() {
		return "CuentaAhorros [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", estado=" + estado + ", tc=" + tc
				+ ", td=" + td + "]";
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
		this.monto += monto;
		return monto;
	}

}
