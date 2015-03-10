/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threads;

import java.util.Collection;

/**
 *
 * @author Náyron dos Anjos
 */
public class ProduzMensagens implements Runnable
{
    private int comeco;
    private int fim;
    private Collection<String> mensagens;
    
    public ProduzMensagens(int comeco, int fim,Collection<String> mensagens){
        this.comeco = comeco;
        this.fim = fim;
        this.mensagens  = mensagens;
    }
    
    public void run(){
        for(int i = comeco;i<fim;i++){
            mensagens.add("Mensagem " + i);
        }
    }
    /*public void run(){
        for(int i = comeco;i<fim;i++){
            synchronized(mensagens){
            mensagens.add("Mensagem " + i);
    }
        }
    }*/
    
    
}
