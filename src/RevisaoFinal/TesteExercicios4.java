/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaoFinal;

import static java.lang.Thread.MAX_PRIORITY;



/**
 *
 * @author Náyron dos Anjos
 */
public class TesteExercicios4 {

    public static void main(String[] args) throws InterruptedException {
        
        Exercicio4 t1 = new Exercicio4("A");
        t1.start();
        t1.join(1);
        Exercicio4 t2 = new Exercicio4("B");
        t2.start();
        t2.join(); 
        Exercicio4 t3 = new Exercicio4("C");
        t3.start();
        t3.join();

    }

}
