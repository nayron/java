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
public class Empregados {

    private String nome;
    private String sobreNome;
    private Double salario;

    public Empregados(String n, String sb, double sal) {
        nome = n;
        sobreNome = sb;
        salario = sal;
        if (salario < 0) {
            salario = 0.0;
        }
    }

    public double salarioAnual() {

        return this.salario * 12;
    }

    public double salarioAnual10() {
        double sal;
        sal = (salario * 12);
        sal = sal+(sal*0.10);
        return sal;  
    }

}
