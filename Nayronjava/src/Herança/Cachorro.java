package Herança;

public class Cachorro extends Animal {

	

	public Cachorro(double peso, String comida) {
		super(peso, comida);
		// TODO Auto-generated constructor stub
	}

	@Override
	void fazerBarulho() {
		System.out.println("au au!!");
		
	}


	
	
	
}


