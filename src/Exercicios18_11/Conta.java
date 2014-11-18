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
public class Conta {

    private int numConta;
    private String nomeTitular;
    private String tipo;
    private double saldo;

    public Conta() {
        this.saldo = 0;
    }

    public Conta(int numConta, String nome) {
        this.numConta = 26198;
        this.nomeTitular = "Jose";
        this.saldo = 0;
    }

    public double depositar(double valor) {
        saldo = saldo + valor;
        return this.saldo;
    }

    public double sacar(double valor) {
        saldo = saldo - valor;
        return saldo;
    }
}
