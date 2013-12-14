package Erros;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DividirPorzero {

	
	public static void main(String[] args){
		
		Scanner s = new Scanner(System.in);
		boolean continua = true;
		
		do{
			
		
		try{
		System.out.print("informe o numero: ");
		int a = s.nextInt();
		System.out.print("informe o divisor: ");
		int b = s.nextInt();
		double r = a / b;
		System.out.printf("Resultado = %f ",r);
		continua = false;
		}	
		catch(InputMismatchException inputMismatchException){
			System.err.println("os numero precisa ser inteiro");
		s.nextLine();// descarta a entrada do usuario
		}
		catch(ArithmeticException arithmeticException){
			System.out.println("os numero precisa ser diferente de zero");
		}
		finally{
			System.out.println("finally executado...");
		}
		}while(continua);
	}

}


