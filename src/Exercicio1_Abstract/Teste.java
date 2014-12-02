/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio1_Abstract;

import java.awt.Menu;
import javax.swing.JOptionPane;

/**
 *
 * @author Náyron dos Anjos
 */
public class Teste {

    public static void main(String[] args) {

        
        float lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor para lado"));
        float altura = Float.parseFloat(JOptionPane.showInputDialog("Digite agora o valor para altura"));
        
        
        Retangulo r = new Retangulo(lado, altura);
        
        JOptionPane.showMessageDialog(null,"Area do Retangulo = " + r.CalcularArea(), "Area de um Retangulo", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Perimetro do Perimetro = " + r.CalcularPrimetro(), "Perimetro do Retangulo", JOptionPane.INFORMATION_MESSAGE);
        
       float raio = Float.parseFloat(JOptionPane.showInputDialog("Digite um vamor para raio"));
        Circulo c = new Circulo(raio);
        
       JOptionPane.showMessageDialog(null,"Area do Circulo = " + c.CalcularArea(), "Area de um circulo", JOptionPane.INFORMATION_MESSAGE);
       JOptionPane.showMessageDialog(null,"Perimetro do circulo = " + c.CalcularArea(), "Perimetor de um circulo", JOptionPane.INFORMATION_MESSAGE);
        
        

    }

}
