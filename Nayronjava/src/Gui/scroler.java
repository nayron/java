/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

/**
 *
 * @author nayron
 */
public class scroler {

    public static void main(String[] args) {
        JTextField tex = new JTextField();
        tex.setBounds(0, 0, 300, 700);
        JFrame tela = new JFrame();
        tela.setBounds(0, 0, 800, 600);
        JScrollPane scrots = new JScrollPane(tex);
        scrots.setBounds(100, 100, 300, 300);
        tela.add(scrots);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setVisible(true);
    }

}
