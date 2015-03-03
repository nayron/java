/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TryCatch;

/**
 *
 * @author Náyron dos Anjos
 */
public class Conta {
    
    int saldo;
    
    Conta(int valor){
        saldo = valor;
        
    }
    
    public void sacar(int valor){

      /*  try{
           if(saldo>valor){
            saldo = saldo-valor;
           }
        }catch(IllegalArgumentException e){
            System.out.println();
            System.out.println(e.getMessage());
        }*/
        
        if(saldo<valor){
            throw new IllegalArgumentException("Saldo insuficiente");
        }else{
            saldo = saldo-valor;
        }
        
    }
    
    public void depositar(int valor){
        saldo = saldo+valor;
    }
    
    public void saldo(){
        
        System.out.println("Saldo = " + saldo);
    }
}
