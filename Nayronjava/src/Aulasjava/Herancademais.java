package Aulasjava;
import javax.swing.*;

class OperacaoMatematica{
	 public double calcular(double x, double y){
		 return 0;
	 }	
}
   class Soma extends  OperacaoMatematica{
	   
   	public double calcular(double x, double y){
		 return x + y;
	 }
}
class Multiplicacao extends OperacaoMatematica{
	  
	    public double calcular(double x, double y){
		 return x * y;
	 }
	
}

public class Herancademais {
	public static void calcular(OperacaoMatematica o, double x, double y){
		System.out.println(o.calcular(x, y));
	}

	public static void main(String[] args) {
		String ler = JOptionPane.showInputDialog("Digie o primeiro valor");
		int n = Integer.parseInt(ler);
	    ler = JOptionPane.showInputDialog("Digie o segundo valor");
		int n2 = Integer.parseInt(ler);

		ler = JOptionPane.showInputDialog("Digie 1 = soma ou 2 = multiplicação");
		int op = Integer.parseInt(ler);
		switch(op){
		    
		case 1:calcular(new Soma(), n, n2);
		break;
		case 2:calcular(new Multiplicacao(), n, n2);
		break;
		}
		
	}

}
