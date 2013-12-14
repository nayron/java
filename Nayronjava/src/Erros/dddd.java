package Erros;

import javax.swing.*;

public class dddd {
	public static void main (String args[]) { 
		try { /* Seta para Look and Feel da plataforma (por ex. Windows ) */ 
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); 
			} catch (Exception e) {
				
			} 
		JFrame f = new JFrame ( ); 
		JButton button = new JButton("Hello, world"); 
		f.getContentPane().add (button); f.pack(); f.show ();
		if(button.equals(button = new JButton("Hello, world") )){
			JOptionPane.showMessageDialog(null," ok");
		}
		}
}
