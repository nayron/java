/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RevisaoFinal;

import Threads.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Náyron dos Anjos
 */
public class Exercicio1 implements Runnable{
    
   
    private int contador;
    public void run(){
        for(int i = 1;i<=15;i++){
            if((i%2)!=0){
            System.out.println("valor " + i);
                try {
                    Thread.sleep(1);
                    contador++;
                } catch (InterruptedException ex) {
                    System.out.println("Erro!!!");
                }
        
            }
        }
            System.out.println("Contador = " + contador);
    }
}

    
