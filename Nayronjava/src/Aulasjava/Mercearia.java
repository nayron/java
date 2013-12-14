package Aulasjava;

import java.util.Scanner;

public class Mercearia {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int contador, op;
		float soma, valor_produto;
		do {
			
			contador = 0;
			soma = 0;
			System.out.println("||>>>Digite o valor do produto<<<||");
			valor_produto = sc.nextFloat();
			while (valor_produto > 0) {
				soma += valor_produto;
				contador++;
				System.out.println("||>>>Proximo produto<<<||");
				valor_produto = sc.nextFloat();
			}
			System.out.println("numeros de itens comprados = " + contador);
			System.out.println("Valor total R$" + soma);
			System.out.println("Deseja zerar a contador [1p/Sim] ou [2p/Sair");
			op = sc.nextInt();
		} while (op == 1);
		System.exit(0);
	}

}
