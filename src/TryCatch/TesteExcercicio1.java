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
public class TesteExcercicio1 {
    
    public static void main(String[] args){
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
        int num2 =  Integer.parseInt(JOptionPane.showInputDialog("Digite outro número"));
        
       Exercicio1 ex = new Exercicio1(num1,num2);
       
       ex.divisao();
        
    }
    
}
