package unidad7;

public class Revistas extends Publicaciones {
	
	int numero;
	String mes;
	String fechaPublicacion;

	public Revistas(int codigo, String titulo, int anyoPublicacion) {
		super(codigo, titulo, anyoPublicacion);
		
	}
	
	public Revistas(int codigo, String titulo, int anyoPublicacion, int numero, String mes, String fechaPublicacion) {
		super(codigo, titulo, anyoPublicacion);
		this.numero = numero;
		this.mes = mes;
		this.fechaPublicacion = fechaPublicacion;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

	@Override
	public String toString() {
		return "Revistas ["+ numero + "," + mes + "," + fechaPublicacion + ","+ codigo + "," + titulo + "," + anyoPublicacion + "]";
	}

	
}
