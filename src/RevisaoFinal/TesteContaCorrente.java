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
public class TesteContaCorrente {
    
    public static void main(String[] args){
        
        ContaCorrente c = new ContaCorrente(500, 6000, 50500);
        try{
        c.sacar(600);
       
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }
        
        try{
        c.depositar(-1);
        
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }

        try{
        
        c.setValorLimite(51500);
        }catch(IllegalArgumentException e){
            System.out.println(e.getMessage());
            
        }
        System.out.println();
    }
    
}
