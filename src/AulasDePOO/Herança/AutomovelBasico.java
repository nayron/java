/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AulasDePOO.Herança;

/**
 *
 * @author Náyron dos Anjos
 */
public class AutomovelBasico extends Automovel{
    
    boolean radio;
    boolean direcaohidraulica;

    public AutomovelBasico(int comb, String mod, String c,boolean rd,boolean dhdlica) {
        super(comb, mod, c);
        radio = rd;
        direcaohidraulica = dhdlica;
    }
    
    public int qtCustas(){
        int valor;
        
        valor = super.QtoCusta();
        
        if(radio == true){
            valor = valor + 31500;
        }else if(direcaohidraulica == true){
            valor = valor + 32600;
        }else if((radio == true) && (direcaohidraulica == true)){
            valor = valor +35550;
        }
        
        
        return valor;
    }
    
}
