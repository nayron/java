/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulasDePOO;

/**
 *
 * @author Náyron dos Anjos
 */
public class Liguidificador {
    
    private int velocidade;

    public Liguidificador(int x) {
        velocidade = x;
        
    }
    
    public void aumentarVelocidade(){
        switch(velocidade){
            case 0:
                //se desligado passa p/ baixo
                velocidade++;
                break;
            case 1:
                //se vel baixa paas p/ alta
                velocidade++;
                break;
                //se vel alta não faz nada (manter vel)
        }
    }
    
    public void diminuirVelocidade(){
        switch(velocidade){
            case 1:
                //se vel baixa passa p/ desligado
                velocidade--;
                break;
                //se vel alta passa p/ baixo
            case 2:
                velocidade--;
                break;
                //se deligado não faz nada
        }
       
    }
    
    public int obterVelocidade(){
        return velocidade;
        
    }
    
    
    
}
