package Listas;

import java.util.Scanner;

public class Calcular {

	public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // variáveis primitiva em um vetor

        int lista[] = new int[10];

  
        for (int i=0;i<10;i++){

            System.out.print("Digite o número "+(i+1)+"o da lista: ");

            lista[i] = entrada.nextInt();

        }

        for (int i=0;i<10;i++){

            System.out.print(lista[i]+", ");

        }

    }























}
