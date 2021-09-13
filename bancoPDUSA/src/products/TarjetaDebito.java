package products;

public class TarjetaDebito implements ITarjeta {
  private String titular = "";
  private int numeroTarjeta = 0;
  private int mesV = 0;
  private int yearV = 0;
  private int cvv = 0;
  private String marca = "";
  private int tipo = 0;

  public TarjetaDebito() {
    this.titular = "";
    this.numeroTarjeta = 0;
    this.mesV = 0;
    this.yearV = 0;
    this.cvv = 0;
    this.marca = "";
    this.tipo = 0;
  }
 
  public TarjetaDebito(String titular, int numeroTarjeta, int mesV, int yearV, int cvv, String marca, int tipo) {
    this.titular = titular;
    this.numeroTarjeta = numeroTarjeta;
    this.mesV = mesV;
    this.yearV = yearV;
    this.cvv = cvv;
    this.marca = marca;
    this.tipo = 0;
  }

  public String getTitular() {
    return titular;
  }

  public void setTitular(String titular) {
    this.titular = titular;
  }

  public int getNumeroTarjeta() {
    return numeroTarjeta;
  }

  public void setNumeroTarjeta(int numeroTarjeta) {
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
    return "TarjetaDebito [\ncvv=" + cvv + ", \nmarca=" + marca + ", \nmesV=" + mesV + ", \nnumeroTarjeta=" + numeroTarjeta
        + ", \ntipo=" + tipo + ", \ntitular=" + titular + ", \nyearV=" + yearV + "\n]";
  }
  
}
