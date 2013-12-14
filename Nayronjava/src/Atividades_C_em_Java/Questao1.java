/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades_C_em_Java;

import java.util.Scanner;

/**
 *
 * @author Nayron
 */
public class Questao1 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Por favor digite a quantidade de numeros que serão digitados ");
        int n = ler.nextInt();

        int[] vetor = new int[n];
        int[] par = new int[n];
        int impar[] = new int[n];
        int somapar = 0, somaimpar = 0, x = 0, y = 0;

        for (int i = 0; i < n; i++) {
            vetor[i] = ler.nextInt();
        }
        for (int i = 0; i < n; i++) {
            if (vetor[i] % 2 == 0) {
                par[x] = vetor[i];
                x++;
            } else {
                impar[y] = vetor[i];
                y++;
            }
        }
        System.out.println("===Pares====");
        for (int i = 0; i < x; i++) {
            System.out.printf("%d,", par[i]);
            somapar = somapar + par[i];
        }
        System.out.println();
        System.out.println("===impar====");
        for (int i = 0; i < y; i++) {
            System.out.printf("%d,", impar[i]);
            somaimpar = somaimpar + impar[i];
        }
         System.out.println();
         System.out.println("A soma de todos os pares e = " + somapar);
         System.out.println("A soma de todos os impares e = " + somaimpar);

    }

}
