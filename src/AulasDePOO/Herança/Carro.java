/*.show.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulasDePOO.Herança;

import javax.swing.JOptionPane;

/**
 *
 * @author Náyron dos Anjos
 */
public class Carro {

    public static void main(String[] args) {

        int comb = Integer.parseInt(JOptionPane.showInputDialog("Tipo de Combustivel\n1=Gasolina\n2=alcool\n3-Diesil"));
        String mod = JOptionPane.showInputDialog("Digite o modelo");
        String cor = JOptionPane.showInputDialog("Digite a cor do Modelo");
        boolean radio = Boolean.parseBoolean(JOptionPane.showInputDialog("Tem Radio?\n true ou false"));
        boolean dhid = Boolean.parseBoolean(JOptionPane.showInputDialog("E direção Hidralica?\n true ou false"));
        
        AutomovelBasico lb = new AutomovelBasico(comb, mod, cor, radio, dhid);
       
        JOptionPane.showMessageDialog(null,"Valor total = " + lb.qtCustas(), "Custo do carro", JOptionPane.INFORMATION_MESSAGE);
        

    }

}
