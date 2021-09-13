package factory;

import producto.*;

public class VisaFactory implements IAbstractFactoryTarjetas{
  @Override
  public void generarDebitoVisa() {
    TarjetaDebito tDeb = new TarjetaDebito();
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
