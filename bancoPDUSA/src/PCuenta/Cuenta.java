package PCuenta;


public abstract class Cuenta {

    protected long numCuenta;
    protected String titularCuenta;
    protected TipoCuenta tipoCuenta;
    protected DeduccionInt deduccionInt;
    protected double monto;

    public Cuenta(){
        super();
    }

    public Cuenta(long numCuenta, String titularCuenta, TipoCuenta tipoCuenta){
        this();
        this.numCuenta = numCuenta;
        this.titularCuenta = titularCuenta;
        this.tipoCuenta = tipoCuenta;
    }

    public long getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(long numCuenta) {
        this.numCuenta = numCuenta;
    }

    public String getTitularCuenta() {
        return titularCuenta;
    }

    public void setTitularCuenta(String titularCuenta) {
        this.titularCuenta = titularCuenta;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public DeduccionInt getDeduccionInt() {
        return deduccionInt;
    }

    public void setDeduccionInt(DeduccionInt deduccionInt) {
        this.deduccionInt = deduccionInt;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void deposito (double monto){
        if (monto >0.0d){
            this.monto += monto;
        }
    }

    public void retiro(double monto){
        if (monto > 0.0d && monto < this.monto) {
            this.monto -= monto;
        }
    }

    public abstract double getInteres(int plazo);

    @Override
    public String toString() {
        return "PCuenta.Cuenta{" +
                "numCuenta=" + numCuenta +
                ", titularCuenta='" + titularCuenta + '\'' +
                ", tipoCuenta=" + tipoCuenta +
                ", deduccionInt=" + deduccionInt +
                ", monto=" + monto +
                '}';
    }
}
