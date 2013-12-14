package Atividades_C_em_Java;

import java.util.*;

public class VetorX {


	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i;
		int[] x = new int[15];
		int[] r = new int[5];
		int[] s = new int[10];
		
		for(i=0;i<5;i++){
			System.out.printf("R [%d] = ",i+1);
			r[i] = ler.nextInt();
			x[i] = r[i];
		}
		for(i=0;i<10;i++){
			System.out.printf("S[%d] = ",i+1);
			s[i] = ler.nextInt();
			x[i+5] = s[i];
		}
		for(i=0;i<15;i++){
			System.out.printf("\nX = [ %d ] : ",x[i]);
		}
		

	}

}
