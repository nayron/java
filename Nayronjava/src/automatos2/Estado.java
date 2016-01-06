package aut�mato;

import java.util.HashMap;

public class Estado {
	public final HashMap<Character, Estado> estados
		= new HashMap<Character, Estado>(); 
	
	public Estado pr�ximoEstado(char s�mbolo) {			
		return estados.get(s�mbolo);
	}
	
	public void adicionarSa�da(Estado estado, char... s�mbolos) {
		for (char s�mbolo : s�mbolos) {
			estados.put(s�mbolo, estado);
		}
	}
}
