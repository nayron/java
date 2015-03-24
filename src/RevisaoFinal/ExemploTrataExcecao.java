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
public class ExemploTrataExcecao {

    public static void main(String[] args) {
        try {
            int len = args.length;
            String s = args[len];
        } catch (Exception e) {
            System.out.println("Ocorreu uma excecao");
        }
        System.out.println("Vou terminar a execucao");
    }

}
