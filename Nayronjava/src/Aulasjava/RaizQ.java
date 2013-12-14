package Aulasjava;

import javax.swing.JOptionPane;

public class RaizQ {
	
	public static void main(String[] args) {
	String entrada = JOptionPane.showInputDialog("Por favor Digite um numero inteiro");
	Integer numero = Integer.parseInt(entrada);
    
	double raiz;
	raiz = Math.sqrt(numero);
	
	JOptionPane.showMessageDialog(null,"A raiz quadrada = " + raiz);
	}

}
