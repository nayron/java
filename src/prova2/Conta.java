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
public class Conta {
    private float saldo;
    
    
   public void depositar(float valor){
       saldo = saldo+valor;
      
   }
   public void sacar(float valor){
       if(valor<0 || valor>saldo){
           throw new IllegalArgumentException("Erro");
       }else{
           saldo = saldo - valor;
       }
   }
   
   public void verSaldo(){
       System.out.println("Saldo  Final = " + saldo + " Reais !!");
   }
}
