package FactoryCuentas;

import PCuenta.FabricaCuenta;

public class ProveedorCuentaFactory {

    public static AbstractCuentaFactory getCuentaFactory(String categoriaCuenta){
        AbstractCuentaFactory cuentaFactory = null;
        if (categoriaCuenta!=null){
            switch (categoriaCuenta) {
                case "AHORROS":
                    cuentaFactory = new FabricaCuenta();
                    break;
                default:
                    break;
            }
        }return cuentaFactory;
    }
}
