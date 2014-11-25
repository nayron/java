/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Execercicios2_Class_Abstract;

/**
 *
 * @author Náyron dos Anjos
 */
public class Subltracao extends OperacaoMatematica{

    private float num1,num2;
    
    public Subltracao(float num1,float num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    
    public float calcula() {
         return (num1-num2);
    }
    
}
