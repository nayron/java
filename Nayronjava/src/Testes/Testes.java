/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.swing.JOptionPane;

/**
 *
 * @author Náyron
 */
public class Testes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conversao c = new Conversao();

        String entrada = JOptionPane.showInputDialog(null, "Entre com a HORA");
        int hh = Integer.parseInt(entrada);

        String entrada2 = JOptionPane.showInputDialog(null, "Entre com O MINUTO");
        int mm = Integer.parseInt(entrada2);
        String entrada3 = JOptionPane.showInputDialog(null, "Entre com O SEGUNDO");
        int ss = Integer.parseInt(entrada3);
        c.conversaoo(hh, mm, ss);

    }

}
