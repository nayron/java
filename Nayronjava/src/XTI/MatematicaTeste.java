package XTI;

 class matematica{
	 
	int raiz(int numero){
		
		int raiz = 0,impar = 1;
		while(numero >= impar){
			numero-= impar;
			impar+= 2;
			++raiz;
			
		}
		return raiz;
	}

	int maior(int um,int dois){
		if(um>dois){
			return um;
		}else{
		return dois;
		}
	}
	double soma(double ... numeros){
		
		double total = 0;
		for(double n : numeros){
			total+=n;		
		}
		return total;
		
	}
	double media(double x, double y){
		System.out.println("media(double x, double y)");
		return(x+y)/2;
	}
	double media(String x, String y){
		System.out.println("media(String x, String y)");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return(ix + iy)/2;
  }
	double media(double ... numeros){
		System.out.println("media(double ... numeros)");
		return this.soma(numeros)/numeros.length;
	}
}

public class MatematicaTeste {

	public static void main(String[] args){
      
		matematica m = new matematica();
		
		int raiz1 = m.raiz(16);
		System.out.println("A raiz = " + raiz1);
		int maior = m.maior(20, 45);
		System.out.println("o maior numero é " + maior);
		
	    
	    System.out.println("Soma = " + m.soma(10, 20, 34, 45, 56));
	    
	    
	    System.out.println(m.media(5, 8));
	   
	    System.out.println(m.media("5", "5"));
	    
	    System.out.println(m.media(5, 5, 34,45,56,34,65,22,45));
	    
	
	}
}
