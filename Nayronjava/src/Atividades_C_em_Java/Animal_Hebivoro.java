package Atividades_C_em_Java;
import java.io.IOException;
//import java.util.*;
public class Animal_Hebivoro {

	public static void main(String[] args) throws IOException {
		//Scanner ler = new Scanner(System.in);
		
		System.out.println("E mamifero?");
		char m = (char)System.in.read();
        
		if(m == 's'){
			System.out.println("E quadrupede?");
			char q = (char)System.in.read();
			if(q == 's'){
				System.out.println("E carnivoro?");
				char c = (char)System.in.read();
				if(c == 's')
					System.out.println("Leão");
					else
					{
						System.out.println("E Herbivoro?");
						char h = (char)System.in.read();
					   	if(h == 's')
					   		System.out.println("E cavalo");
					}
						
				}
		}else{
			System.out.println("E bipede? ");
			char b = (char)System.in.read();
			if (b=='s'){
				System.out.println("E onivoro");
				char o = (char)System.in.read();
				if(0 == 's')
					System.out.println("Homem");
			
				else{
					
						System.out.println("\nE frutifero? ");
						char f = (char)System.in.read();
						if (f=='s')
						System.out.println("\nMACACO");
				}
			}
			else{
				System.out.printf("\nE voador? ");
				char v = (char)System.in.read();
				if(v == 's')
				System.out.println("Morcego");
				else{
					System.out.println("\nE aquatico? ");
					char a =(char)System.in.read();
					if (a=='s')
					System.out.printf("\nBALEIA");
					
				}
			}
			}
			}
			
			
		}
				
	  
	
	


