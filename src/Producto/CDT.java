package Producto;

public abstract class CDT implements Cloneable {

	private double duracion;
	private double tasaInteres;
	private double retencionFuente;
	
	public CDT clone ()throws  
	CloneNotSupportedException{
		return (CDT) super.clone();
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
				+ "]";
	}
	
}
