package PrgCversaoJava;
/**
 * Programa que calcule a média de salários de uma empresa, 
 * pedindo ao usuário a grade de funcionários e os salários 
 * em JOptionPane e devolvendo a média em DOS.
 * @author Nayron
 *
 */
import javax.swing.*;
public class Media {
	
	public static void main(String[] args) {
		
		int quantFuncionario = 0;
		float salarioFunc = 0;
		float totalSalario = 0;
        //varialvel contador para o laço
	    int contadora = 0;
	    
	    quantFuncionario = Integer.parseInt(JOptionPane.showInputDialog(null,
	    "Digite a quantidade de funcionario","Numero de Funcionario",JOptionPane.QUESTION_MESSAGE ));
	    
	    while(contadora < quantFuncionario){
	    	contadora++;
	    	salarioFunc = Float.parseFloat(JOptionPane.showInputDialog(null,
	        "Digite o salario do funcionario","Salario",JOptionPane.QUESTION_MESSAGE));
	    	totalSalario = totalSalario + salarioFunc;
	    	
	    }
	   float mediaSalarial = totalSalario / quantFuncionario;
	   System.out.println("Média Salarial = " + mediaSalarial);
	   
	   System.exit(0);
	
	} 

}
