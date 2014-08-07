/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testes;

import javax.swing.JOptionPane;

/**
 *
 * @author Nayron dos Anjos
 */
public class Conversao {

    void conversaoo(int hh, int mm, int ss) {
        int converter;

        converter = (hh * 60 * 60) + (mm * 60) + (ss);
        JOptionPane.showMessageDialog(null,""+hh+":"+mm+":"+ss + " Corrensponde a " + converter+" Segundos");
       

    }

}
