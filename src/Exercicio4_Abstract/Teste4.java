/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4_Abstract;

/**
 *
 * @author Náyron dos Anjos
 */
public class Teste4 {
    
    public static void main(String[] args){
        Automovel a = new Automovel(10);
        Bicicleta b = new Bicicleta(0);
        
        System.out.println("Velocidade " + a.acelerar(10));
        System.out.println("Velocidade " + b.acelerar(10));
        b.parar();
        a.parar();
    }
    
}
