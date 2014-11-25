/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio3_Abstract;

/**
 *
 * @author Náyron dos Anjos
 */
public abstract class Calculadora {

    float n1, n2;

    public Calculadora(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public abstract float raiz();

    public abstract float potencia();

    public float soma() {
        return n1 + n2;
    }

    public float sub() {
        return n1 - n2;
    }

    public float mult() {
        return n1 * n2;
    }

    public float div() {
        float divi = 0;
        if (n1 != 0) {
            divi = (n1 / n2);

        } else {
            System.err.println("Impossivel dividir zero!");
        }
        return divi;
    }

}
