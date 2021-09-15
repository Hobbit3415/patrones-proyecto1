package Deposito;

import PCuenta.DeduccionInt;
import PCuenta.TipoCuenta;

public class DepositoFijo extends CuentaDeposito {

    private boolean depositoHecho;

    public DepositoFijo(long numCuenta, String titularCuenta,  int plazoEnMeses) {
        super(numCuenta, titularCuenta, TipoCuenta.DEPOSITO_FIJO, plazoEnMeses);
        setDeduccionInt(DeduccionInt.SIMPLE);
    }

    public double getInteres(int plazo){
        return this.getDeduccionInt().getInteres(tipoCuenta, monto, plazo);
    }

    public void deposito(double monto){
        if (!depositoHecho && monto > 0.0d){
            this.monto = monto;
            depositoHecho = true;
        } else {
            System.out.println("Lo sentimos, es un deposito fijo");
        }
    }
}
