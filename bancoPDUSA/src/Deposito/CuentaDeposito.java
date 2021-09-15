package Deposito;

import PCuenta.Cuenta;
import PCuenta.TipoCuenta;

public abstract class CuentaDeposito extends Cuenta {

    protected int plazoEnMeses;
    private boolean retiroHecho;

    public CuentaDeposito(long numCuenta, String titularCuenta, TipoCuenta tipoCuenta, int plazoEnMeses){
        super(numCuenta, titularCuenta, tipoCuenta);
        this.plazoEnMeses = plazoEnMeses;
    }

    public int getPlazoEnMeses(){
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses){
        this.plazoEnMeses = plazoEnMeses;
    }

    public void retiro(double monto){
        if (!retiroHecho && this.monto>0.0d){
            this.monto = 0.0d;
            retiroHecho = true;
        } else {
            System.out.println("Lo sentimos");
        }
    }
}
