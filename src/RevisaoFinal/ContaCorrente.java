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
public class ContaCorrente {
    
    private float Limite;
    private float saldo;
    private float valorLimite;

    public ContaCorrente(float saldo,float Limite,float valorLimite) {
       
        this.saldo = saldo;
        this.Limite = Limite;
        this.valorLimite = valorLimite;
    }
    
    
    
    public void sacar(float valor){
         if((saldo<valor) || (valor < 0)){
            throw new IllegalArgumentException("Erro ao sacar");
        }else{
            saldo = saldo-valor;
        }
         System.out.println(saldo);
    }
    public void depositar(float valor){
        if(valor<=0){
            throw new IllegalArgumentException("Impossivel deposistar valor negativo");
        }else if(valor>Limite){
                throw new IllegalArgumentException("Valor Maior do seu limite permite");
        }else{
            
            saldo = saldo+valor;
        }
        System.out.println(saldo);
    }
    public void setValorLimite(float  valor){
         if(valor>valorLimite){
                throw new IllegalArgumentException("Valor Maior do oque o banco permite");
        }else{
             saldo = saldo+valor;
         }
         System.out.println(valorLimite);
    }
    
}
