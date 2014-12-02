/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_E_EntradaDeDados;


/**
 *
 * @author Náyron dos Anjos
 */
public class ArrayDobro {
    
    public static void main(String[] args){
        
        
        int num[] = new int[5];
        
        for(int i = 0;i<num.length;i++){
            System.out.println("Digite um numero: ");
            num[i] = i;
            num[i]*=2; 
        }
        for(int i = 0;i<num.length;i++){
            System.out.println("Indice = " + i + " Dobro = " +num[i]);
        }
        
    }
    
}
