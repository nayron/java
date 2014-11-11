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
public class Liguidificador2 {

    public static void main(String[] args){
       
        
        Liguidificador l = new Liguidificador(2);
       // l.aumentarVelocidade();
        l.diminuirVelocidade();
        System.out.println(l.obterVelocidade());
        
        
    }
}
