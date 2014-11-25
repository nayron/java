/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3_Abstract;

/**
 *
 * @author Náyron dos Anjos
 */
public class Teste3 {
    
    public static void main(String[] args){
        CalculadoraCientifica cc = new CalculadoraCientifica(2, 3);
        
        
        System.out.println("Soma = " + cc.soma());
        System.out.println("Sub  = " + cc.sub());
        System.out.println("Mult = " + cc.mult());
        System.out.println("Div  = " + cc.div());
        System.out.println("Raiz = " + cc.raiz());
        System.out.println("Pot  = " + cc.potencia());
        
    }
    
}
