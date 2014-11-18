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
public class Triangulo1 {
    private int lado1;
    private int lado2;
    private int lado3;

    public Triangulo1(int x,int y,int z) {
       this.lado1 = x;
        this.lado2 = y;
        this.lado3 = z;
    
    }
    
    public void equilatero(){
        if((lado1 == lado2) && (lado2 == lado3))
        {   
            
            System.err.println("Triangulo equilátero");
        }
    }
    
    public int somaTrigangulo(){
        int resul;
        
        resul = lado1+lado2+lado3;
        
        return resul;
    }
}
