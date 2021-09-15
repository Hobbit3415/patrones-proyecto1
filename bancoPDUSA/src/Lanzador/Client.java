package Lanzador;

import FactoryCuentas.AbstractCuentaFactory;
import FactoryCuentas.ProveedorCuentaFactory;
import PCuenta.Cuenta;
import PCuenta.DetalleCuenta;
import PCuenta.TipoCuenta;

public class Client {
    public static void main(String[] args) {
        AbstractCuentaFactory factory = ProveedorCuentaFactory.getCuentaFactory("AHORROS");
        Cuenta c1 = factory.crearCuenta(new DetalleCuenta(6465464, "Pepillo Sanchez", TipoCuenta.AHORROS));
        c1.deposito(30000);

        System.out.println(c1);
        System.out.printf("Interés de %10.2f\n", c1.getInteres(5));

        Cuenta c2 = factory.crearCuenta(new DetalleCuenta(3211231, "Frederico Pérez", TipoCuenta.CORRIENTE));
        c2.deposito(100000);

        System.out.println(c2);

        Cuenta c3 = factory.crearCuenta(new DetalleCuenta(6465464, "Pepillo Sanchez", TipoCuenta.AHORROS));
        c1.deposito(30000);

        Cuenta c4 = factory.crearCuenta(new DetalleCuenta(123, "Jovenzuelo Ramirez", TipoCuenta.CORRIENTE));
        c4.retiro(10000);
        c4.deposito(50000);
        c4.retiro(10000);
        System.out.println(c4.getMonto());
        System.out.println(c4);
        c4.retiro(30000);
        System.out.println(c4);
    }
}
