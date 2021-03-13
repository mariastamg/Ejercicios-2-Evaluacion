package unidad6.clases;

import java.util.ArrayList;

public class Entrenador {
	
	
	String nombreEntrenador;
	ArrayList<Pokemon>listadoPokemon=new ArrayList();
	int numInsignias;
	
	public Entrenador(String nombreEntrenador, ArrayList<Pokemon> listadoPokemon, int numInsignias) {
		this.nombreEntrenador = nombreEntrenador;
		this.listadoPokemon = listadoPokemon;
		this.numInsignias = numInsignias;
	}
	
	public String getNombreEntrenador() {
		return nombreEntrenador;
	}
	public void setNombreEntrenador(String nombreEntrenador) {
		this.nombreEntrenador = nombreEntrenador;
	}
	public ArrayList<Pokemon> getListadoPokemon() {
		return listadoPokemon;
	}
	public void setListadoPokemon(ArrayList<Pokemon> listadoPokemon) {
		this.listadoPokemon = listadoPokemon;
	}
	public int getNumInsignias() {
		return numInsignias;
	}
	public void setNumInsignias(int numInsignias) {
		this.numInsignias = numInsignias;
	}
	@Override
	public String toString() {
		return "Entrenador [nombreEntrenador=" + nombreEntrenador + ", listadoPokemon=" + listadoPokemon
				+ ", numInsignias=" + numInsignias + "]";
	}
	
	

}
