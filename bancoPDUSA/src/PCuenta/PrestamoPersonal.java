package PCuenta;

public class PrestamoPersonal extends PrestamoCuenta {

    public PrestamoPersonal(long numCuenta, String titularCuenta, TipoCuenta tipoCuenta) {
        super(numCuenta, titularCuenta, tipoCuenta);
    }

    @Override
    public double getInteres(int plazo) {
        return this.getDeduccionInt().getInteres(tipoCuenta, monto, plazo);
    }
}
