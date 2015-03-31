/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package RevisaoFinal;

/**
 *
 * @author Náyron dos Anjos
 */
public class TesteExercicios2 {
    
    public static void main(String[] args) throws InterruptedException{
        
    Exercicio2 t1 = new Exercicio2("Th.....1");
    t1.start();
    t1.join();
    Exercicio2 t2 = new Exercicio2("Th......2");
    t2.start();
    t2.join();
     Exercicio2 t3 = new Exercicio2("Th.......3");
    t3.start();
    t3.join();
     Exercicio2 t4 = new Exercicio2("Th........4");
    t4.start();
      t4.join();  
    }
    
}
