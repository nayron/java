/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1_Abstract;

/**
 *
 * @author Náyron dos Anjos
 */
public class Teste {

    public static void main(String[] args) {

        Retangulo r = new Retangulo(3, 2);
        Circulo c = new Circulo(4);
        
        System.out.println("Area do Retangulo e = "+r.CalcularArea());
        System.out.println("Perimetro Retangulo e = "+r.CalcularPrimetro());
        
        System.out.println("Area do circulo e = "+c.CalcularArea());
        System.out.println("Perimetro do Circulo e = "+c.CalcularPrimetro());
        

    }

}
