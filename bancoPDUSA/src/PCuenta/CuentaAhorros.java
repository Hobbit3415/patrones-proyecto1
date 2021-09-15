package PCuenta;

public class CuentaAhorros extends Cuenta {

    public CuentaAhorros (long numCuenta, String titularCuenta) {
        super(numCuenta, titularCuenta, TipoCuenta.AHORROS);
        setDeduccionInt(DeduccionInt.COMPUESTO);
    }
    @Override
    public double getInteres(int plazo) {
        return this.getDeduccionInt().getInteres(tipoCuenta, monto, plazo);
    }
}
