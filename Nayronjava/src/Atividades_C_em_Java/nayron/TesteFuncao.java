/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades_C_em_Java.nayron;

import static Atividades_C_em_Java.nayron.Funcao.soma2;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Nayron
 */
public class TesteFuncao {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        double num1;
        double num2;
        double resultado;

        Funcao n = new Funcao();

        System.err.println("Escolha Uma Opção........");
        System.err.println("1 = Soma.................");
        System.err.println("2 = Subtrair.............");
        System.err.println("3 = Multiplicar..........");
        System.err.println("4 = Dividir..............");
        System.err.println("5 = Somar varios numeros.");
        String n2 = JOptionPane.showInputDialog("Digite uma opçao");
        int n3 = Integer.parseInt(n2);

        switch (n3) {
            case 1:
                System.err.println("Digite dois numero soma");
                num1 = ler.nextInt();
                num2 = ler.nextInt();
                resultado = n.Soma(num1, num2);
                System.out.println("Soma = " + resultado);
            case 2:
                System.err.println("Digite dois numero para sub");
                num1 = ler.nextInt();
                num2 = ler.nextInt();
                resultado = n.Sub(num1, num2);
                System.out.println("sub = " + resultado);
            case 3:
                System.err.println("Digite dois numero para mult");
                num1 = ler.nextInt();
                num2 = ler.nextInt();
                resultado = n.mult(num1, num2);
                System.out.println("multiplicação = " + resultado);
            case 4:
                System.err.println("Digite dois numero para div");
                num1 = ler.nextInt();
                num2 = ler.nextInt();
                resultado = n.div(num1, num2);
                System.out.println("divisao = " + resultado);
            case 5:
                System.err.println("vc escolhei soma aleatoria");

                soma2();
        }

    }
}
