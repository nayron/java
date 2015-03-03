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
public class Exercicio2 {
    
    public static void main(String[] args){
        
        int[] vetor = new int[]{2,4,6,8,10,12};
        try{
        for(int i = 0;i<=12;i++){
            System.out.println(vetor[i]);
            
        }
       }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("O vetor com com vagas existentes");
        }
        
        System.out.println("Fim do programa");
        
    }
    
}
