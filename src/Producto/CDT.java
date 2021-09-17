package Producto;

public abstract class CDT implements Cloneable {

	private double duracion=5;
	private double tasaInteres;
	private double retencionFuente;
	private double minApertura = 1000000;
	private double monto;
	
	public CDT clone ()throws  
	CloneNotSupportedException{
		return (CDT) super.clone();
	}

	public double getminApertura() {
		return minApertura;
	}
	
	public void setMonto(double monto) {
		this.monto = monto;
		
	}
	
	public double getMonto() {
		return this.monto;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	public double getTasaInteres() {
		return tasaInteres;
	}

	public void setTasaInteres(double tasaInteres) {
		this.tasaInteres = tasaInteres;
	}

	public double getRetencionFuente() {
		return retencionFuente;
	}

	public void setRetencionFuente(double retencionFuente) {
		this.retencionFuente = retencionFuente;
	}

	@Override
	public String toString() {
		return "CDT [duracion=" + duracion + ", tasaInteres=" + tasaInteres + ", retencionFuente=" + retencionFuente
				+ "" + ", monto=" + monto + "]";
	}

	
	
}
