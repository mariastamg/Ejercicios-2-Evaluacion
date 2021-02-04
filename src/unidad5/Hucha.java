package unidad5;

import java.util.Scanner;

public class Hucha {
	
	static Scanner sc=new Scanner(System.in);

	private int cantidad1;
	private int cantidad2;
	private int cantidad5;
	private int cantidad10;
	private int cantidad20;
	private int cantidad50;
	private int totalEuros;
	private  boolean isAsbierta;
	private String password;
	
	public Hucha(int cantidad1, int cantidad2, int cantidad5, int cantidad10, int cantidad20, int cantidad50,
			int totalEuros, boolean isAsbierta, String password) {
		this.cantidad1 = cantidad1;
		this.cantidad2 = cantidad2;
		this.cantidad5 = cantidad5;
		this.cantidad10 = cantidad10;
		this.cantidad20 = cantidad20;
		this.cantidad50 = cantidad50;
		this.totalEuros = totalEuros;
		this.isAsbierta = isAsbierta;
		this.password = password;
	}

	public int getCantidad1() {
		return cantidad1;
	}

	public void setCantidad1(int cantidad1) {
		this.cantidad1 = cantidad1;
	}

	public int getCantidad2() {
		return cantidad2;
	}

	public void setCantidad2(int cantidad2) {
		this.cantidad2 = cantidad2;
	}

	public int getCantidad5() {
		return cantidad5;
	}

	public void setCantidad5(int cantidad5) {
		this.cantidad5 = cantidad5;
	}

	public int getCantidad10() {
		return cantidad10;
	}

	public void setCantidad10(int cantidad10) {
		this.cantidad10 = cantidad10;
	}

	public int getCantidad20() {
		return cantidad20;
	}

	public void setCantidad20(int cantidad20) {
		this.cantidad20 = cantidad20;
	}

	public int getCantidad50() {
		return cantidad50;
	}

	public void setCantidad50(int cantidad50) {
		this.cantidad50 = cantidad50;
	}

	public int getTotalEuros() {
		return totalEuros;
	}

	public void setTotalEuros(int totalEuros) {
		this.totalEuros = totalEuros;
	}

	public boolean isAsbierta() {
		return isAsbierta;
	}

	public void setAsbierta(boolean isAsbierta) {
		this.isAsbierta = isAsbierta;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	/**Comprobar contraseña*/
	public static void comprobarPass(Hucha hucha,String password) {
		System.out.println("Por favor introduzca la contraseña");
		password=sc.nextLine();
		if (password==hucha.getPassword()) {
			System.out.println("La contraseña es correcta");
		}else {
			System.out.println("La contraseña no es correcta");
		}
		
		
	}
	
	/**Abrir cerrar hucha*/
	public static void estadoHucha(Hucha hucha, String password){
    if (hucha.isAsbierta=true){
    	System.out.println("La hucha se encuentra abierta. ¿Desea cerrarla?");
    	String respuesta;
    	respuesta=sc.nextLine();
    	if(respuesta.equalsIgnoreCase("si")) {
    		comprobarPass(hucha,password);
    		hucha.setAsbierta(false);
    		System.out.println("La hucha se ha cerrado");
    	}else{
    		System.out.println("La hucha permanecera abierta");
    	}	
    		
    	}else {
    		System.out.println("La hucha se encuentra cerrada. ¿Desea abrirla?");
    		String respuesta;
    		respuesta=sc.nextLine();
    		if(respuesta.equalsIgnoreCase("no")) {
    			comprobarPass(hucha,password);
    			hucha.setAsbierta(true);
    			System.out.println("La hucha se ha abierto");
        	}else{
        		System.out.println("La hucha permanecera cerrada");
        	}	
    }

}
	
	public static void retirarEfectivo(Hucha hucha) {
		System.out.println("¿Cuantas monedas/billetes desea retirar?");
		int cantidad;
		cantidad=sc.nextInt();
		System.out.println("¿De que tipo?");
		int tipo=sc.nextInt();
		int total=cantidad*tipo;
		if (total>hucha.getTotalEuros()) {
			System.out.println("No hay suficiente dinero en la hucha, solo se puede sacar "+hucha.getTotalEuros()+" euros");
			hucha.setTotalEuros(0);
		}else {
			System.out.println("Se van a sacar de la hucha "+total+" euros");
			hucha.setTotalEuros(hucha.getTotalEuros()-total);
		}
	}


	@Override
	public String toString() {
		return "Hucha [cantidad monedas 1€=" + cantidad1 + ", cantidad monedas 2€=" + cantidad2 + ", cantidad billetes 5€=" + cantidad5
				+ ", cantidad billetes 10€=" + cantidad10 + ", cantidad billetes 20€=" + cantidad20 + ", cantidad billetes 50€=" + cantidad50
				+ ", Total contenido hucha=" + totalEuros + ", ¿Está la hucha abierta?=" + isAsbierta + ", password=" + password + "]";
	}
	
	
	

}
