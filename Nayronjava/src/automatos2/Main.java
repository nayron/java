package autômato;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Estado q0 = new Estado(),
			   q1 = new Estado(),
			   q2 = new Estado(),
			   q3 = new Estado();
		
		q0.adicionarSaída(q1, 'a');
		q0.adicionarSaída(q3, 'b');
		
		q1.adicionarSaída(q0, 'a');
		q1.adicionarSaída(q2, 'b');
		
		q2.adicionarSaída(q3, 'a');
		q2.adicionarSaída(q1, 'b');
		
		q3.adicionarSaída(q2, 'a');
		q3.adicionarSaída(q0, 'b');
		
		Autômato autômato = new Autômato();
		autômato.definirEstadoInicial(q0);
		autômato.definirEstadosFinais(q0);
		
		try {			
			String símbolos = JOptionPane.showInputDialog("Digite a sequência de símbolos para ser testada no autômato:");
			if (autômato.validarSímbolos(símbolos.toCharArray())) {
				System.out.println("A seguência de símbolos chega ao fim do autômato");
			} else {
				System.out.println("A seguência de símbolos não chega ao fim do autômato");
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
	}

}
