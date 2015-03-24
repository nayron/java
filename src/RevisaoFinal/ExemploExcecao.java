/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaoFinal;

/**
 *
 * @author Náyron dos Anjos
 */
public class ExemploExcecao {

    public static void main(String[] args) {
        int len = args.length;
// a linha abaixo produz a exceção
// java.lang.ArrayIndexOutOfBoundsException
        String s = args[len];
        System.out.println("Vou terminar a execucao");
    }

}
