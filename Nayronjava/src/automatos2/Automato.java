package automatos2;

public class Automato {
	private Estado[] estadosFinais;
	private Estado estadoInicial;
	
	public Automato() {
		
	}
	
	public Automato(Estado estadoInicial, Estado... estadosFinais) {
		this.estadoInicial = estadoInicial;
		this.estadosFinais = estadosFinais;
	}
		 
	public void definirEstadosFinais(Estado... estados) {
		estadosFinais = estados;
	}
	
	public void definirEstadoInicial(Estado estado) {
		estadoInicial = estado;
	}
	
	public boolean validarSimbolos(char... simbolos) throws Exception {
		Estado estado = estadoAtualAposSimbolos(simbolos);
		for (Estado estadoFinal : estadosFinais) {
			if (estado == estadoFinal) {
				return true;
			}
		}		
		return false;
	}
	
	public Estado estadoAtualAposSimbolos(char... simbolos) throws Exception {
		if (estadoInicial == null) {
			throw new Exception("Estado inicial nao definido");
		}
		if (estadosFinais == null || estadosFinais.length == 0) {
			throw new Exception("Estados finais n�o definidos");
		}
		
		Estado estadoAtual = estadoInicial;
		
		for (char simbolo : simbolos) {
			estadoAtual = estadoAtual.proximoEstado(simbolo);
			
			if (estadoAtual == null) {
				throw new Exception("Estado sem ligacao para o simbolo " + simbolo);
			}				
		}
		return estadoAtual;
	}
}
