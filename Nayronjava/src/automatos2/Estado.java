package automatos2;

import java.util.HashMap;

public class Estado {
	public final HashMap<Character, Estado> estados
		= new HashMap<Character, Estado>(); 
	
	public Estado proximoEstado(char simbolo) {			
		return estados.get(simbolo);
	}
	
	public void adicionarSaida(Estado estado, char... simbolos) {
		for (char simbolo : simbolos) {
			estados.put(simbolo, estado);
		}
	}
}
