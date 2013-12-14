/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.io.PrintStream;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nayron
 */
public class ExpressaoRegulares {

    public static void main(String[] args) {

        /*MODIFICADORES:
         (?i) ,   Ignora Maiuscula e minuscula
         (?x) ,  Comentarios
         (?m),  Multilinhas
         (?s),   Dottal*/
        boolean b = "Java".matches("(?i)java");
        //   System.out.println(b);

        /*METACARACTERES:
         . Qualquer caracter
         \d    Digitos                          [0-9]
         \D   Não e digito                  [^0-9]
         \s    Espaços                         [ \t \n \x0B \f  \r ]
         \S    Não e Espaço               [ ^\s ]     
         \w   Letra                              [a-zA-Z_0-9]
         \W  Não e letra
         */
        b = "@".matches(".");//avaliando se @ e um caracter
        b = "12345".matches("\\d");// se 12345 e um numero
        b = "A".matches("\\w");// se A e uma letra ou numero
        b = " ".matches("\\s");//se tem espaços

        String cep = "\\d\\d\\d\\d\\d-\\d\\d\\d";
        b = "77001-608".matches(cep);
        // System.out.println(b);

        /*QUANTIFICADORES:
         X{n}           X, examtamente n vezes                         
         X{n,}          X, pelo menos n vezes                 
         X{n, m}      X, pelo menos n mas não mais que m vezes                                          
         X?               X, 0 ou 1 vez                          
         X*               X, 0 ou + vezes                                                 
         X+              X,1  ou + vezes                
         */
        b = "21".matches("\\d{2}");
        b = "213".matches("\\d{2,}");
        b = "12345".matches("\\d{2,5}");
        b = "".matches(".?");//0-1
        b = "ab".matches(".*");//0 ou + caracter
        b = "123".matches(".+");//1 ou + caracter
        b = "77001-608".matches("\\d{5}-\\d{3}");

        /*Metacaracter de fronteira //pra saber se sua string começa ou finaliza com tal caracter
         ^ inicia
         $ Finalizas   
         |  ou
         */
        b = "Pier21".matches("^Pier.*");
        b = "Pier21".matches(".*21$");
        b = "Pier21".matches("^Pier.*");
        b = "tem java aqui".matches(".*java.*");
        b = "tem java aqui".matches("^tem.*aqui$");
        b = "sim".matches("sim|não");

        /*Agrupadores 
         [...]                      Agrupamento
         [a-z]                    Alcance
         [a-e][i-u]             União
         [a-z&&[aeiou]]     Interseção
         [^abc]                 Exceção
         [a-z&&[^m-p]]    Subtração
         \x                        Fuga literalS
         */
        b = "x".matches("[a-z]");
        b = "4".matches("[0-9]");
        b = "True".matches("[tT]rue");//True ou true
        b = "Nayron".matches("[A-Z][a-zA-Z]*");
        b = "olho".matches("[^abc]lho");
        b = "crau".matches("cr[ae]u");
        b = "rh@xti.com".matches("\\w+@\\w+\\.\\w{2,3}");

        String doce = "qual é o Doce mais doCe que o doce?";
        Matcher matcher = Pattern.compile("(?i)doce").matcher(doce);
        while (matcher.find()) {
            // System.out.println(matcher.group());
        }
        String r = doce.replaceAll("(?i)doce", "docinho");
        String rato = "O rato roeu a roupa do rei de roma";
        r = rato.replaceAll("r[aeiou]", "XX");
        r = "Tabu este texto".replaceAll("\\s", "\t");
        String url = "www.xti.com.br/clientes-2011.html";
        //http://www.xti.com.br/2011/clientes.jsp
        String re = "www.xti.com.br/\\w{2,}-\\d{4}.html";
         b = url.matches(re);
        re = "(www.xti.com.br)/(\\w{2,})-(\\d{4}).html";
         r = url.replaceAll(re, "http//$1/$3/$2.jsp");
        
        System.out.println(r);
        System.out.println(url);
    }

}
