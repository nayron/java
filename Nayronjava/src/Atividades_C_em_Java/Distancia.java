package Atividades_C_em_Java;
/**
 * .Escreva um algoritmo para ler as coordenadas cartesianas de dois pontos x1,y1 e x2,y2, 
 * calcular e escrever a dist�ncia entre esses pontos, segundo a f�rmula da geometria anal�tica.
D = V( X 2 - X1)2 + (Y2 - Y1) 2.
 */
import javax.swing.*;

public class Distancia {

	public static void main(String[] args) {
	   
		
		/*float x1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite valor para X1","X1",JOptionPane.QUESTION_MESSAGE));
		float y1 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite valor para Y1","Y1",JOptionPane.QUESTION_MESSAGE));
		float x2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite valor para X2","X2",JOptionPane.QUESTION_MESSAGE));
		float y2 = Float.parseFloat(JOptionPane.showInputDialog(null,"Digite valor para Y2","Y2",JOptionPane.QUESTION_MESSAGE));
		
		float d = (float) Math.sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
		
		System.out.println("Distancia = " + d);
		*/
            Biseccion c = new Biseccion();
            double metodoDeBiseccion = c.metodoDeBiseccion(0, 1, 0.001);
            System.out.println(metodoDeBiseccion);
		

	}

}
