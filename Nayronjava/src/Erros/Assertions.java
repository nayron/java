/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Erros;

import java.util.Scanner;

/**
 *
 * @author Nayron
 */
public class Assertions{
    
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        
        System.out.println("Entre com o numero de 0 a 10");
        int numero = s.nextInt();
            
        assert(numero >= 0 && numero <=10) : "numero invalido " + numero;
        
        System.out.println("Vc entrou com " + numero);
    }
    
}
