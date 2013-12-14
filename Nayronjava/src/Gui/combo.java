/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author nayron
 */
public class combo {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Combo");
        tela.setBounds(10, 10, 800, 600);
        JComboBox comb = new JComboBox();
        comb.setBounds(100, 100, 150, 35);
        comb.addItem("Gaúcho");
        comb.addItem("Baiano");
        comb.addItem("Paulista");
        comb.addItem("Carioca");
        comb.setEditable(false);
        comb.setSelectedIndex(0);
        tela.setLayout(null);
        tela.add(comb);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }
}
