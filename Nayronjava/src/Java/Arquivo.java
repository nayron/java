package Java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 *
 * @author nayron
 */
public class Arquivo {

    public static void main(String[] args) throws IOException {
        Path p = Paths.get("C:/XTI/file/texto.txt");
        System.out.println(p.toAbsolutePath());
        System.out.println(p.getParent());
        System.out.println(p.getRoot());
        System.out.println(p.getFileName());

        //Criação de Diretorios
        Files.createDirectories(p.getParent());
        //Escrever e ler Aquivos   
        byte[] bytes = "Meu texto".getBytes();
        Files.write(p, bytes);//cria, limpa e escreve
        byte[] retorno = Files.readAllBytes(p);
        System.out.println(new String(retorno));
    
    }

}
