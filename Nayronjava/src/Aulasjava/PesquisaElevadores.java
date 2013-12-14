package Aulasjava;
import javax.swing.*;

public class PesquisaElevadores {

	
	public static void main(String[] args) {
		
		String elevador = JOptionPane.showInputDialog("Qual o elevador mais utilizado a, b ou c");
		String periodo = JOptionPane.showInputDialog("Qual o periodo mais utilizado m, v ou n");
		int a=0,b=0,c=0,m=0,v=0,n=0;
		int elevadorMaisutilizado=0,periodoMaisUsado=0,contador=0;
		
		while(!elevador.equals("vazio")){
			if(elevador.equals("a")) a++;
			if(elevador.equals("b")) b++;
		    if(elevador.equals("c")) c++;
		    if(periodo.equals("m")) m++;
		    if(periodo.equals("v")) v++;
		    if(periodo.equals("n")) n++;
		    contador = contador + 1;
		    
		}
		if(a>b && b>c){
	        elevadorMaisutilizado = a; 		
			System.out.println("c tem maior fluxo");
		}
		if(c>a && a>b){
	        elevadorMaisutilizado = b; 		
			System.out.println("c tem maior fluxo");
		}
		if(a>b && b>c){
	        elevadorMaisutilizado = c; 		
			System.out.println("c tem maior fluxo");
		}
		if(m>v && v>n){
	         		
			System.out.println("m tem maior fluxo");
		}
		if(v>m && m>n){
	         		
			System.out.println("v tem maior fluxo");
			
		}
		if(n>m && m>v){
	         		
			System.out.println("n tem maior fluxo");
		}
		double pcelevador = elevadorMaisutilizado*100/contador;
		System.out.println("porc. elevador mais utilizado " + pcelevador);
		
		
	}

}
