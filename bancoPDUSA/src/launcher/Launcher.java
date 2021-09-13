package launcher;

import factory.IAbstractFactoryTarjetas;
import factory.MastercardFactory;
import factory.VisaFactory;
import producto.ITarjeta;
import producto.TarjetaCredito;

public class Launcher {
  
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.println("");
    IAbstractFactoryTarjetas factoryVisa = new VisaFactory();
    IAbstractFactoryTarjetas factoryMaster = new MastercardFactory();

    TarjetaCredito tarjetaMaster = factoryMaster.generarCreditoMastercard();

    System.out.println(tarjetaMaster.toString());

  }

}
