/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulasDePOO.Herança;

/**
 *
 * @author Náyron dos Anjos
 */
public class Carro {
    
    public static void main(String[] args){
        
       AutomovelBasico lb =new AutomovelBasico(1, "Sedan", "Azul", false, true);
       System.out.println("Carro = "+lb.qtCustas());
        
    }
    
}
