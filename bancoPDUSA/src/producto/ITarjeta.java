package producto;

public interface ITarjeta {

  public String getTitular();

  public void setTitular(String titular);

  public long getNumeroTarjeta();

  public void setNumeroTarjeta(long numeroTarjeta);

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