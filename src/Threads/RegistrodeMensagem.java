/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threads;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @author Náyron dos Anjos
 */
public class RegistrodeMensagem {
    
    public static void main(String[] args) throws InterruptedException{
        Collection<String> mensagens = new ArrayList<String>();
        
        Thread t1 = new Thread(new ProduzMensagens(0,10000, mensagens));
         Thread t2 = new Thread(new ProduzMensagens(10000, 20000, mensagens));
          Thread t3 = new Thread(new ProduzMensagens(20000, 30000, mensagens));
          
          t1.start();
          t2.start();
          t3.start();
          //fez que a thread que roda o main aguarde o fim desses
          
          t1.join();
          t2.join();
          t3.join();
          
          System.out.println("Thread produtoras de mensagens Finalizadas");
          //verifica se atodas as mensagens foram guardadas
          
          for(int i = 0; i < 15000; i++){
              if(!mensagens.contains("Mensagem " + i)){
                  throw new IllegalStateException("Não encontrei a mensagem " + i);
              }
          }
          
          // verifica se algumas mensagem ficou nula
          if(mensagens.contains(null)){
              throw new IllegalStateException("Não devia ter null aqui dentro");
          }
          
          System.out.println("Fim da execução com sucesso");
          
    }
    
}
