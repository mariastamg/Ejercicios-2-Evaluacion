package unidad6.clases;

import java.util.ArrayList;
import java.util.Scanner;

public class Torneo {

	static Scanner sc=new Scanner(System.in);
	
	static Pokemon p1=new Pokemon("Bulbasaur", Elemento.PLANTA, 50);
	static Pokemon p2=new Pokemon("Charmander", Elemento.FUEGO, 60);
	static Pokemon p3=new Pokemon("Squirtle", Elemento.AGUA, 80);
	static Pokemon p4=new Pokemon("Arbok", Elemento.VENENO, 70);
	static Pokemon p5=new Pokemon("Pikachu", Elemento.ELECTRICO, 90);
	static Pokemon p6=new Pokemon("Raichu", Elemento.ELECTRICO, 50);
	
	static ArrayList<Pokemon>listadoPokemon1=new ArrayList();

	static ArrayList<Pokemon>listadoPokemon2=new ArrayList();
	
	
	static Entrenador e1=new Entrenador("Smart", listadoPokemon1, 0);
	static Entrenador e2=new Entrenador("Fast", listadoPokemon2, 0);
	
	static Entrenador participante1;
	static Entrenador participante2;
	
	public static void main(String[] args) {
		
		listadoPokemon1.add(p1);
		listadoPokemon1.add(p3);
		listadoPokemon1.add(p5);
		
		listadoPokemon2.add(p2);
		listadoPokemon2.add(p4);
		listadoPokemon2.add(p6);
		
		seleccionarEntrenadores();
		
		
		
		//<nombre del entrenador> <nombre del pokemon> <elemento fundamental del pokemon> <salud del pokemon>
	
		
		//Torneo
		String elemento="";
		while(!elemento.equals("FIN")) {
		System.out.println("TORNEO");
		System.out.println("Introduzca un elemento entre los siguientes(PLANTA, FUEGO, AGUA, VENENO, ELECTRICO): ");
		elemento=sc.nextLine();
		if(!elemento.equals("FIN")) {
			obtenerInsignias(participante1, elemento);
			obtenerInsignias(participante2, elemento);
		}
		}
		System.out.println("FIN DEL TORNEO");
		System.out.println(participante1.toString());
		System.out.println(participante2.toString());
		
		
		
		
         
         
         //Elementos
		//Fin
		//Vencedor(nombre, insignias, pokemon supervivientes)

	}
	
	public static void seleccionarEntrenadores(){
		System.out.println("Introduzca el nombre de un entrenador:");
		String entrenador1=sc.nextLine();
		if(entrenador1.equals(e1.getNombreEntrenador())) {
			participante1=e1;
		}else {
			participante1=e2;
		}
		System.out.println("Introduzca el nombre del entrenador contrincante:");
		String entrenador2=sc.nextLine();
		if(entrenador2.equals(e1.getNombreEntrenador())) {
			participante2=e1;
		}else {
			participante2=e2;
		}
		
	}
	
	public static void obtenerInsignias(Entrenador entrenador, String elemento) {
		boolean encontrado = false;
		for (Pokemon p: entrenador.listadoPokemon) {
			if(elemento.equals(p.getElemPokemon().toString()))  {
				//System.out.println(entrenador.getNombreEntrenador() + " - " + p.getElemPokemon().toString());
				encontrado=true;
			}
		}
		//System.out.println(entrenador.getNombreEntrenador() + "-"+ encontrado);
		if(encontrado==true) {
			//System.out.println(entrenador.getNombreEntrenador() + "suma");
			entrenador.setNumInsignias(1+ entrenador.getNumInsignias());	
		}else {
			for (Pokemon p: entrenador.listadoPokemon) {
				p.setSaludPokemon(p.getSaludPokemon()-10);
				/*
				if(p.getSaludPokemon()<=0) {
					entrenador.listadoPokemon.remove(p);
				}
				*/
			}
		}
		
		
		
		
			
		
		
	}
	
	

}
