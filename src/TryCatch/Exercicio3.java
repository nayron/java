/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package TryCatch;

import javax.swing.JOptionPane;

/**
 *
 * @author Náyron dos Anjos
 */
public class Exercicio3 {
    
    public static void main(String[] args) {  
  
        int[] lista = new int[10];
        
  
  
        try {  
            for(int j = 0;j<10;j++){ 
                String valor = JOptionPane.showInputDialog("Informe um valor real: ");  
  
                lista[j] = Integer.parseInt(valor);   
                
                                
            }  
            
            for (int i = 0; i <11; i++) {  
                System.out.println("Posição " + i + " = " + lista[i]);  
            }  
        } catch (ArrayIndexOutOfBoundsException e) {  
            System.out.println("Erro capturado: " + e);  
            e.getMessage();  
        } catch (NumberFormatException f) {  
            System.out.println("Erro capturado: " + f);  
            f.getMessage();  
        }  
    }  
    
}
