/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classe_Abstract.Exercicio1;

/**
 *
 * @author Náyron dos Anjos
 */
public class Retangulo extends Forma{
    private float lado;
    private float altura;
    
    public Retangulo(float lado, float altura){
        this.lado = lado;
        this.altura = altura;
    }

    
    public float CalcularArea() {
        return lado*altura;
        
    }

    
    public float CalcularPrimetro() {
        return (2*lado)+(2*altura);
    
    }
    
}
