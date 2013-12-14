package XTI;

class Conta{
	String cliente;
	double saldo;
	
	void exibeSaldo(){
		System.out.println(cliente + " o seu saldo é de " + saldo);
	}
	void saca(double valor){
		saldo = saldo - valor;
		
	}
	void deposito(double valor){
		saldo+=valor;
	}
    void transferePara(Conta destino,double valor){
    	this.saca(valor);
    	destino.deposito(valor);
    }
}

public class ContaTeste {

	public static void main(String[] args){
		
		Conta conta = new Conta();
		conta.cliente = "Náyron";
		conta.saldo = 10_000.00;
		conta.exibeSaldo();
		
		Conta destino = new Conta();
		destino.cliente = "Andre";
		destino.saldo = 8_000.00;
		destino.exibeSaldo();
		
		conta.transferePara(destino, 05);
		conta.exibeSaldo();
		destino.exibeSaldo();
	}
}
