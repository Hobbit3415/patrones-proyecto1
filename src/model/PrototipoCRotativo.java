package model;


import Producto.CreditoRotativo;

public class PrototipoCRotativo extends CreditoRotativo {
	
	public PrototipoCRotativo(int cupo, int fecha, int plazo, double tasa) {
		this.setCupo(cupo);
		this.setFechaPago(fecha);
		this.setPlazo(plazo);
		this.setTasaFijaDesembolso(tasa);
	}
	
	public CreditoRotativo clone() throws CloneNotSupportedException{
		return super.clone();
	}
}
