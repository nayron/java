/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ICC;


import javax.swing.JOptionPane;

/**
 *
 * @author adm_nayronseilert
 */
public class VetorICC {

    public static void main(String args[]) {
        

        int[] vetorUM = new int[3];
        int[] vetorDois = new int[3];
        int[] vetorTres = new int[6];
        int i;

        int pos_Impar = 1;
        int pos_par = 2;

        for ( i = 0; i <2; i++) {
            String entrada = JOptionPane.showInputDialog("Digite um valor para vetor UM");
            vetorUM[i] = Integer.parseInt(entrada);
            vetorTres[pos_Impar] = vetorUM[i];
            pos_Impar = pos_Impar+2;
      
            entrada = JOptionPane.showInputDialog("Digite um valor para vetor Dois");
            vetorDois[i] = Integer.parseInt(entrada);
            vetorTres[pos_par] = vetorDois[i];
            pos_par=pos_par+2;
        }
      
         for( i = 1;i<=4;i++){
             if(i % 2 == 0)
             {
                 System.err.println("vetor A  - " + vetorTres[i]);
             }else{
                 System.err.println("vetor B  - " + vetorTres[i]);
             }
        }  
    }

}
