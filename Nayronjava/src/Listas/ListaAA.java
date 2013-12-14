package Listas;

import java.util.*;

class Contato {
    String nome;
    String end;
    int idade;

    public Contato(String nome, String end, int idade)
    {
        this.nome = nome;
        this.end = end;
        this.idade = idade;
    }
}

public class ListaAA {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

        ArrayList<Contato> cadastro = new ArrayList<Contato>();
        String nome ;
        String ende;
        int idad ;
        
        nome = entrada.nextLine();
        ende = entrada.nextLine();
         idad = entrada.nextInt(); 
         cadastro.add(new Contato(nome, ende, idad));
         
        while(idad > 0 ){
        	entrada.next();
         nome = entrada.nextLine();
        ende = entrada.nextLine();
         idad = entrada.nextInt();
       
         cadastro.add(new Contato(nome, ende, idad));
         
        }
        
       
       



        // exibe valores da lista
        for(int i = 0; i < cadastro.size(); i++)
        {
            System.out.println(cadastro.get(i).nome);
            System.out.println(cadastro.get(i).end);
            System.out.println(cadastro.get(i).idade);
            System.out.println("-----------------------");
        }
    }

}

