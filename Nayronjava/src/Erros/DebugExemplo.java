/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Erros;

/**
 *
 * @author Nayron
 */
public class DebugExemplo {
    int resultado;
    
    public int raiz(int numero){
        int raiz = 0, impar = 1;
        while(numero >= impar){
            numero -= impar;
            impar += 2;
            ++raiz;
            
        }
        return raiz;
    }
    
    public static void main(String[] args){
     
        int numero = 16;
        DebugExemplo exemplo = new DebugExemplo();
        
        int raiz = exemplo.raiz(numero);
        
        if(raiz == 4){
            System.out.println("Raiz correta");
        }
    }
}
