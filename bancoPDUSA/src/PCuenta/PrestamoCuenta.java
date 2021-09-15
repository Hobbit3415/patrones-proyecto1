package PCuenta;

public abstract class PrestamoCuenta extends Cuenta {

    protected int plazoEnMeses;

    public PrestamoCuenta(long numCuenta, String titularCuenta, TipoCuenta tipoCuenta) {
        super(numCuenta, titularCuenta, tipoCuenta);
        this.plazoEnMeses = plazoEnMeses;
    }

    public void deposito(double monto){
        super.retiro(monto);
    }

    public void retiro(double monto){
        super.deposito(monto);
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }
}
