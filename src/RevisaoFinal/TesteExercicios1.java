/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RevisaoFinal;

import Threads.*;

/**
 *
 * @author Náyron dos Anjos
 */
public class TesteExercicios1 {
    
    public static void main(String[] arsg){
        Exercicio1 p1 = new Exercicio1();
        
        Thread t1 = new Thread(p1);
        t1.start();
        
       
    }
    
}
