/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Threads;

/**
 *
 * @author Náyron dos Anjos
 */
public class ThreadBasica extends Thread {

    private int tempo_de_sono;
    private int numero_da_thread;

    public ThreadBasica(int num) {
        numero_da_thread = num;
        tempo_de_sono = (int) (Math.random() * 5000);

    }

    public void run() {
        
        for(int i = 0; i<100;i++){
            if((numero_da_thread == 2) && (i == 25)){
                try{
                    Thread.sleep(10000);
                }catch(InterruptedException xx){
                    System.err.println("Erro !!");
                }
            }
             System.out.println("numero: " + getName());
        
        }
    }
} 
    
    
    

