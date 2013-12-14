package Aulasjava;
import java.util.Scanner;

public class Caculoidade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String nome = "Nayron";
		int ano, idade;

		System.out.println("Por favor digite o ano que vc nasceu para saber sua idade:\n");

		ano = ler.nextInt();

		idade = 2013 - ano;

		System.out.printf("Olá \" %s \" em 2013 vc fará = %d anos", nome, idade);

	}

}
