/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_E_EntradaDeDados;

import java.util.Scanner;

/**
 *
 * @author Náyron dos Anjos
 */
public class ArrayNota {
    
   public static void main(String[] args){
       
       Scanner entrada = new Scanner(System.in);
       float nota[] = new float[3];
   
       for(int i = 0;i<2;i++){
           System.out.println("entre com duas notas pessoa");
           nota[i] = entrada.nextFloat();
           
       }
       nota[2] = (nota[0]+nota[1])/2;
       System.out.print("Media = "+nota[2]);
       System.out.println();
       
   }
    
}
