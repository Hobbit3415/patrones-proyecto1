package FactoryCuentas;

import Deposito.DepositoFijo;
import Deposito.CuentaDeposito;
import PCuenta.DetalleCuenta;
import PCuenta.TipoCuenta;

public class DepositoCuentaFactory extends AbstractCuentaFactory {

    public CuentaDeposito crearCuenta(DetalleCuenta detalle){
        if(detalle == null || detalle.noEsValido(true)){
            throw new IllegalArgumentException("Detalles de apertura no válido");

        }
        CuentaDeposito cuenta = null;
        TipoCuenta tipoCuenta = detalle.getTipoCuenta();
        switch (tipoCuenta){
            case DEPOSITO_FIJO:
                cuenta = new DepositoFijo(detalle.getNumeroCuenta(), detalle.getNombreTitular(), detalle.getPlazoEnMeses());
                break;
            default:
                System.out.println("Tipo de cuenta no soportada");
        } return cuenta;
    }
}
