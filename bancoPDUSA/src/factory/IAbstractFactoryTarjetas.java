package factory;

import producto.TarjetaCredito;

public interface IAbstractFactoryTarjetas {

  public void generarDebitoVisa();

  public TarjetaCredito generarCreditoVisa();

  public void generarDebitoMastercard();

  public TarjetaCredito generarCreditoMastercard();

}
