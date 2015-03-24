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
         Thread t2 = new Thread(new Exercicio3(1000, 2000));
         t2.start();
         Thread t3 = new Thread(new Exercicio3(2000, 3000));
         t3.start();
         Thread t4 = new Thread(new Exercicio3(3000, 4000));
         t4.start();
         Thread t5 = new Thread(new Exercicio3(4000, 5000));
         t5.start();
         Thread t6 = new Thread(new Exercicio3(5000, 6000));
         t6.start();
         Thread t7 = new Thread(new Exercicio3(6000, 7000));
         t7.start();
         Thread t8 = new Thread(new Exercicio3(7000, 8000));
         t8.start();
         Thread t9 = new Thread(new Exercicio3(8000, 9000));
         t9.start();
         Thread t10 = new Thread(new Exercicio3(9000, 9999));
         t10.start();
         
          
          
          
     }
    
}
