package FactoryTarjetas;

import producto.TarjetaCredito;
import producto.TarjetaDebito;

public interface IAbstractFactoryTarjetas {

  public TarjetaDebito generarDebitoVisa(int nCuenta, String titular);

  public TarjetaCredito generarCreditoVisa(int nCuenta, String titular);

  public TarjetaDebito generarDebitoMastercard(int nCuenta, String titular);

  public TarjetaCredito generarCreditoMastercard(int nCuenta, String titular);

}
