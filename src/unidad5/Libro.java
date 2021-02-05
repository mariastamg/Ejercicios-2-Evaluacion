package unidad5;

import java.util.ArrayList;

public class Libro {
	
	
	private String titulo;
	private ArrayList<String> autores;
	private float precio;
	private int stock=1;
	
	public Libro(String titulo, ArrayList<String> autores, float precio) {
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		
	}
	
	public Libro(String titulo, ArrayList<String> autores, float precio, int stock) {
		super();
		this.titulo = titulo;
		this.autores = autores;
		this.precio = precio;
		this.stock = stock;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public String getTitulo() {
		return titulo;
	}

	public ArrayList<String> getAutores() {
		return autores;
	}

	@Override
	public String toString() {
		return titulo +"("+autores +") " + precio +"€ "+ stock+" unidades en stock";
	}

	
	
	
	
	
}
