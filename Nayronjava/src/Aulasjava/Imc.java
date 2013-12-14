package Aulasjava;

import java.util.Scanner;
import java.io.IOException;

public class Imc {

	public static void main(String[] args) throws IOException {
		Scanner ler = new Scanner(System.in);

		char sexo;

		System.out.println("Escolha um sexo m ou f");
		sexo = (char) System.in.read();
		System.out.println("Entre com peso");
		double peso = ler.nextDouble();
		System.out.println("Entre com altura");
		double altura = ler.nextDouble();

		double imc = peso / (altura * altura);

		System.out.printf("imc e = %.2f ", imc);
		switch (sexo) {
		case 'm':
			if (imc < 19) {
				System.out.println("abaixo do peso");
			} else if (imc >= 19 && imc <= 25) {
				System.out.println("peso ideal");
			} else {
				System.out.println("acima do peso");
			}break;
		case 'f':
			
			if (imc < 18) {
				System.out.println("\nabaixo do peso");
			} else if (imc >= 18 && imc <= 24) {
				System.out.println("peso ideal");
			} else {
				System.out.println("acima do peso");
			}break;
			default:System.out.println("Sexo invalido");
		}
	}
}

