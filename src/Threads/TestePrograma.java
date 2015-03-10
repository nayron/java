/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Threads;

/**
 *
 * @author Náyron dos Anjos
 */
public class TestePrograma {
    
    public static void main(String[] arsg){
        Programa p1 = new Programa();
        p1.setId(1);
        
        Thread t1 = new Thread(p1);
        t1.start();
        
        Programa p2 = new Programa();
        p2.setId(2);
        
        Thread t2 = new Thread(p2);
        t2.start();
    }
    
}
