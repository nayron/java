package PrgCversaoJava;
import java.util.*;
public class PotenciaFor {

	public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    
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

}
