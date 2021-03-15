package unidad7;

public class Libros extends Publicaciones implements Prestado {
	
	String autor;
	boolean libroPrestado=false;
	
	public Libros(int codigo, String titulo, int fechaPublicacion, String autor) {
		super(codigo, titulo, fechaPublicacion);
		this.autor = autor;
	}

	public Libros(int codigo, String titulo, int fechaPublicacion) {
		super(codigo, titulo, fechaPublicacion);
		
	}

	@Override
	public boolean prestado() {
		return libroPrestado;
		
		
	}
	
	public void prestarLibro(){
		System.out.println("El libro ha sido prestado");
		libroPrestado=true;
	}
	
	public void devolverLibro() {
		System.out.println("El libro ha sido devuelto");
		libroPrestado=false;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Libros [ " + autor + "," + codigo + "," + titulo + "," + anyoPublicacion + "]";
	}

	

}
