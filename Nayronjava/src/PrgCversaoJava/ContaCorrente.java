package PrgCversaoJava;

public class ContaCorrente {
	static float dinheiroTotal;
    float saldo;
    String nome;
    public ContaCorrente(String nomeDono){
    	this.nome = nome;
    	saldo = 0;
    }
    float verificaSaldo(){
    	return saldo;
    }
    void depositaValor(float valor){
    	saldo = saldo + valor;
    	dinheiroTotal += valor;
    }
    void retirarValor(float valor){
    	if(saldo>= valor){
    		saldo = saldo - valor;
    		dinheiroTotal -= valor;
    	}
    }
   class AcessaContaCorrente{
	   public  void main(String[] args){
		   ContaCorrente minhaConta = new ContaCorrente("Maria");
	       float saldo;
	       saldo = minhaConta.verificaSaldo();
	       System.out.println(saldo);   
	       minhaConta.depositaValor(200);
	       saldo = minhaConta.verificaSaldo();
	       System.out.println(saldo);
	   }
   }
}
