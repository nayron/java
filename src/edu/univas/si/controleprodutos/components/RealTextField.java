package edu.univas.si.controleprodutos.components;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class RealTextField extends JTextField implements KeyListener{

	private static final long serialVersionUID = 4854434959469268873L;

	public RealTextField() {
		super("0,00");
		initilize();		
	}

	private void initilize() {
		addKeyListener(this);		
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		
		String value = getText();
		
		value = removeDot(value);
		value = removeComma(value);		
		value = insertComma(value);	
		value = removeZeros(value);	
		value = includeZero(value);
		
		setText(value);
	}
	
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Abaixo segue alguns métodos chamados pelo keyReleased para formatar
	 * o dado presente no TextField para o formato do real.
	 * @param value
	 * @return
	 */
	
	private String removeDot(String value) {
		return value.replace('.',',');	
	}
	
	private String removeZeros(String value) {
		while (value.charAt(0)=='0'){
			value = value.substring(1);			
		}
		return value;
	}
	
	private String includeZero(String value) {
		if (value.charAt(0)==','){
			value = "0" + value;
		}
		return value;
	}

	private String removeComma(String value) {
		int index = value.indexOf(",");
		if (index >= 0){
			if (index == 0){
				if (value.length()>1){
					value = value.substring(1);
				}
				else{
					value = "";
				}
			}
			else if (index == 1){
				if(value.length()>2){
					value = value.charAt(0) + value.substring(2);
				}
				else{
					value = value.charAt(0)+"";	
				}
			}
			else {
				value = value.substring(0,index)+value.substring(index+1);
			}
		}
		else {
			return value;
		}
		while( value.indexOf(",")>=0){
			value = removeComma(value);
		}
		return value;
	}
	
	private String insertComma(String value) {
		if (value.length()>2){
			value = value.substring(0,value.length()-2) + "," +
				value.substring(value.length()-2);
			return value;
		}else if (value.equals("")){
			return ",00";
		}
		else if(value.length()>1){
			return "," + value;
		}
		else {
			return ",0" + value;
		}
	}
}
