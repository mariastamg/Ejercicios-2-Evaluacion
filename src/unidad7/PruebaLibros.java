package unidad7;

import java.util.ArrayList;

public class PruebaLibros {

	public static void main(String[] args) {
		ArrayList<Publicaciones> listadoPublicaciones = new ArrayList();

		Libros l1 = new Libros(001, "Harry Potter", 2000, "AutorHarryPotter");
		Libros l2 = new Libros(002, "El Señor de los Anillos", 1940, "Tolkien");
		Libros l3 = new Libros(003, "Los Juegos del Hambre", 2000, "AutorJuegosHambre");

		Revistas r1 = new Revistas(004, "Muy interesante", 1995, 150, "Marzo", "01-03-2021");
		Revistas r2 = new Revistas(005, "Vogue", 1960, 895, "Febrero", "25-02-2021");
		Revistas r3 = new Revistas(006, "Marie Claire", 1989, 560, "Marzo", "10-03-2021");

		listadoPublicaciones.add(l1);
		listadoPublicaciones.add(l2);
		listadoPublicaciones.add(l3);
		listadoPublicaciones.add(r1);
		listadoPublicaciones.add(r2);
		listadoPublicaciones.add(r3);

		for (Publicaciones p : listadoPublicaciones) {
			System.out.println(p);
		}

		l1.prestarLibro();
		l3.prestarLibro();
		l2.prestarLibro();
		l3.devolverLibro();

		// LISTADO DE PUBLICACIONES PRESTADAS
		System.out.println("***LISTADO DE PUBLICACIONES QUE SON LIBROS***");
		for (Publicaciones p : listadoPublicaciones) {
			if (p instanceof Libros) {
				System.out.println(p.toString());
				/*
				 * Ejemplo de polimorfismo, el metodo .toString(), se hereda de la clase padre y
				 * se sobreescribe en cada hijo, comportandose de diferente manera según se
				 * trate de revistas o de libros, ya que añade los atributos propios de estas
				 * clases
				 */
			}
		}

		System.out.println("***LISTADO DE PUBLICACIONES QUE SON REVISTAS***");
		for (Publicaciones p : listadoPublicaciones) {
			if (p instanceof Revistas) {
				System.out.println(p.toString());
			}
		}

		System.out.println("***LISTADO DE PUBLICACIONES QUE SE ENCUENTRAN PRESTADAS");
		for (Publicaciones p : listadoPublicaciones) {
			if (((Libros) p).prestado()) {
				System.out.println(p.toString());
			}
		}

	}
}
