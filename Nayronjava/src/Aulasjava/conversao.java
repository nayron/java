package Aulasjava;
import java.util.Scanner;

public class conversao {
   public static void main(String[] args){
	   Scanner ls = new Scanner(System.in);

		System.out.println("Digite um numero inteiro para conversão: ");
		int numero = ls.nextInt();
		
		System.out.printf("%d na base Hexadecimal = %x\n", numero, numero);
		System.out.printf("%d na base Octal = %o\n", numero, numero);
	
   }
}
