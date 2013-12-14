package XTI;
import javax.swing.*;
public class Galinha {
	
	public static int ovosDaGranja;//Variavel global;
	public int ovos;//total de ovos da galinha
	
	public Galinha botar(){
		this.ovos++;
	   Galinha.ovosDaGranja++;	
	    return this;
	}
	public static double mediaDeOvos(int galinhas){
		return Galinha.ovosDaGranja / galinhas;
	}
	
	
	
  public static void main(String[] args){
	
	  String entrada = JOptionPane.showInputDialog("Digite o numero de ovos da Galinha 01");
	  Integer n = Integer.parseInt(entrada);
	  
	  Galinha g1 = new Galinha();
	  for(int i=0;i<n;i++){
		  g1.botar();
	  }
	 
	  System.out.println(g1.ovos);
	  
	  String seg = JOptionPane.showInputDialog("Digite o numero de ovos da Galinha 02");
	  Integer s = Integer.parseInt(seg);
	  
	  Galinha g2 = new Galinha();
	  for(int i=0;i<n;i++){
		  g2.botar();
	  }
	  
	  System.out.println(g2.ovos);
	   
	  
	  System.out.println(Galinha.ovosDaGranja);
	  System.out.println(Galinha.mediaDeOvos(2));
  }
}
