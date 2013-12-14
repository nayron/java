package Aulasjava;
import java.util.*;
public class Dado {
   
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
       
		int i,j, contador = 0,flag;
		
		do{
			
			
		for (i = 0; i < 10; i++) {
			System.out.println("Qual o seu Palpite?");
			int palpite = s.nextInt();
			Random n = new Random();
			int dado = n.nextInt(6) + 1;
			System.out.println("Palpite = " + palpite);
			System.out.println("Dado = " + dado);
			if (palpite == dado) {
				System.out.println("Acertou!!");
				contador++;
			} else {
				System.out.println("Errou!!!");
			}

		}
		System.out.println("Seu numero de acertos foi = " + contador);
		if (contador == 10) {
			System.out.println("Parabéns você eo cara!!!");
		} else if (contador > 5 && contador < 10) {
			System.out.println("Razoavel mas você pode melhorar!!");
		} else if (contador <= 5) {
			System.out.println("Tu e ruim demais hein...!!!");
		}
		System.out.println("Quer tentar de novo? 1 = /Sim ou 2 = /Não");
		flag = s.nextInt();
		}while(flag == 1);
	}
}
