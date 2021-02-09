package unidad5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Mazo {
	public static String[] palo = { "treboles", "diamantes", "corazones", "picas" };
	public ArrayList<Naipe> naipe;

	public Mazo() {
		naipe = new ArrayList<Naipe>();
		for (String palo : palo)
			for (int i = 1; i <= 13; i++)
				if (i==1)
					naipe.add(new Naipe(palo,"As(A)",i));
				else if (i==10)
					naipe.add(new Naipe(palo,"Jack(J)",i));
				else if (i==11)
					naipe.add(new Naipe(palo,"Queen(Q)",i));
				else if (i==12)
					naipe.add(new Naipe(palo,"King(K)",i));
				else
					naipe.add(new Naipe(palo,Integer.toString(i),  i));
	}

	public Mazo(int n) {
		naipe = new ArrayList<Naipe>();
		for (int x = 0; x < n; x++) {
			for (String palo : palo)
				for (int i = 1; i <= 13; i++)
					if (i==1)
						naipe.add(new Naipe(palo,"As(A)",i));
					else if (i==10)
						naipe.add(new Naipe(palo,"Jack(J)",i));
					else if (i==11)
						naipe.add(new Naipe(palo,"Queen(Q)",i));
					else if (i==12)
						naipe.add(new Naipe(palo,"King(K)",i));
					else
						naipe.add(new Naipe(palo,Integer.toString(i),  i));
		}

	}

//get: retorna un naipe elegido de forma aleatoria sin retirarlo del mazo. Hacemos un suffle y retiramos la carta en posicion 1
	public Naipe getNaipe() {
		System.out.println("Vamos a sacar un naipe de manera aleatoria");
		Collections.shuffle(naipe);
		Naipe carta = naipe.get(0);
		return carta;
	}

	// remove: retorna un naipe elegido de forma aleatoria retirándolo del mazo.
	public Naipe removeNaipe() {
		System.out.println("Vamos a sacar un naipe de manera aleatoria y retirarlo del mazo");
		Collections.shuffle(naipe);
		Naipe carta = naipe.remove(0);
		return carta;
	}

	// add: añade un naipe al mazo.
	public void addNaipe(Naipe carta) {
		naipe.add(carta);
	}

	// addAll: addAll: añade al mazo los naipes almacenados en una colección que se
	// recibe a través de un parámetro forma.
	public void addAllNaipe(ArrayList<Naipe> naipe2) {
		naipe.addAll(naipe2);
	}

}



