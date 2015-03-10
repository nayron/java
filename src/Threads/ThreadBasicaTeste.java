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
public class ThreadBasicaTeste {
    
    public static void main(String[] args){
        
    ThreadBasica t1 = new ThreadBasica(1);
    t1.setPriority(1);
    t1.start();
    ThreadBasica t2 = new ThreadBasica(2);
    t2.setPriority(2);
    t2.start();
    
    ThreadBasica t3 = new ThreadBasica(3);
    t3.start();
    ThreadBasica t4 = new ThreadBasica(4);
    t4.start();
        
    }
    
}
