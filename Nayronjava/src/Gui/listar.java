package Gui;

import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author nayron
 */
public class listar {
    
    public static void main(String[] args) {
        JFrame tela = new JFrame("Tabelas");
        tela.setBounds(0, 0, 1024, 768);
        JTable tabela = new JTable();
        tabela.setBounds(10, 10, 200, 400);
        tela.add(tabela);
        String[] colunas = {"Nome", "Salário"};
        DefaultTableModel modelo = (DefaultTableModel) (new DefaultTableModel() {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        });
        modelo.setColumnIdentifiers(colunas);
        modelo.setRowCount(0);
        Object[] objetos = new Object[2];
        objetos[0] = "nayron";
        objetos[1] = "1000";
        modelo.addRow(objetos);
        objetos[0] = "Silvio Santos";
        objetos[1] = "50000";
        modelo.addRow(objetos);
        objetos[0] = "Lula-lá";
        objetos[1] = "12000";
        modelo.addRow(objetos);
        tabela.setModel(modelo);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setLayout(null);
        tela.setVisible(true);
    }
    
}
