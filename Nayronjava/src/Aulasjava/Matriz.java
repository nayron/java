package Aulasjava;
import java.util.Scanner;
public class Matriz {
	
	public static void main(String[] args) {
	      Scanner ler = new Scanner(System.in);
	      
	      int[][] matriz=new int[3][3];
	      int l,c;
	      for(l=0;l<3;l++){
	    	  for(c=0;c<3;c++){
	    		  System.out.printf("[%d][%d]",l,c);
	    		  matriz[l][c] = ler.nextInt(); 
	    	  }
	      }
	      for(l=0;l<3;l++){
	    	 for(c=0;c<3;c++){
	    		System.out.printf("%d,",matriz[l][c]); 
	    	 }
	    	 System.out.printf("\n");
	      }
			
	     	
		}

	}


