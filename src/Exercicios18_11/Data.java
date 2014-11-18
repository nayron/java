/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicios18_11;

/**
 *
 * @author Náyron dos Anjos
 */
public class Data {

    private int dia;
    private int mes;
    private int ano;

    public Data(int a, int b, int c) {
        dia = a;
        mes = b;
        ano = c;
    }

    public boolean verificaData() {
            return (dia >= 1) && (dia <= 31) && (mes >= 1) && (mes <= 12);
    }

    public void mostraData() {

        if (verificaData()==true){
            System.out.println("Data: "+dia+"/"+mes+"/"+ano);
        }else{
            System.out.println("Data invalida");
        }
        
    }

}
