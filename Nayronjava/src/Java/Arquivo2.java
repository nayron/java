/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java;

import java.io.*;
;
import java.nio.charset.*;

import java.nio.file.*;

/**
 *
 * @author nayron
 */


public class Arquivo2 {

    public static void main(String[] args) {

        Path patch = Paths.get("C:/XTI/file/texto.txt");
        Charset utf8 = StandardCharsets.UTF_8;
        //escrita
        int i = 0;
        try (BufferedWriter w = Files.newBufferedWriter(patch, utf8);) {
            while (i != 100) {
                i++;
                w.write(" Texto \n ");
                w.write(" Texto \n");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        //leitura
        try (BufferedReader reader = Files.newBufferedReader(patch, utf8)) {
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);

            }

        } catch (IOException ex) {

        }
    }
}
