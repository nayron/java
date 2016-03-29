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
public class Depositar extends Thread {
 
    
    Conta c;
    
   
    
    Depositar(Conta c){
        this.c = c;
    }
   
    
    public void run(){
        for(int i = 0; i<10;i++){
            c.depositar(10);
            System.out.println("valor já depositato");
            
        }
        c.verSaldo();
    }
}
