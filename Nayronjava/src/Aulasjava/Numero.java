package Aulasjava;
import java.util.Scanner;

public class Numero {
	 public static void main(String[] args){
	        Scanner ler = new Scanner(System.in);
			  
	        final int N = 100;
	        int i,num;
			
		    System.out.println("Digite um numero inteiro\n");
			num = ler.nextInt();
			
			for(i=num;i<=N;i++){
			    System.out.printf(","+i);
			}
	   }
	}


