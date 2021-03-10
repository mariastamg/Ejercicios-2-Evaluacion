package unidad6.excepciones;

import java.util.Scanner;

public class Ejercicio3 {
	
	static Scanner sc=new Scanner(System.in);

	public static void main(String[] args) {
		
		 String comando="";
		 int a=0;
		 int b=0;
		 
		 while(!comando.equals("F")) {
		 
		 try {
			 System.out.println("> ");
			 comando=sc.nextLine();
			 
			 if(comando.equals("A")) {
				 try {
				 System.out.println("> ");
				 a=sc.nextInt();
				 sc.nextLine();
				 }catch (NumberFormatException e) {
					 System.err.println("El formato de numero introducido no es correcto");
				 }
			 } else if (comando.equals("B")) {
				 try {
				 System.out.println("> ");
				 b=sc.nextInt();
				 sc.nextLine();
				 }catch (NumberFormatException e) {
					 System.err.println("El formato de numero introducido no es correcto");
				 }
			 }
		  else if (comando.equals("C")) {
			  try {
			 System.out.println("> "+calcularHipotenusa(a, b)); 
			 a=0;
			 b=0;
			  } catch (Exception e) {
					 System.err.println("Error calculando hipotenusa");
				 }
		 }else{
			 System.out.println("Opcion no valida"); 
		 }
			 
			 
		 }catch (Exception e) {
			 System.err.println("El comando introducido no es correcto");
		 }
		 
		 }
			
		
	
		 System.out.println("Saliendo del programa");
	 
	
	 
	 
	 
	
	 
	 
	

	}
	
	public static double calcularHipotenusa(double a, double b) {
	
		double c=Math.sqrt(Math.hypot(a, b));
		
		return c;
		
	}

}
