package FactoryTarjetas;

import producto.*;
//import java.util.Random;

public class MastercardFactory implements IAbstractFactoryTarjetas {
  
  int complemento = 0;
  
  @Override
  public TarjetaDebito generarDebitoVisa(int nCuenta, String titular) {
    TarjetaDebito tDeb = new TarjetaDebito();
    complemento = (int) (Math.random()*(999999999-100000000+1)+999999999);
    tDeb.setnCuenta(nCuenta);
    tDeb.setTitular(titular);
    tDeb.setNumeroTarjeta(Long.valueOf("430014"+complemento));
    tDeb.setMesV((int) (Math.random()*12));
    tDeb.setYearV(2024);
    tDeb.setCvv((int) (Math.random()*999-111+1));
    tDeb.setMarca("Visa");
    return tDeb;
  }

  @Override
  public TarjetaCredito generarCreditoVisa(int nCuenta, String titular) {
    TarjetaCredito tCred = new TarjetaCredito();
    complemento = (int) (Math.random()*(999999999-100000000+1)+999999999);
    tCred.setnCuenta(nCuenta);
    tCred.setTitular(titular);
    tCred.setNumeroTarjeta(Long.valueOf("430014"+complemento));
    tCred.setMesV((int) (Math.random()*12));
    tCred.setYearV(2024);
    tCred.setCvv((int) (Math.random()*999-111+1));
    tCred.setMarca("Visa");
    return tCred;
  }

  @Override
  public TarjetaDebito generarDebitoMastercard(int nCuenta, String titular) {
    TarjetaDebito tDeb = new TarjetaDebito();
    complemento = (int) (Math.random()*(999999999-100000000+1)+999999999);
    tDeb.setnCuenta(nCuenta);
    tDeb.setTitular(titular);
    tDeb.setNumeroTarjeta(Long.valueOf("430014"+complemento));
    tDeb.setMesV((int) (Math.random()*12));
    tDeb.setYearV(2024);
    tDeb.setCvv((int) (Math.random()*999-111+1));
    tDeb.setMarca("Mastercard");
    return tDeb;
  }

  @Override
  public TarjetaCredito generarCreditoMastercard(int nCuenta, String titular) {
    TarjetaCredito tCred = new TarjetaCredito();
    complemento = (int) (Math.random()*(999999999-100000000+1)+999999999);
    tCred.setnCuenta(nCuenta);
    tCred.setTitular(titular);
    tCred.setNumeroTarjeta(Long.valueOf("430014"+complemento));
    tCred.setMesV((int) (Math.random()*12));
    tCred.setYearV(2024);
    tCred.setCvv((int) (Math.random()*999-111+1));
    tCred.setMarca("Mastercard");
    return tCred;
  }

}
