package factory;

import products.*;

public class MastercardFactory implements IAbstractFactoryTarjetas {
  @Override
  public void generarDebitoVisa() {
    ITarjeta tDeb = new TarjetaDebito();
    tDeb.setMarca("Visa");
  }

  @Override
  public TarjetaCredito generarCreditoVisa() {
    TarjetaCredito tCred = new TarjetaCredito();
    tCred.setMarca("Visa");
    return tCred;
  }

  @Override
  public void generarDebitoMastercard() {
    TarjetaCredito tCred = new TarjetaCredito();
    tCred.setMarca("Mastercard");
  }

  @Override
  public TarjetaCredito generarCreditoMastercard() {
    TarjetaCredito tCred = new TarjetaCredito();
    tCred.setMarca("Mastercard");
    return tCred;
  }

}
