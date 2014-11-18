/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios18_11;

/*
 *
 * @author Náyron dos Anjos
 */
public class Ex4Conta {
    
    public static void main(String[] args){
        Conta c = new Conta();
        Conta ct = new Conta(23456, "jose");
        
        System.out.println("saldo apos deposito de "+c.depositar(300));
        System.out.println("Saldo apos o saque de "+c.sacar(134));
    }
    
}
