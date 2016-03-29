package prova2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Náyron dos Anjos
 */
public class TesteContas {
    
    public static void main(String[] args) throws InterruptedException{
        
       Conta c = new Conta();
    
        Thread t1 = new Thread(new Depositar(c));
        
        Thread t2 = new Thread(new Sacar(c));
        
        t1.start();
        t1.join();
        
        t2.start();
        t2.join();
       
         
        
    }
    
}
