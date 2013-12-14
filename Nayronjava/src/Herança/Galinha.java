package Herança;

public class Galinha extends Animal {

	public Galinha(){
		super(2,"Milho");
	}
        @Override
	void fazerBarulho(){
		System.out.println("C�, C� !!");
	}
}
