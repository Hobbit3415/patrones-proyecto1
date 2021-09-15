package PCuenta;

public class CuentaCorriente extends Cuenta {

    public CuentaCorriente(long numCuenta, String titularCuenta) {
        super(numCuenta, titularCuenta, TipoCuenta.CORRIENTE);
        setDeduccionInt(DeduccionInt.SIMPLE);
    }

    @Override
    public double getInteres(int plazo) {
        return this.getDeduccionInt().getInteres(tipoCuenta, monto, plazo);
    }
}
