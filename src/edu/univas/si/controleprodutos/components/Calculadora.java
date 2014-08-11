package edu.univas.si.controleprodutos.components;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculadora extends JPanel implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField _text;
	private JButton[] _b;
	private Font _font;
	
	private int _tamanho;
	private int _tamanho2;
	
	private String _x;
	private String _y;
	
	private char _operador;
	
	public Calculadora(){			
		_b = new JButton[20];
		_font = new Font("SansSerif", Font.BOLD,20);
		
		_tamanho = 0;
		_tamanho2 = 0;
		
		init();
	}
	
	public JTextField getJTextField(){
		if(_text == null){
			_text = new JTextField();
			_text.setFont(_font);
			_text.addActionListener(this);
		}		
		return _text;
	}
	
	public void init(){		
		JPanel pane = new JPanel();
		JPanel pane2 = new JPanel();
		pane2.setLayout(new GridLayout(4,4));
		for (int i=0; i<10; i++){
			_b[i] = new JButton(""+i);
			_b[i].setName(""+i);
			pane2.add(_b[i]);
		}
		(_b[10] = new JButton(".")).setName(".");
		(_b[11] = new JButton("=")).setName("=");
		(_b[12] = new JButton("+")).setName("+");
		(_b[13] = new JButton("-")).setName("-");
		(_b[14] = new JButton("*")).setName("*");
		(_b[15] = new JButton("/")).setName("/");
		(_b[16] = new JButton("C")).setName("C");
		pane2.add(_b[10]);
		pane2.add(_b[11]);
		pane2.add(_b[12]);
		pane2.add(_b[13]);
		pane2.add(_b[14]);
		pane2.add(_b[15]);
		pane2.add(_b[16]);
			for (int i=0; i<17; i++){
			_b[i].setFont(_font);
			_b[i].addActionListener(this);
		}
		pane.setLayout(new BorderLayout());
		pane.add(pane2, BorderLayout.CENTER);
		pane.add(getJTextField(), BorderLayout.NORTH);
		pane.add(_b[16], BorderLayout.SOUTH);
		add(pane);		
		updateUI();
	}
	
	public void actionPerformed(ActionEvent ev) {
		CalculadoraCotroller conta = new CalculadoraCotroller();
		if ((ev.getSource() instanceof JButton)){
			String str = ((JButton)ev.getSource()).getName();
			System.out.print(str);
			String temp = _text.getText().toString();
			_tamanho = temp.length(); //tamanho da string do text field
			System.out.println(_tamanho);
			_text.setText(_text.getText()+str);
			if (str.equals("C")){
				_text.setText("");
			}else if ((str.equals("/")) || (str.equals("*"))
					|| (str.equals("+")) || (str.equals("-"))){
				String aux = _text.getText().substring(0,_tamanho);
				char op = _text.getText().charAt(_tamanho);
				System.out.println("string antes do operador: "+aux);
				System.out.println("operador: "+op);
				_x = aux;
				_operador = op;
				_tamanho2 = _tamanho;
			}else if (_text.getText().charAt(_tamanho)=='='){
				String aux = _text.getText().substring(_tamanho2+1,_tamanho);
				char op = _text.getText().charAt(_tamanho);
				System.out.println("segunda string: "+aux);
				System.out.println("operador: "+op);
				_y = aux;
				if(conta.testaValorres(_x, _y, _operador)==-1){
					_text.setText("Erro!");
				}else{
					Float z = conta.calcula(_x,_y,_operador);
					System.out.println("Resultado: "+ z);
					_text.setText(z.toString());
				}
			}
			
		}
	}
	
}
 
