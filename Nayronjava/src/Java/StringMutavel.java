/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

/**
 *
 * @author Nayron
 */
public class StringMutavel {

    public static void main(String[] args) {

        StringBuffer s0 = new StringBuffer();
        StringBuilder s1 = new StringBuilder("java");

        /*s1.toString();
         //System.out.println(s1.length());
         s1.capacity();//informa a capacidade de armazenamento de novos caracteres dentro desse objeto dentro desse objeto sem alocar mais memoria
         // System.out.println(s1.capacity());
         System.err.println(s1);
         s1.reverse();//inverte a ordem dos caracteres
         */
        s1.append(" Trabalhando ");//metado utilizado para inserir novas palavras sem criar outros objetos
        char[] c = {'c','o','m'};
        s1.append(c).append(" Textos.");
        System.out.println(s1);
        
        String s = "oi "+" como"+"vai você?";
        String sb = new StringBuilder("oi").append("como").append("vai você?").toString();
        
        String url = new StringBuilder("www.abc.com.br").delete(0, 4).toString();
        System.out.println(url);
    }

}
