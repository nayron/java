/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios18_11;

/**
 *
 * @author Náyron dos Anjos
 */
public class Triangulo2 {
    
    public static void main(String[] args){
        
        Triangulo1 t = new Triangulo1(5, 5, 5);
        
        t.equilatero();
        
        System.out.println("A soma e = "+t.somaTrigangulo());
    }
    
}
