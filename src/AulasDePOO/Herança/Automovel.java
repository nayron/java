/*
 //Cria os metodos QtoCusta(retornando o preço de acordo com o combustivel)
e qtasPrestacoes(Retornando o numero maximo de prestacoes).
 */
package AulasDePOO.Herança;

/**
 *
 * @author Náyron dos Anjos
 */
public class Automovel {
    int gasolina = 1,alcool = 2 ,diesel = 3;
    int maximoPrestacoes = 24;
    String modelo;
    String cor;
    int combustivel;
    
    public Automovel(int comb,String mod,String c){
        modelo = mod;
        cor = c;
        combustivel = comb;
        
    }
    public int QtoCusta(){
        int preco = 0;
        if(combustivel == gasolina){
            preco = 4;
        
        }else if(combustivel == alcool){
            preco = 3;
            
        }else if(combustivel == diesel){
            preco = 1;
        }
        return preco;
    }
    
    public int QtasPrestacoes(){
        return maximoPrestacoes;
        
        
    }

   
    
}
