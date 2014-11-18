/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios18_11;

/**
 *
 * @author Náyron dos Anjos
 */
public class Fatura {

    private int numIntemFatu;
    private String descIntemFaturado;
    private int QtdCompr;
    private double preco;

    public Fatura(int a, String b, int c, double d) {
        numIntemFatu = a;
        descIntemFaturado = b;
        QtdCompr = c;
        preco = d;
        if (QtdCompr < 0) {
            this.QtdCompr = 0;
        }
        if (preco < 0) {
            this.preco = 0.0;

        }
    }

    public double getfatura() {
        double fat;
        fat = QtdCompr * preco;
        return fat;
    }

}
