package edu.univas.si.controleprodutos.components;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LabelImage extends JPanel{

	private static final long serialVersionUID = -1361464819446431058L;
	
	private Image _image;
	private String _src;
	
	public LabelImage(String src) {
		_src = src;
	}
	
	protected void paintComponent(Graphics g){
		if (_src != null){
			_image = new ImageIcon(getClass().getResource(_src)).getImage();
			super.paintComponent(g);
			g.drawImage(_image, 0, 0, this.getWidth(), this.getHeight(),this);
		}
		updateUI();
	}

}