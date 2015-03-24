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
public interface TesteExercicios3 {
    
     public static void main(String[] args) throws InterruptedException{
         Thread t1 = new Thread(new Exercicio3(0,1000));
         
         t1.start();
         t1.join();
         Thread t2 = new Thread(new Exercicio3(1000, 2000));
         t2.start();
         t2.join();
         Thread t3 = new Thread(new Exercicio3(2000, 3000));
         t3.start();
         t3.join();
         Thread t4 = new Thread(new Exercicio3(3000, 4000));
         t4.start();
         t4.join();
         Thread t5 = new Thread(new Exercicio3(4000, 5000));
         t5.start();
         t5.join();
         Thread t6 = new Thread(new Exercicio3(5000, 6000));
         t6.start();
         t6.join();
         Thread t7 = new Thread(new Exercicio3(6000, 7000));
         t7.start();
         t7.join();
         Thread t8 = new Thread(new Exercicio3(7000, 8000));
         t8.start();
         t8.join();
         Thread t9 = new Thread(new Exercicio3(8000, 9000));
         t9.start();
         t9.join();
         Thread t10 = new Thread(new Exercicio3(9000, 9999));
         t10.start();
         t10.join();
         
          
          
          
     }
    
}
