/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaoFinal;

import Threads.*;

/**
 *
 * @author Náyron dos Anjos
 */
public class Exercicio2 extends Thread {

 
    private String nome_da_thread;

    public Exercicio2(String nome) {
        nome_da_thread = nome;

    }

    public void run() {
        
        for(int i = 0; i<10;i++){
           
             System.out.println("nome "+nome_da_thread);
        
        }
    }
} 
    
    
    

