/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TryCatch;

import javax.swing.JOptionPane;

/**
 *
 * @author Náyron dos Anjos
 */
public class Exercicio1 {

    private int num1, num2;

    Exercicio1(int n, int n2) {
        num1 = n;
        num2 = n2;

    }

    public void divisao() {
        try {

           
            int res = num1 / num2;
            JOptionPane.showMessageDialog(null, "Resultado: " + res);

        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(null, "Divisão por zero Erro na divisão");
        }

    }

}
