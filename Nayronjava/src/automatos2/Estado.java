package autômato;

import java.util.HashMap;

public class Estado {
	public final HashMap<Character, Estado> estados
		= new HashMap<Character, Estado>(); 
	
	public Estado próximoEstado(char símbolo) {			
		return estados.get(símbolo);
	}
	
	public void adicionarSaída(Estado estado, char... símbolos) {
		for (char símbolo : símbolos) {
			estados.put(símbolo, estado);
		}
	}
}
