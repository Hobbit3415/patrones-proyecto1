package FactoryTarjetas;

import producto.*;

public class VisaFactory implements IAbstractFactoryTarjetas{
  @Override
  public TarjetaDebito generarDebitoVisa(int nCuenta, String titular) {
    TarjetaDebito tDeb = new TarjetaDebito();
    tDeb.setMarca("Visa");
    return tDeb;
  }

  @Override
  public TarjetaCredito generarCreditoVisa(int nCuenta, String titular) {
    TarjetaCredito tCred = new TarjetaCredito();
    tCred.setMarca("Visa");
    return tCred;
  }

  @Override
  public TarjetaDebito generarDebitoMastercard(int nCuenta, String titular) {
    TarjetaDebito tDeb = new TarjetaDebito();
    tDeb.setMarca("Mastercard");
    return tDeb;
  }

  @Override
  public TarjetaCredito generarCreditoMastercard(int nCuenta, String titular) {
    TarjetaCredito tCred = new TarjetaCredito();
    tCred.setMarca("Mastercard");
    return tCred;
  }

}
