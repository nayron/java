/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nayron;

/**
 *
 * @author Náyron dos Anjos
 */
public class Pessoa{
    
    private String nome;
    private int rg;
    private int cpf;
    
    public String getNome(){
        return nome;
    }
    public void setNome(String n){
        nome = n;
    }

    public int getRG(){
        return rg;
    }
    public void setRG(int r){
        rg = r;
    }

    public int getCPF(){
        return cpf;
    }
    public void setCPF(int c){
        cpf = c;
    }
} 
