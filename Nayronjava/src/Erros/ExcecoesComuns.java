package Erros;

import XTI.Cachorro;

public class ExcecoesComuns {

	static int[] arrayNull = new int[0];
	
	public static void main(String[] args) {
		
		//NullPointerException
        //System.out.println(arrayNull.length);
        
        //ArithmeticException
        //int x = 5 / 0;
    
        //ArrayIndexOutOfBoundsException
        //System.err.println(arrayNull[1]);
       
		//ClassCastException
		//Animal a = new Galinha();
		//Cachorro c = (Cachorro) a;
        
		//NumberFormatException
		//double f = Double.parseDouble("x");

	}

}
