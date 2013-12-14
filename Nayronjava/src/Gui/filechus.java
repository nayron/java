/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Gui;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author nayron
 */
public class filechus {

    public static void main(String[] args) {
        /*Boolean x = filex.getSelectedFile().canRead(); - retorna se o arquivo pode ser lido.
         Boolean x = filex.getSelectedFile().canWrite(); - retorna se o arquivo pode ser sobrescrito.
         String x = filex.getSelectedFile().getName(); - retorna o nome do arquivo.
         String x = filex.getSelectedFile().getPath(); - retorna o local do arquivo.
         boolean x = filex.getSelectedFile().exists(); - retorna se o arquivo existe ou não.*/
        JFrame tela = new JFrame("Telex");
        JFileChooser filex = new JFileChooser();
        int opcao = filex.showOpenDialog(tela);
        if (opcao == JFileChooser.APPROVE_OPTION) {
            File nomearquivo = filex.getSelectedFile();
            try {
                InputStream arq = new FileInputStream(nomearquivo);
                AudioStream som = new AudioStream(arq);
                AudioPlayer.player.start(som);
                System.out.println("Tocando");
            } catch (Exception e) {
                System.out.println("Deu merda");
            }
        }
        tela.setBounds(10, 10, 800, 600);
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }

}
