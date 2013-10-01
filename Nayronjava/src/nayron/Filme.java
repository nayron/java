/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package nayron;

/**
 *
 * @author Náyron dos Anjos
 */
public class Filme{
   
    private String titulo;
    private int codigo;
    private int ano;
    private String genero;
   
    public String getTitulo(){
        return titulo;
    }
    public void setTitulo(String t){
        titulo = t;

    }
    public int getCodigo(){
        return codigo;
    }
    public void setCodigo(int c){
        codigo = c;

    }
    public int getAno(){
        return ano;
    }
    public void setAno(int a){
        ano = a;

    }
    public String getGenero(){
        return genero;
    }
    public void setGenero(String g){
        genero = g;
    }
}
