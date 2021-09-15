package PCuenta;

import PCuenta.TipoCuenta;

public enum DeduccionInt {

    SIMPLE("Interes simple") {
        @Override
        public double getInteres(TipoCuenta tipoCuenta, double monto, int plazo){
        if(tipoCuenta !=null){
            return monto * Math.pow(1.0 + tipoCuenta.getMonto() / 100.0, plazo) - monto;
        }
        return 0.0d;
    }
},

    COMPUESTO("Interés compuesto") {
        @Override
        public double getInteres(TipoCuenta tipoCuenta, double monto, int plazo) {
            if (tipoCuenta != null){
                return monto * Math.pow(1.0 + tipoCuenta.getMonto() / 100.0, plazo) - monto;

            }
            return 0.0d;
        }
    };

    private String nombre;

    DeduccionInt (String nombre){
        this.nombre = nombre;
    }

    public abstract double getInteres (TipoCuenta tipoCuenta, double monto, int plazo);

    public String getNombre(){
        return nombre;
    }

}
