package PrgCversaoJava;

import javax.swing.*;
import java.awt.*;

public class TesteContanier {

    public static void main(String args[]) {
        int i;
        JFrame janela = new JFrame("Titulo da janela");
        janela.setBounds(50, 100, 400, 150); // Seta posico e tamanho
        janela.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        FlowLayout flow = new FlowLayout(); // Define o layout do

        Container caixa = janela.getContentPane(); // Define o tamanho
        caixa.setLayout(flow); // Seta layout do container
        for (i = 1; i <= 1000; i++) {
            caixa.add(new JButton("Aperte " + i)); // Adiciona um bot�o
        }
        janela.setVisible(true); // Exibe a janela
    }
}
