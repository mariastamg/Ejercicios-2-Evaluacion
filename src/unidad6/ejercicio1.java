package unidad6;

public class ejercicio1 {

	public static void main(String[] args) {
		
		System.out.println(isInt("4"));
		System.out.println(isDouble("4.50"));

	}

	public static boolean isInt(String n) {

		boolean respuesta;
		try {
			Integer.parseInt(n);
			respuesta = true;
		} catch (NumberFormatException exception) {
			respuesta = false;
		}
		return respuesta;
	}
	
	public static boolean isDouble(String n) {
		
		boolean respuesta;
		try {
			Double.parseDouble(n);
			respuesta=true;
		}catch (NumberFormatException exception) {
			respuesta=false;
		}
		return respuesta;
	}

}
