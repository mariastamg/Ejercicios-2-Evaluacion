package unidad5;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class JuegoNaipes {

	public static void main(String[] args) {
		
		Mazo m1=new Mazo();
		
		Iterator<Naipe> iterador = m1.naipe.iterator();
		while (iterador.hasNext()) {
			Naipe carta = iterador.next();
			System.out.println(carta);
		}
		
		System.out.println(m1.getNaipe());
		
		System.out.println(m1.removeNaipe());
		
		Naipe nuevo=new Naipe("picas", "7", 7);
		m1.addNaipe(nuevo);
		
		ArrayList<Naipe> nuevosNaipes = new ArrayList<Naipe>();
		nuevosNaipes.add(new Naipe("corazones", "As", 1));
		nuevosNaipes.add(new Naipe("picas", "Reina", 11));
		nuevosNaipes.add(new Naipe("trebol", "Rey", 12));
		nuevosNaipes.add(new Naipe("diamante", "6", 6));
		
		m1.addAllNaipe(nuevosNaipes);
		

	}

}
	

