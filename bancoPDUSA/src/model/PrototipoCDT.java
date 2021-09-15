package model;


import producto.CDT;

public class PrototipoCDT extends CDT {
		
	
	public PrototipoCDT(double fecha, double rt, double ti ) {
		this.setDuracion(fecha);
		this.setRetencionFuente(rt);
		this.setTasaInteres(ti);
	}
	
	public CDT clone() throws CloneNotSupportedException{
		return super.clone();
	}
	
}
