/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RevisaoFinal;

import java.util.Scanner;



import javax.swing.JOptionPane;

/**
 *
 * @author Náyron dos Anjos
 */
public class Exercicio6 {

    public static void main(String[] args) {

        
        try {

            String nome = JOptionPane.showInputDialog("NOME: ");

            float salario = Float.parseFloat(JOptionPane.showInputDialog("Salario: "));
            if (salario < 465) {
                System.err.println("Erro Salario não menor do que 465 reais");
            }
            float FGTS =  (float) (salario * 0.08);
            System.out.println("Nome: " + nome);
             System.out.println("Salario: " + salario);
             System.out.println("FGTS: " + FGTS);

        } catch (NullPointerException e) {
            System.err.println("Nome invalido");

        } catch (NumberFormatException e) {
            System.err.println("salario invalido... Salario (567,67)");

        }
      
    }

}
