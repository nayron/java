package aut�mato;

import javax.swing.JOptionPane;

public class Main {

	public static void main(String[] args) {
		Estado q0 = new Estado(),
			   q1 = new Estado(),
			   q2 = new Estado(),
			   q3 = new Estado();
		
		q0.adicionarSa�da(q1, 'a');
		q0.adicionarSa�da(q3, 'b');
		
		q1.adicionarSa�da(q0, 'a');
		q1.adicionarSa�da(q2, 'b');
		
		q2.adicionarSa�da(q3, 'a');
		q2.adicionarSa�da(q1, 'b');
		
		q3.adicionarSa�da(q2, 'a');
		q3.adicionarSa�da(q0, 'b');
		
		Aut�mato aut�mato = new Aut�mato();
		aut�mato.definirEstadoInicial(q0);
		aut�mato.definirEstadosFinais(q0);
		
		try {			
			String s�mbolos = JOptionPane.showInputDialog("Digite a sequ�ncia de s�mbolos para ser testada no aut�mato:");
			if (aut�mato.validarS�mbolos(s�mbolos.toCharArray())) {
				System.out.println("A segu�ncia de s�mbolos chega ao fim do aut�mato");
			} else {
				System.out.println("A segu�ncia de s�mbolos n�o chega ao fim do aut�mato");
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
		
	}

}
