/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaoFinal;

import java.util.Scanner;

/**
 *
 * @author Náyron dos Anjos
 */
public class Exercicio3 implements Runnable {
    private int inicio;
    private int fim;
    public Exercicio3(int inicio,int fim) {
        this.inicio = inicio;
        this.fim = fim;
        
    }
    
    

    public void run() {
        int qtdDiv;
         
        for (int i = 1; i < 9999; i++) {
            qtdDiv = 0;
            for (int j = 1; j <= i; j++) {

                if (i % j == 0) {
                    qtdDiv = qtdDiv + 1;
                }
            }
            if (qtdDiv == 2) {
                System.out.println("Número Primo: " + i);
            }
        }

    }
}
