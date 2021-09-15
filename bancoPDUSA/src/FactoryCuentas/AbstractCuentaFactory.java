package FactoryCuentas;

import PCuenta.Cuenta;
import PCuenta.DetalleCuenta;

public abstract class AbstractCuentaFactory {

    public abstract Cuenta crearCuenta(DetalleCuenta detalles);
}
