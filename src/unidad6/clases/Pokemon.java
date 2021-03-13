package unidad6.clases;

public class Pokemon {

	
	String nombrePokemon;
	Elemento elemPokemon;
	int saludPokemon;
	
	public Pokemon(String nombrePokemon, Elemento elemPokemon, int saludPokemon) {
		this.nombrePokemon = nombrePokemon;
		this.elemPokemon = elemPokemon;
		this.saludPokemon = saludPokemon;
	}
	
	public String getNombrePokemon() {
		return nombrePokemon;
	}
	public void setNombrePokemon(String nombrePokemon) {
		this.nombrePokemon = nombrePokemon;
	}
	public Elemento getElemPokemon() {
		return elemPokemon;
	}
	public void setElemPokemon(Elemento elemPokemon) {
		this.elemPokemon = elemPokemon;
	}
	public int getSaludPokemon() {
		return saludPokemon;
	}
	public void setSaludPokemon(int saludPokemon) {
		this.saludPokemon = saludPokemon;
	}
	@Override
	public String toString() {
		return "< "+ nombrePokemon + " > < " + elemPokemon + " > < " +saludPokemon+" >";
	}
	
	
}
