/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios18_11;

/**
 *
 * @author Náyron dos Anjos
 */
public class Ex3TesteFatura {
    
    public static void main(String[] args){
        Fatura f = new Fatura(01, "TV LED", 1, 2200);
        
        System.out.println("A fatura da TV = "+f.getfatura());
    }
    
}
