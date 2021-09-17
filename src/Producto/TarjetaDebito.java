package Producto;

public class TarjetaDebito implements ITarjeta {
  private String nCuenta;
  private String titular;
  private long numeroTarjeta;
  private int mesV;
  private int yearV;
  private int cvv;
  private int saldo;
  private String marca;
  private String tipo;

  public TarjetaDebito() {
    this.nCuenta = "";
    this.titular = "";
    this.numeroTarjeta = 0;
    this.mesV = 0;
    this.yearV = 0;
    this.cvv = 0;
    this.saldo = 0;
    this.marca = "";
    this.tipo = "Debito";
  }

  public TarjetaDebito(String numeroCuenta, String titular, long numeroTarjeta, int mesV, int yearV, int cvv, String marca,
      int saldo, String tipo) {
    this.nCuenta = "";
    this.titular = titular;
    this.numeroTarjeta = numeroTarjeta;
    this.mesV = mesV;
    this.yearV = yearV;
    this.cvv = cvv;
    this.saldo = saldo;
    this.marca = marca;
    this.tipo = "Debito";
  }

  public int getSaldo() {
    return saldo;
  }

  public void setSaldo(int saldo) {
    this.saldo = saldo;
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
    return "TarjetaDebito [\n\tTipo Tarjeta: " + tipo + "\n\tTitular: " + titular + "\n\tCuenta: " + nCuenta
        + "\n\tNumero Tarjeta: " + numeroTarjeta + "\n\tCVV=" + cvv + "\n\tAño vencimiento: " + yearV + "\n\tMes vencimiento: " + mesV
        + "\n\tSaldo: " + saldo +"\n\tMarca: " + marca + "\n]";
  }
}
