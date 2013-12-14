package Listas;
import java.util.*;

public class ListaDinamicaHeterogenea {

	 private static class LISTA {

	        String nome;

	        int idade;

	        public LISTA prox;

	    }

	 

	    public static void main(String[] args) {

	        Scanner entrada = new Scanner(System.in);

	 

	        LISTA inicio = null;

	        LISTA fim = null;

	        LISTA aux;

	 

	        // entrada de dados na lista

	        for (int i = 0; i < 3; i++) {

	            LISTA lista = new LISTA();

	            System.out.print("Digite o nome :");

	            lista.nome = entrada.next();

	            System.out.print("Digite o idade :");

	            lista.idade = entrada.nextInt();

	 

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

	                System.out.println(aux.nome + ", " + aux.idade + " ");

	                aux = aux.prox;

	            }

	 

	        }

	    }
}
