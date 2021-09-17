package Interfaz;

import Externo.Usuario;
import Producto.CDT;
import Producto.Cuenta;

public interface iCuenta {
	double getCreditoRotativo();

	Usuario obtenerCuenta();

	double abrirCDT(double monto);

	public CDT getCDT();

	public double agregarDep(double monto);

}
