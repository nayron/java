package PrgCversaoJava;
import java.util.*;


public class CalculadoraDemais {

	private int soma(int n1,int n2){
		return n1 + n2;
	}
	  private int sub(int n1, int n2){
		return n1 - n2;
	}
	  private double mult(double n1, double n2){
		 return n1 * n2;
	 }
	  private double div(double n1,double n2){
		 return n1 / n2;
	 }
	  private int raiz(int numero){
			
			int raiz = 0,impar = 1;
			while(numero >= impar){
				numero-= impar;
				impar+= 2;
				++raiz;
				
			}
			return raiz;
		}
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		CalculadoraDemais c = new CalculadoraDemais();
		
		int op;
		System.out.println("*****************************************");
		System.out.println("Escolha uma opçao");
		System.out.println("1 = somar,       2 = Subtrair");
		System.out.println("3 = multiplicar, 4 = dividir");
		System.out.println("5 = raiz,        6 = potencia");
		op = ler.nextInt();
		while(op != 0){
		if (op == 1) {  
              
            System.out.println("Qual o primeiro numero: ");  
            int num1 = ler.nextInt();  
            System.out.println("Qual o segundo numero: ");  
             int num2 = ler.nextInt();  
               
                int operacao = c.soma(num1, num2);  
                  
                System.out.println("Soma = " + operacao);  
         
        }else if (op == 2) {  
          System.out.println("Qual o primeiro numero: ");  
           int num1 = ler.nextInt();  
          System.out.println("Qual o segundo numero: ");  
          int num2 = ler.nextInt();  
              int operacao = c.sub(num1, num2);  
              System.out.println("Subtração " + operacao);  
            
          }else if (op == 3) {  
              System.out.println("Qual o primeiro numero: ");  
              double num1 = ler.nextDouble(); 
             System.out.println("Qual o segundo numero: ");  
             double num2 = ler.nextDouble();  
                 double operacao = c.mult(num1, num2);
                 System.out.println("Multiplicação " + operacao);           
             }else if (op == 4) {  
                 System.out.println("Qual o primeiro numero: ");  
                 double num1 = ler.nextDouble(); 
                System.out.println("Qual o segundo numero: ");  
                double num2 = ler.nextDouble();  
                    double operacao = c.div(num1, num2);
                    System.out.println("divisão " + operacao);     
                }else if (op == 5) {  
                    System.out.println("Qual o primeiro numero: ");  
                    int num1 = ler.nextInt(); 
                       int operacao = c.raiz(num1);
                       System.out.println("Raiz e +- " + operacao);     
                   }else if (op == 6) {  
                	   int resultado=1;    
                	    System.out.println("Por favor digite um numero inteiro a ser elevado.");
                	    int numero = ler.nextInt();
                	    System.out.println("Digite  o expoente que o " + numero + " irá ser elevado");
                	    int exp = ler.nextInt();
                	    for(int i=0;i<exp;i++){
                	    	resultado*=numero;
                	    }
                	    System.out.println("A potência é = " + resultado );  
                            
                      }  
		System.out.println("*****************************************");
		System.out.println("Escolha uma opçao");
		System.out.println("1 = somar,       2 = Subtrair");
		System.out.println("3 = multiplicar, 4 = dividir");
		System.out.println("5 = raiz,        6 = potencia");
		op = ler.nextInt();
		
   		  	
		}
	}

}
