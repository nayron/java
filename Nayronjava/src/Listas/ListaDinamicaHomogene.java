package Listas;

import java.util.*;
public class ListaDinamicaHomogene {
	
	private static class LISTA {

        public int num;

        public LISTA prox;

    }

 

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

 

        LISTA inicio = null;

        LISTA fim = null;

        LISTA aux;

 

        // entrada de dados na lista

        for (int i = 0; i < 3; i++) {

            System.out.println("Digite o número :");

            LISTA lista = new LISTA();

            lista.num = entrada.nextInt();

 

            if (inicio == null) {

                inicio = lista;

                fim = inicio;

                lista.prox = null;

            } else {

                lista.prox = inicio;

                inicio = lista;

            }

        }

 

        // impressão dos dados da lista

        if (inicio == null) {

            System.out.println("Lista vazia!!");

        } else {

            aux = inicio;

            while (aux != null) {

                System.out.print(aux.num + " ");

                aux = aux.prox;

            }

 

        }

    }

}
