package PCuenta;

public class DetalleCuenta {

    private long numeroCuenta;
    private String nombreTitular;
    private TipoCuenta tipoCuenta;
    private int plazoEnMeses;

    public DetalleCuenta(long numeroCuenta, String nombreTitular, TipoCuenta tipoCuenta) {
        super();
        this.numeroCuenta = numeroCuenta;
        this.nombreTitular = nombreTitular;
        this.tipoCuenta = tipoCuenta;
    }

    public DetalleCuenta(long numeroCuenta, String nombreTitular, TipoCuenta tipoCuenta, int plazoEnMeses) {
        this(numeroCuenta, nombreTitular, tipoCuenta);
        this.plazoEnMeses = plazoEnMeses;
    }

    public long getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(long numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getNombreTitular() {
        return nombreTitular;
    }

    public void setNombreTitular(String nombreTitular) {
        this.nombreTitular = nombreTitular;
    }

    public TipoCuenta getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(TipoCuenta tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public int getPlazoEnMeses() {
        return plazoEnMeses;
    }

    public void setPlazoEnMeses(int plazoEnMeses) {
        this.plazoEnMeses = plazoEnMeses;
    }

    public boolean noEsValido(boolean plazoRequerido){
        return (numeroCuenta < 01 || nombreTitular == null || nombreTitular.trim().isEmpty() || tipoCuenta==null || (plazoRequerido ? plazoEnMeses>0: false));
    }
}
