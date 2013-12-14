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
public class StringsOperacoes {

    public static void main(String[] args) {

        String s1 = "Aprendedo ";
        String s2 = s1 + "java";
        String s3 = new String("java é bom demais");
        char[] array = {'j', 'a', 'v', 'a'};
        String s4 = new String(array);
        String s5 = "";

        //Operaçoes basica de uma String
        int tamanho = s1.length();//retorna o numero de caracter de sua string
        char letra = s1.charAt(0); // metado utilizada p/ localizar um determinado caracter(0 a length()-1
        String texto = s1.toString(); // Retorna a propria String

      //  System.out.println("Tamanho s1 = " + tamanho + ", letra na posição 0 e = " + letra + ", função toString = " + texto);
       
        //Localização
        int p = s3.indexOf('b');// o metado retorna a posição onde esta a caracter 'b'
        int po = s3.indexOf("bom");// retorna a posição onde começa a String "bom"
        int pos = s3.lastIndexOf('a');// retorna a ultima posição ou seja onde está o ultimo 'a'
        boolean vazia = s5.isEmpty();//retorna true ou false se tiver vazia a string

        // System.out.println(vazia);
        
        //Comparação
        String x = "nayron";
        boolean n = x.equals("Nayron");//retorna comparação..se igual ou não
        boolean n2 = x.equalsIgnoreCase("NaYron");//Compara String ingnorando as letras maiusculas e minusculas
        boolean n3 = x.startsWith("na");//retorna se a string começa com caracter ou String informada
        boolean n4 = x.endsWith("on");//saber se String termina com tal letra ou ou silaba
        
        int c = "amor".compareTo("bola");// retorna se amor e menor do que bola(-1)
        int c2 = "bola".compareTo("amor");//retorna se bola e maior do que amor(1)
        int c3 = "amor".compareTo("amor");//se forem iguais retorna 0
        int c4 = "1".compareTo("9");
        //System.out.println("c = " + c+", c2 = "+ c2+", c3 = "+c3+", c4 = "+c4);
        
        String so = "olhe, olhe!";
        boolean o = so.regionMatches(6, "olhe", 0, 4);// quero saber se apartir da posição 6 exite "olhe" 
                                                      // começando da pos 0 a 4 0bs(cuidado com letras maiuscula e minuscula)
        boolean o2 = so.regionMatches(true,6, "Olhe", 0, 4);//ignora as letras maiuscula e minusculas
        //System.out.println(o2);
        
        //Extração
        String l = "O Brasil e lindo";
        String lb = l.substring(11);//retorna uma substring apartir da posição 11(lindo)
        String sl = l.substring(2, 8);// retorna a string da posição 2 ate a posição 8
        sl = l.concat(" que maravilha");// concatena string
        sl= l.replace('s', 'z');//faz a troca de s por z em todos os 's'
        sl = l.replaceFirst(" ", " x ");//Troca o primeiro espaço branco em x
        sl = l.replaceAll(" ", "x");// troca todos os espaços em branco por x
        sl = l.toUpperCase();//Converte todas as letras em maiusculas
        sl = l.toLowerCase();//Converte todas as letras em minusculas
       
      
       // System.out.println("   espaços    ".trim());//o trim() remove os espaços antes e depois da String
        System.out.println(sl);
    }

}
