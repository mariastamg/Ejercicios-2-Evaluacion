package unidad5;

import java.time.LocalDate;

public class Animal {

	private String nombre;
	private LocalDate fecha;

	public Animal(String nombre, LocalDate fecha) {
		super();
		this.nombre = nombre;
		this.fecha = fecha;
	}

	public Animal(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	@Override
	public String toString() {
		return "Animal [nombre:" + nombre + ", -  fecha:" + fecha + "]";
	}

}
