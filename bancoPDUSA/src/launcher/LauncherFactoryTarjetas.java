package launcher;

import FactoryTarjetas.*;
import producto.*;

public class LauncherFactoryTarjetas {
  
  public static void main(String[] args) {
    System.out.print("\033[H\033[2J");
    System.out.println("");
    IAbstractFactoryTarjetas factoryVisa = new VisaFactory();
    IAbstractFactoryTarjetas factoryMaster = new MastercardFactory();

    TarjetaCredito tarjetaCredMaster = factoryMaster.generarCreditoMastercard();
    TarjetaDebito tarjetaDebMaster = factoryMaster.generarDebitoMastercard();

    System.out.println(tarjetaCredMaster.toString());
    System.out.println(tarjetaDebMaster);
    System.out.println("");

  }

}
