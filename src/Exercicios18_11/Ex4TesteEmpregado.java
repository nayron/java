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
public class Ex4TesteEmpregado {
    public static void main(String[] args){
        Empregados e = new Empregados("Jose", "Silva", 724.0);
        Empregados ep = new Empregados("Andre", "Jorge", 1000.0);
        
        
        System.out.println("Salario anual do jose e = "+e.salarioAnual());
        System.out.println("Salario anual do Andre = "+ep.salarioAnual());
        
        System.out.println("Salario do jose Aumentado 10% = "+e.salarioAnual10());
        System.out.println("Salario do Andre Aumentado 10% = "+ep.salarioAnual10());
    }
}
