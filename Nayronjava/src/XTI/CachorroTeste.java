package XTI;

public class CachorroTeste {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Cachorro pitbull = new Cachorro();
		
		pitbull.raca = "Pit Bull";
		pitbull.tamanho = 40;
		pitbull.latir();
		System.out.println(pitbull.raca);
		System.out.println(pitbull.tamanho+"cm");
		
		Cachorro viralata = new Cachorro();
		viralata.raca = "viralata";
		viralata.tamanho = 30;
		viralata.latir();
		System.out.println(viralata.raca);
		System.out.println(viralata.tamanho+"cm");

	}

}
