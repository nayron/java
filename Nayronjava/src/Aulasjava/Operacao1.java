package Aulasjava;
import java.util.Scanner;

public class Operacao1 {
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int [] vetor = new int[10];
		
		for(int i=0;i<10;i++){
		vetor[i] = ler.nextInt();
		}
		System.out.println("Numeros fora de ordem");
		for(int i=0;i<vetor.length;i++){
			System.out.println(vetor[i]);
		}
		for(int i=0;i<vetor[0]-1;i++){
			for(int j=0;j<vetor[0];j++){
				if(vetor[i]>vetor[j]){
					int temp = vetor[i];
					vetor[i] = vetor[j];
					vetor[j] = temp;
				}
				
			}
		}
		System.out.println("Vetor ordenado: ");
		for(int i =0;i<vetor.length;i++){
			System.out.println(vetor[i]+"");
			
		
		System.out.println("Numero de Elementos" + vetor[0]);
		}
		

	}

}
