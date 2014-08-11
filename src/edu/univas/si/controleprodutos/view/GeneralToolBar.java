
package edu.univas.si.controleprodutos.view; 

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JToolBar;
  

public class GeneralToolBar extends JToolBar{
	
	private static final long serialVersionUID = -7029711809993519406L;	

	public GeneralToolBar(){
		super();
		setRollover(false);	
		setFloatable(false);
		setBackground(Color.WHITE);
		
		JButton jButtonCadastrar = new JButton("Cadastrar Item");
		jButtonCadastrar.setBackground(Color.WHITE);
		jButtonCadastrar.setForeground(Color.BLUE);
		jButtonCadastrar.setIcon(new ImageIcon(getClass().getResource("/images/cadastrar2.gif")));
		jButtonCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				viewCadastraItem();
			}			
		});
		
		JButton jButtonPesquisar = new JButton("Pesquisar Item");
		jButtonPesquisar.setBackground(Color.WHITE);
		jButtonPesquisar.setForeground(Color.BLUE);
		jButtonPesquisar.setIcon(new ImageIcon(getClass().getResource("/images/pesquisar2.gif")));
		jButtonPesquisar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				viewPesquisaItem();
			}			
		});
		
		JButton jButtonEstoque = new JButton("Atualizar Estoque");
		jButtonEstoque.setBackground(Color.WHITE);
		jButtonEstoque.setForeground(Color.BLUE);
		jButtonEstoque.setIcon(new ImageIcon(getClass().getResource("/images/estoque2.gif")));
		jButtonEstoque.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				viewEstoque();				
			}
			
		});
		
		JButton jButtonVendas = new JButton("Monitor Vendas");
		jButtonVendas.setBackground(Color.WHITE);
		jButtonVendas.setForeground(Color.BLUE);
		jButtonVendas.setIcon(new ImageIcon(getClass().getResource("/images/vendas2.gif")));
		jButtonVendas.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				 viewVendas(); 				
			}
			
		});
		
		JButton jButtonRelatorio = new JButton("Relatório Vendas");
		jButtonRelatorio.setBackground(Color.WHITE);
		jButtonRelatorio.setForeground(Color.BLUE);
		jButtonRelatorio.setIcon(new ImageIcon(getClass().getResource("/images/relatorio2.gif")));
		jButtonRelatorio.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				 viewRelatorio(); 				
			}
			
		});
		
		JButton jButtonSair = new JButton("Sair");
		jButtonSair.setBackground(Color.WHITE);
		jButtonSair.setForeground(Color.BLUE);
		jButtonSair.setIcon(new ImageIcon(getClass().getResource("/images/sair.png")));
		jButtonSair.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				System.exit(0);					
			}
			
		});
		
		add(jButtonCadastrar);  		  		
  		add(jButtonPesquisar);		  		
  		add(jButtonEstoque); 
  		add(jButtonVendas);
  		add(jButtonRelatorio);
  		add(jButtonSair);
	}
	
	private void viewRelatorio() {
		PrincipalFrame.setView(new ReportPanel());
	}

	private void viewEstoque() {
		PrincipalFrame.setView(new StockPanel());		
	}

	private void viewVendas() {
		PrincipalFrame.setView(new SalesPanel());		
	}

	private void viewCadastraItem() {
		PrincipalFrame.setView(new AddItemPanel());		
	}
	
	private void viewPesquisaItem() {
		PrincipalFrame.setView(new SearchPanel());		
	}
	

}
 
