package Atividades_C_em_Java;
import java.util.*;
public class Senha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String senha;
		
		System.out.println("DIGITE A SENHA POR FAVOR");
		senha = ler.nextLine();
		
		if(senha.equals("asdfg")){
			System.out.println("Acesso Permitido");
		}else{
			System.out.println("Acesso Negado");
		}
		

	}

}
