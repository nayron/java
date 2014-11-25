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
public class Circulo extends Forma {
    private float raio;
    
    
    public Circulo(float raio){
        this.raio = raio;
        
    }

   
    public float CalcularArea() {
        return (float) (Math.PI*(raio*2));
      
    }

  
    public float CalcularPrimetro() {
        return (float) (2*Math.PI*raio);
        
    }
    
}
