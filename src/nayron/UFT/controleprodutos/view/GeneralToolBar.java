
package nayron.UFT.controleprodutos.view; 

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
		setBackground(Color.blue);
		
		JButton jButtonCadastrar = new JButton("Cadastrar Item");
		jButtonCadastrar.setBackground(Color.blue);
		jButtonCadastrar.setForeground(Color.black);
		jButtonCadastrar.setIcon(new ImageIcon(getClass().getResource("/images/cadrastrar22.png")));
		jButtonCadastrar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				viewCadastraItem();
			}			
		});
		
		JButton jButtonPesquisar = new JButton("Pesquisar Item");
		jButtonPesquisar.setBackground(Color.blue);
		jButtonPesquisar.setForeground(Color.black);
		jButtonPesquisar.setIcon(new ImageIcon(getClass().getResource("/images/pesquisar22.png")));
		jButtonPesquisar.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent evt){
				viewPesquisaItem();
			}			
		});
		
		JButton jButtonEstoque = new JButton("Atualização de Estoque");
		jButtonEstoque.setBackground(Color.blue);
		jButtonEstoque.setForeground(Color.black);
		jButtonEstoque.setIcon(new ImageIcon(getClass().getResource("/images/estoque22.png")));
		jButtonEstoque.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				viewEstoque();				
			}
			
		});
		
		JButton jButtonVendas = new JButton("Monitor de Vendas");
		jButtonVendas.setBackground(Color.blue);
		jButtonVendas.setForeground(Color.black);
		jButtonVendas.setIcon(new ImageIcon(getClass().getResource("/images/vendas22.png")));
		jButtonVendas.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				 viewVendas(); 				
			}
			
		});
		
		JButton jButtonRelatorio = new JButton("Relatório das Vendas");
		jButtonRelatorio.setBackground(Color.blue);
		jButtonRelatorio.setForeground(Color.black);
		jButtonRelatorio.setIcon(new ImageIcon(getClass().getResource("/images/relatorio22.png")));
		jButtonRelatorio.addActionListener(new ActionListener(){

			public void actionPerformed(ActionEvent e) {
				 viewRelatorio(); 				
			}
			
		});
		
		JButton jButtonSair = new JButton("Sair");
		jButtonSair.setBackground(Color.WHITE);
		jButtonSair.setForeground(Color.black);
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
 
