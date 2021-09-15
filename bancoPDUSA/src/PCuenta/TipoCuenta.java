package PCuenta;

public enum TipoCuenta {

    //AHORROS(2.0d), CDT(2.0d), CORRIENTE(1.0d), CUPO(1.0d), DEPOSITO_FIJO(3.5d), PRESTAMO_PERSONAL(4.0d);
    AHORROS(2.0d), CDT(2.0d), CORRIENTE(1.0d), CUPO(1.0d), DEPOSITO_FIJO(3.5d), PRESTAMO_PERSONAL(4.0d);

    private double monto;

    TipoCuenta(final double monto) {
        this.monto = monto;
    }

    public double getMonto() {
        return monto;
    }
}
