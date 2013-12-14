package Interface;

public class Cubo implements VolumeCalculavel,AreaCalculavel {

	
	double lado;
	public Cubo(double lado){
		this.lado = lado;
	}
	
	@Override
	public double calcularVolume() {
		
		return 6 * lado * lado;
	}

	@Override
	public double calcularArea() {
		
		return lado *lado *lado;
	}

      
	

}
