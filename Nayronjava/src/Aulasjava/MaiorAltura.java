package Aulasjava;
/**
 * Programa que ler altura de 5 alunos e indica que é o mais alto e o mais beixo.
 */
import java.util.Scanner;

public class MaiorAltura {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		float altura, maior, menor;
		int i;
		System.out.println("||******************************||");
		System.out.printf(" ||Digite a altura do %d° aluno  ", 1);
		altura = ler.nextFloat();
		maior = altura;
		menor = altura;
		for (i = 1; i <= 4; i++) {
			System.out.println("||******************************||");
			System.out.printf(" ||Altura do %d° aluno  ", i + 1);
			altura = ler.nextFloat();
			if (altura > maior) {
				maior = altura;
			} else if (altura < menor) {
				menor = altura;
			}

		}
		System.out.printf("O aluno mais alto e de = %.2f \n", maior);
		System.out.printf("E o aluno mai beixo tem = %.2f \n", menor);
	}
}
