/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import javax.swing.*;


/**
 *
 * @author nayron
 */
public class rodar {

    public static void main(String[] args) {

        /*JFormattedTextField txtCPF = null,txtData = null, txtCNPJ = null; 
         JFrame tela = new JFrame();
         tela.setBounds(0, 0, 800, 600);
         try {
         txtCPF = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
         txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
         txtCNPJ = new JFormattedTextField(new MaskFormatter("###.###.###/####-##"));
         } catch (Exception erro) {
         JOptionPane.showMessageDialog(null, "Essa porcaria deu problema");
         }
         tela.add(txtCPF);
         tela.add(txtData);
         tela.add(txtCNPJ);
         tela.setLayout(null);
         tela.setDefaultCloseOperation(JInternalFrame.DISPOSE_ON_CLOSE);
         tela.setVisible(true);
         */
        JFrame tela = new JFrame();
        tela.setBounds(100, 100, 800, 600);
        JMenuBar menuzao = new JMenuBar();
        JMenu menuarquivo = new JMenu("Arquivo");
        JMenu menuhelp = new JMenu("Help");
        JMenu menudentro = new JMenu("Mais opções");
        JMenuItem itemnovo = new JMenuItem("Novo");
        JMenuItem itemsalvar = new JMenuItem("Salvar");
        JMenuItem itemajuda = new JMenuItem("Ajuda");
        JMenuItem itemsobre = new JMenuItem("Sobre");
        JMenuItem itempanico = new JMenuItem("CTRL+ALT+DEL");
        JMenuItem itemterror = new JMenuItem("Tela Azul da Morte");
        menuarquivo.add(itemnovo);
        menuarquivo.add(itemsalvar);
        menuhelp.add(itemajuda);
        menuhelp.add(itemsobre);
        menudentro.add(itempanico);
        menudentro.add(itemterror);
        menuzao.add(menuarquivo);
        menuzao.add(menuhelp);
        menuarquivo.add(menudentro);
        tela.setJMenuBar(menuzao);
        tela.setVisible(true);
    }
}
