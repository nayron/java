/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Atividades_C_em_Java.nayron;

import javax.swing.JOptionPane;

/**
 *
 * @author Nayron
 */
public class Funcao {

    /**
     *
     * @param n1
     * @param n2
     * @return
     */
    public double Soma(double n1, double n2) {
        return n1 + n2;
    }

    public double Sub(double n1, double n2) {
        return n1 + n2;

    }

    public double mult(double n1, double n2) {
        return n1 + n2;

    }

    public double div(double n1, double n2) {
        return n1 + n2;

    }

    public static void soma2() {
        double soma = 0;

        String n = JOptionPane.showInputDialog("Digite um numero");
        Double n2 = Double.parseDouble(n);

        while (n2 != 0) {
            soma = soma + n2;
            n = JOptionPane.showInputDialog("Digite um numero");
            n2 = Double.parseDouble(n);
         

        }
        JOptionPane.showMessageDialog(null, "A Soma = " + soma);
    }

}
