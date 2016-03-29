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
public class Sacar extends Thread {
   
    Conta c;
   
    
    
    Sacar(Conta c){
        this.c = c;
    }
   
    
    public void run(){
        for(int i = 0 ;i<5;i++){
            c.sacar(-1);
            System.out.println("Foi sacado");
        }
        c.verSaldo();
    }
}
