package unidad5;

public class Naipe {
	
	public static String palo;
	public String rango;
	public int valor;
	
	public Naipe(String palo, String rango, int valor) {
		this.palo=palo;
		this.rango = rango;
		this.valor = valor;
	}

	public static String getPalo() {
		return palo;
	}

	public static void setPalo(String palo) {
		Naipe.palo = palo;
	}

	public String getRango() {
		return rango;
	}

	public void setRango(String rango) {
		this.rango = rango;
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Naipe [palo=" + palo +" rango=" + rango + ", valor=" + valor + "]";
	}
	
	
	
	
	
}