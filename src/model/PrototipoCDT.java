package model;


import Producto.CDT;

public class PrototipoCDT extends CDT {
		
	private double minApertura=1000000;
	
	
	
	
	public PrototipoCDT( double monto) {
		this.setMonto(monto);
		if(monto >= minApertura) {
			
		this.getminApertura();
		
		}else {
			this.setMonto(0);
		}
	}
	

	public CDT clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
