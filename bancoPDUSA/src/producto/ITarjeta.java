package producto;

public interface ITarjeta {

  public String getTitular();

  public void setTitular(String titular);

  public int getNumeroTarjeta();

  public void setNumeroTarjeta(int numeroTarjeta);

  public int getMesV();

  public void setMesV(int mesV);

  public int getYearV();

  public void setYearV(int yearV);

  public int getCvv();

  public void setCvv(int cvv);

  public String getMarca();

  public void setMarca(String marca);

  @Override
  public String toString();

}