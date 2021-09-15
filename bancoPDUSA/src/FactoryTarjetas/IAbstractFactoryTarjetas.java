package FactoryTarjetas;

import producto.TarjetaCredito;
import producto.TarjetaDebito;

public interface IAbstractFactoryTarjetas {

  public TarjetaDebito generarDebitoVisa();

  public TarjetaCredito generarCreditoVisa();

  public TarjetaDebito generarDebitoMastercard();

  public TarjetaCredito generarCreditoMastercard();

}
