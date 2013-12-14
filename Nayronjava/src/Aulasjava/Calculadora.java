package Aulasjava;
/**
 * Calculadora simples by Náyron Dos Anjos Seilert
 */
import javax.swing.JOptionPane;//importando ao pacote JOptionPane.

public class Calculadora {
	
	public static void main(String[] args){
		int soma,sub,mult,div;
		
		System.out.println("digite o valor para a");
		String entrada = JOptionPane.showInputDialog("a");//digitando um valor do teclado
		int a = Integer.parseInt(entrada); // convertendo a String em inteiro.
		System.out.println("Agora valor para b");
		entrada = JOptionPane.showInputDialog(entrada);
		int b = Integer.parseInt(entrada);
		
		 
		   System.out.println("1 -> Somar");
		   System.out.println("2 -> Subtrair");
		   System.out.println("3 -> Multiplicar");
		   System.out.println("4 -> Dividir");
		   System.out.println(" Escolha uma opção do menu...::");
		   entrada = JOptionPane.showInputDialog("op");
		   int op = Integer.parseInt(entrada);
		   switch(op){
		   case 1: soma = a + b; System.out.println("a Soma = " + soma); break;
		   case 2: sub = a - b; System.out.println("a subtração = " + sub); break;
		   case 3: mult = a * b; System.out.println("a multiplicação = " + mult); break;
		   case 4: div = a / b; System.out.println("a Divisão = " + div);break;
		     
		     }
		   
		   }
	}




