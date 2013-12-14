package XTI;
@SuppressWarnings("unused")
public class Funcionario {

	private String nome;
	private boolean ativo;
	
	public String getNome(){
		return nome;
	}
	public void setNome(String n){
		this.nome = n;
	}
	public boolean isAtivo(){
		return ativo;
	}
	public void setAtivo(boolean ativo){
		this.ativo = ativo;
	}
	public static void main(String[] args){
		
		Funcionario f = new Funcionario();
		String n = f.getNome();
		f.setNome("Náyron");
		System.out.println();
	}
}
