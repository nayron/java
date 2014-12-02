/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array_E_EntradaDeDados;
import java.util.*;
/**
 *
 * @author Náyron dos Anjos
 */
public class ArrayBooleando {
    
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        
        boolean[] n = new boolean[10];
        int T = 0;
        System.out.println("Digite true ou false");
        for(int i=0;i<n.length;i++)
        {
            System.out.println("Indece " + i + " = ");
            n[i] = entrada.nextBoolean();
            if(n[i] == true){
                T++;
            }
            
        }
        System.out.println("Foram digitados = " + T + " True");
        
    }
    
}
