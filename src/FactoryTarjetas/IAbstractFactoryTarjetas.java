package FactoryTarjetas;

import Producto.TarjetaCredito;
import Producto.TarjetaDebito;

public interface IAbstractFactoryTarjetas {

  public TarjetaDebito generarDebitoVisa( String nCuenta, String titular);

  public TarjetaCredito generarCreditoVisa(String nCuenta, String titular);

  public TarjetaDebito generarDebitoMastercard(String nCuenta, String titular);

  public TarjetaCredito generarCreditoMastercard(String nCuenta, String titular);

}
