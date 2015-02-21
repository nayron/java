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
public class CalculadoraCientifica extends Calculadora{

    public CalculadoraCientifica(float n1, float n2) {
        
        super(n1, n2);
    }
      
    public float raiz() {
        return (float) Math.sqrt(n1);
        
    }

    
    public float potencia() {
        return (float) Math.pow(n1, n2);
        
    }
 
        
        
    
    
}
