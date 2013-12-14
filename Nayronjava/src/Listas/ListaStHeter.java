package Listas;

import java.util.*;

public class ListaStHeter {
	
	public static class Lista {

        String nome;

        int idade;

    }

 

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

 

        // variáveis abstrata em um vetor

        Lista lista[] = new Lista[2];

 

        for (int i = 0; i < lista.length; i++) {

            lista[i] = new Lista();

        }

        for (int i = 0; i < lista.length; i++) {

            System.out.print("Digite o " + (i + 1) + "o nome da lista: ");

            lista[i].nome = entrada.next();

            System.out.print("Digite a " + (i + 1) + "o idade da lista: ");

            lista[i].idade = entrada.nextInt();

        }

        for (int i = 0; i < lista.length; i++) {

            System.out.print(lista[i].nome + ", ");

            System.out.println(lista[i].idade);

        }

    }

}
