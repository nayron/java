package Herança;



public abstract class Animal {

	
	double peso;
	String comida;
	
	
	
	public Animal(double peso, String comida){
		this.peso = peso;
		this.comida = comida;
	}
	
	void dormir(){System.out.println("Durmir");}
	abstract void fazerBarulho();
	
}
