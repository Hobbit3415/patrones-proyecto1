package Interfaz;

import Externo.Usuario;
import Producto.CDT;
import Producto.CreditoRotativo;
import Producto.Cuenta;

public interface iCuenta {
	CreditoRotativo getCreditoRotativo();

	Usuario obtenerCuenta();

	double abrirCDT(double monto);

	public CDT getCDT();

	public double agregarDep(double monto);



}
