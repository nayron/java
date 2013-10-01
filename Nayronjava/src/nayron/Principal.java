/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nayron;
 import java.util.*;
/**
 *
 * @author Náyron dos Anjos
 */
public class Principal {
       
    public static Cliente Popula(Cliente c){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do cliente: ");
        c.setNome(scan.nextLine());
       
        System.out.println();
        return c;
    }

    public static Atendente Popula(Atendente a){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o nome do atendente: ");
        a.setNome(scan.nextLine());
       
        System.out.println();
        return a;
    }

    public static Filme Popula(Filme f){
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o titulo do filme: ");
        f.setTitulo(scan.nextLine());
       
        System.out.println();
        return f;
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int op = 1;

    Pessoa p = new Pessoa();
    Cliente c = new Cliente();
    Atendente a = new Atendente();
    Filme f = new Filme();   

    while (op !=5){
        System.out.println("1 - Cadastro Cliente");
        System.out.println("2 - Cadastro Atendente");
        System.out.println("3 - Locação Filme");
        System.out.println("4 - Devolução Filme");
        System.out.println("5 - Sair");

    op = scan.nextInt();
   
    if(op==1){
    System.out.println("Cadastro  de Clientes");
        Cliente cadastraCliente[] = new Cliente[1];
        for (int i=0; i<1; i++){
            c = Popula(c);
            cadastraCliente[i] = c;
            c = new Cliente();
        }
    }
        else{
        if(op==2){
        System.out.println("Cadastro de Atendentes");
            Atendente cadastraAtendente[] = new Atendente[1];
            for (int i=0; i<1; i++){
                a = Popula(a);
                cadastraAtendente[i] = a;
                a = new Atendente();
            }
        }
            else{
            if(op==3){
            System.out.println("Locação de Filmes");
                Filme locaFilme[] = new Filme[1];
                for (int i=0; i<1; i++){
                    f = Popula(f);
                    locaFilme[i] = f;
                    f = new Filme();
                }
            }
                else{
                if(op==4){
                System.out.println("Devolução de Filmes");
                }
                    else{
                    if(op==5){
                    System.out.println("Sair do Programa");
                    }
                        else{
                                System.out.println("Opção Invalida");
                        }
                    }
                }
            }
        }
    }
}
}
