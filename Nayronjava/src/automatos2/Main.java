package automatos2;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Estado q0 = new Estado(),
			   q1 = new Estado(),
			   q2 = new Estado(),
			   q3 = new Estado();
		
		q0.adicionarSaida(q1, 'a');
		q0.adicionarSaida(q3, 'b');
		
		q1.adicionarSaida(q0, 'a');
		q1.adicionarSaida(q2, 'b');
		
		q2.adicionarSaida(q3, 'a');
		q2.adicionarSaida(q1, 'b');
		
		q3.adicionarSaida(q2, 'a');
		q3.adicionarSaida(q0, 'b');
		
		Automato automato = new Automato();
		automato.definirEstadoInicial(q0);
		automato.definirEstadosFinais(q0);
		
		try {			
			String simbolos = JOptionPane.showInputDialog("Digite a sequencia de simbolos para ser testada no automato:");
			if (automato.validarSimbolos(simbolos.toCharArray())) {
				System.out.println("A seguencia de simbolos chega ao fim do automato");
			} else {
				System.out.println("A seguencia de simbolos nao chega ao fim do automato");
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
	}

}
