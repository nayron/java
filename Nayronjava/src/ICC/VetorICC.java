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

        int pos_Impar = 1;
        int pos_par = 2;

        for (int i = 0; i <3; i++) {
            vetorUM[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opçao " + i));
            vetorTres[pos_Impar] = vetorUM[i];
            pos_Impar = (pos_Impar+2);
        }
        for (int i = 0; i <3; i++) {
            vetorDois[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opçao " + i));
            vetorTres[pos_par] = vetorDois[i];
            pos_par=(pos_par+2);
        }
        
         for(int i = 0;i<6;i++){
             if(i % 2 == 0)
             {
                 System.err.println("vetor A  - " + vetorTres[i]);
             }else{
                 System.err.println("vetor B  - " + vetorTres[i]);
             }
        }  
    }

}
