/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RevisaoFinal;



/**
 *
 * @author Náyron dos Anjos
 */
public class Exercicio4 extends Thread{
     private String nome;

    public Exercicio4(String nome) {
        this.nome = nome;

    }

    public void run() {
        
       // for(int i = 1; i<=9;i++){
          
             System.out.print(nome+" ");
             
           
        //}
    }
    
}
