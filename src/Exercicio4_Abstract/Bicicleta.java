/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio4_Abstract;

/**
 *
 * @author Náyron dos Anjos
 */
public class Bicicleta extends Veiculo {
    private float vel;
    public Bicicleta(float velo){
        this.vel = velo;
    }

    
    public float acelerar(float velocidade) {
       velocidade += vel; 
        return velocidade ;
       
        
    }

    
    public void parar() {
        
        vel = 0;
        System.out.println("Bike parou == velocidade "+vel);
    }
     
    
}
