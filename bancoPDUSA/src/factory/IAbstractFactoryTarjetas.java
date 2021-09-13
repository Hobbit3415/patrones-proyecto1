package factory;

import products.TarjetaCredito;

public interface IAbstractFactoryTarjetas {

  public void generarDebitoVisa();

  public TarjetaCredito generarCreditoVisa();

  public void generarDebitoMastercard();

  public TarjetaCredito generarCreditoMastercard();

}
