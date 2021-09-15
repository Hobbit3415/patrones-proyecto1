package PCuenta;

import FactoryCuentas.AbstractCuentaFactory;

public class FabricaCuenta extends AbstractCuentaFactory {
    @Override
    public Cuenta crearCuenta(DetalleCuenta detalles) {
        if (detalles == null || detalles.noEsValido(false)){
            throw new IllegalArgumentException("Detalles de la cuenta no válidos");
        }
        Cuenta cuenta = null;
        TipoCuenta tipo = detalles.getTipoCuenta();
        switch (tipo){
            case AHORROS:
                cuenta = new CuentaAhorros(detalles.getNumeroCuenta(), detalles.getNombreTitular());
                break;
            case CORRIENTE:
                cuenta = new CuentaCorriente(detalles.getNumeroCuenta(), detalles.getNombreTitular());
                break;
            default:
                System.out.println("Tipo de cuenta no soportada o inválida");
        }
        return cuenta;
    }
}
