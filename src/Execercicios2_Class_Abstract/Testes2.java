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
public class Testes2 {
    
    public static void main(String[] args){
        
        Soma s = new Soma(2, 2);
        Subltracao sb = new Subltracao(10,3);
        Multiplicacao m = new Multiplicacao(4, 3);
        Divisao d = new Divisao(20, 2);
        
        System.out.println("Soma"+s.calcula());
        System.out.println("subtracao " + sb.calcula());
        System.out.println("Multiplicaçao " + m.calcula());
        System.out.println("Divisao " + d.calcula());
        
    }
    
}
