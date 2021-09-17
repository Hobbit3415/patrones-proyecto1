package Producto;

public abstract class CreditoRotativo implements Cloneable {
	
	
	private int cupo;
	private int plazo;
	private double tasaFijaDesembolso;
	private int fechaPago;
	
	public CreditoRotativo clone ()throws  
	CloneNotSupportedException{
		return (CreditoRotativo) super.clone();
	}

	public int getCupo() {
		return cupo;
	}

	public void setCupo(int cupo) {
		this.cupo = cupo;
	}

	public int getPlazo() {
		return plazo;
	}

	public void setPlazo(int plazo) {
		this.plazo = plazo;
	}

	public double getTasaFijaDesembolso() {
		return tasaFijaDesembolso;
	}

	public void setTasaFijaDesembolso(double tasaFijaDesembolso) {
		this.tasaFijaDesembolso = tasaFijaDesembolso;
	}

	public int getFechaPago() {
		return fechaPago;
	}

	public void setFechaPago(int fechaPago) {
		this.fechaPago = fechaPago;
	}

	@Override
	public String toString() {
		return "CreditoRotativo [cupo=" + cupo + ", plazo=" + plazo + ", tasaFijaDesembolso=" + tasaFijaDesembolso
				+ ", fechaPago=" + fechaPago + "]";
	}
	
	
	
}
