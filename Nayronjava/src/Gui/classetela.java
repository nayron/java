package Gui;

import javax.swing.*;
import java.awt.*;
import java.text.ParseException;
import javax.swing.text.MaskFormatter;

public class classetela {

    public static void main(String[] args) {

        
        JFrame tela = new JFrame("Primeira tela");//cria o JFrame
        JLabel texto = new JLabel("Frase indicativa");//cria o jlabel
        tela.setBounds(400, 50, 600, 600);//dimensoes do tamanho da tela
        texto.setBounds(100, 100, 200, 30);//tamanho do texto
        tela.getContentPane().setBackground(Color.RED);//cor do jframe
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//encerra a execução do aquivo.java
        tela.add(texto);//adiciona texto a tela
        tela.setLayout(null);

        JButton botao = new JButton("Pressione aqui");//cria botão
        botao.setBounds(100, 200, 200, 30);//tamanho do botão
        botao.setBackground(Color.GREEN);//cor do botão
        botao.setForeground(Color.BLUE);//cor da fonte do botão
        botao.setToolTipText("Um exemplo de ToolTip");
        tela.add(botao);

        JTextField caixa = new JTextField();
        caixa.setBounds(100, 300, 200, 30);
        caixa.setBackground(Color.black);
        caixa.setForeground(Color.WHITE);
        //  caixa.setText("olá progamador");
        tela.add(caixa);

        JToggleButton toglebotao = new JToggleButton("Toggle Button");
        toglebotao.setBounds(300, 200, 200, 30);
        toglebotao.setBackground(Color.GREEN);
        toglebotao.setForeground(Color.BLUE);
        toglebotao.setToolTipText("Um exemplo de ToolTip");
        tela.add(toglebotao);

        Icon imagem = new ImageIcon("C:\\Users\\nayron\\Pictures n.jpeg");
        JButton botao2 = new JButton();
        botao2.setIcon(imagem);
        JLabel rotulo = new JLabel();
        rotulo.setIcon(imagem);
        tela.add(botao2);
        tela.add(rotulo);
     
        tela.setVisible(true);
        //   System.exit(0);

    }
}
