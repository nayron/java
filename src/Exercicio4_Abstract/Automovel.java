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
public class Automovel extends Veiculo{
    public float vel;
    
    public Automovel(float velo){
       vel = velo;
    }
    public float acelerar(float velocidade) {
        velocidade += vel;
        return velocidade;
        
    }

   
    public void parar() {
        vel = 0;
        System.out.println(vel);
    }
    public void mudarOleo(float litros){
         System.out.println("Seu Automovel tem " + litros + "litros de oleo novo");
     }
    
}