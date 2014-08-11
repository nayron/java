package edu.univas.si.controleprodutos.components;
public class CalculadoraCotroller {
	private float a;
	private float b;
	private char op='x';
	public CalculadoraCotroller(){
		
	}
	public int testaValorres(String sN1, String sN2, char sO){
		int result;
		try{
			a=Float.parseFloat(sN1);
			b=Float.parseFloat(sN2);
			result = 0;
		}catch(NumberFormatException e){
			result=-1;
		}
		if(b==0){
			result=-1;
		}
		if(sO!='/' && sO!='*' && sO!='-' && sO!='+'){
			result=-1;
		}
		return result;
	}
	public float calcula (String sN1, String sN2, char sO){
		if (op=='x'){
			a=Float.parseFloat(sN1);
			b=Float.parseFloat(sN2);
			op=sO;
			System.out.println("a: "+a);
			System.out.println("op: "+op);
			System.out.println("b: "+b);
			System.out.println("op: "+sO);
			switch(op){
				case '+':
					return a+b;
				case '-':
					return a-b;
				case '/':
					if (b!=0)
						return a/b;
					else
						return -1;
				case '*':
					return a*b;
				default:
					return (float)0;					
			}
		}
		else System.out.println("ERRO!");
		
		return (float)0;
	}
}
 
