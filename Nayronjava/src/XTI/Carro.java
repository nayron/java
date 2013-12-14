package XTI;

class CarroTeste{
    
	String modelo;
	int velocidadeMaxima;
	double segdeZeroacem;
	Motor motor;
	
   public CarroTeste(){//Construtor

   }
   // construtor avançado
   public CarroTeste(String modelo, int velocidadeMaxima, double segdeZeroacem){
	   this(modelo, velocidadeMaxima, segdeZeroacem,null);
   }
   public CarroTeste(String modelo, int velocidadeMaxima, double segdeZeroacem, Motor motor){
	   this.modelo = modelo;
	   this.velocidadeMaxima = velocidadeMaxima;
	   this.segdeZeroacem = segdeZeroacem;
	   this.motor = motor;
   }
   
}
  class Motor{
	  String tipo;
	  int potencia;
	  public Motor(){}//Construtor
	  public Motor(String tipo,int potencia){
		  this.tipo = tipo;
		  this.potencia  = potencia;
	  }
  }

public class Carro {

	public static void main(String[] args) {
		
		CarroTeste ferrari = new CarroTeste();
		ferrari.modelo = "Ferrari manzo";
		ferrari.velocidadeMaxima = 392;
		ferrari.segdeZeroacem = 3.4;
		System.out.println("Modelo = " + ferrari.modelo);
		System.out.println("Vel. Maxima = " + ferrari.velocidadeMaxima);
		System.out.println("de 0 a 100 em  = " + ferrari.segdeZeroacem);
		
		Motor v12 = new Motor();
		v12.tipo = "v12";
		v12.potencia = 690;
		ferrari.motor = v12;//adiciona o motor ao carro.
		
		System.out.println("Potência do motor = " + ferrari.motor.potencia);
		System.out.println("tipo do motor da ferrari = " + ferrari.motor.tipo);
		
		System.out.println();
		
		CarroTeste vw = new CarroTeste("Fusca", 140, 3.3);
		Motor v8 = new Motor("v8", 1018);
		vw.motor = v8;
		System.out.println("Modelo = " + vw.modelo);
		System.out.println("Vel Maxima = " + vw.velocidadeMaxima);
		System.out.println("de 0 a 100 = " + vw.segdeZeroacem+"minutos");
		System.out.println("Potencia = " + vw.motor.potencia);
		System.out.println("Tipo do motor" + vw.motor.tipo);
		
		System.out.println();
		
		CarroTeste buggatt = new CarroTeste("Bugatt Verony",430,2.2,new Motor("w12",1200));
		System.out.println("Modelo = " + buggatt.modelo);
		System.out.println("Vel Maxima = " + buggatt.velocidadeMaxima);
		System.out.println("de 0 a 100 = " + buggatt.segdeZeroacem+"seguntos");
		System.out.println("Potencia = " + buggatt.motor.potencia);
		System.out.println("Tipo do motor" + buggatt.motor.tipo);

	}

}
