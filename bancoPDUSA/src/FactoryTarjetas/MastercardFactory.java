package FactoryTarjetas;

import producto.*;

public class MastercardFactory implements IAbstractFactoryTarjetas {
  @Override
  public TarjetaDebito generarDebitoVisa() {
    TarjetaDebito tDeb = new TarjetaDebito();
    tDeb.setMarca("Visa");
    return tDeb;
  }

  @Override
  public TarjetaCredito generarCreditoVisa() {
    TarjetaCredito tCred = new TarjetaCredito();
    tCred.setMarca("Visa");
    return tCred;
  }

  @Override
  public TarjetaDebito generarDebitoMastercard() {
    TarjetaDebito tDeb = new TarjetaDebito();
    tDeb.setMarca("Mastercard");
    return tDeb;
  }

  @Override
  public TarjetaCredito generarCreditoMastercard() {
    TarjetaCredito tCred = new TarjetaCredito();
    tCred.setMarca("Mastercard");
    return tCred;
  }

}
