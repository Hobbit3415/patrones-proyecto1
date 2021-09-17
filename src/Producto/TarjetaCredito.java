package Producto;

public class TarjetaCredito implements ITarjeta {
  private String nCuenta;
  private String titular;
  private long numeroTarjeta;
  private int mesV;
  private int yearV;
  private int cvv;
  private String marca;
  private String tipo;

  public TarjetaCredito() {
    this.nCuenta = "";
    this.titular = "";
    this.numeroTarjeta = 0;
    this.mesV = 0;
    this.yearV = 0;
    this.cvv = 0;
    this.marca = "";
    this.tipo = "Credito";
  }

  public TarjetaCredito(String numeroCuenta, String titular, Long numeroTarjeta, int mesV, int yearV, int cvv,
      String marca, String tipo) {
    this.nCuenta = numeroCuenta;
    this.titular = titular;
    this.numeroTarjeta = numeroTarjeta;
    this.mesV = mesV;
    this.yearV = yearV;
    this.cvv = cvv;
    this.marca = marca;
    this.tipo = "Credito";
  }

  public String getnCuenta() {
    return nCuenta;
  }

  public void setnCuenta(String nCuenta) {
    this.nCuenta = nCuenta;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public long getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(long numeroTarjeta) {
    this.numeroTarjeta = numeroTarjeta;
  }

  public int getMesV() {
    return mesV;
  }

  public void setMesV(int mesV) {
    this.mesV = mesV;
  }

  public int getYearV() {
    return yearV;
  }

  public void setYearV(int yearV) {
    this.yearV = yearV;
  }

  public int getCvv() {
    return cvv;
  }

  public void setCvv(int cvv) {
    this.cvv = cvv;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    return "TarjetaDebito [\nTipo Tarjeta: " + tipo + "\nTitular: " + titular + "\nCuenta: " + nCuenta
        + "\nNumero Tarjeta: " + numeroTarjeta + "\nCVV=" + cvv + "\nAño vencimiento: " + yearV + "\nMes vencimiento: " + mesV
        + "\nMarca: " + marca + "\n]";
  }

}
