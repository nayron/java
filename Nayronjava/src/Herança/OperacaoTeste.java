package Herança;


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


public class OperacaoTeste {
     
	public static void calcular(OperacaoMatematica o, double x, double y){
		System.out.println(o.calcular(x, y));
	}
	
	public static void main(String[] args) {
		
		calcular(new Soma(), 5, 5);
		calcular(new Multiplicacao(), 5, 5);

	}

}
