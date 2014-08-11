/*
* File: GeneralMenuBar.java
* Creation date: 06/08/2008
* Author: Luis Antonio Tavares
* 
* Purpose: Declaration of class GeneralMenuBar
*
* Copyright 2008, INATEL Competence Center 

* All rights are reserved. Reproduction in whole or part is
* prohibited without the written consent of the copyright owner.
*/
package edu.univas.si.controleprodutos.view; 

import java.awt.Color;
import java.awt.Desktop;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

import edu.univas.si.controleprodutos.components.Calculadora;
  

public class GeneralMenuBar extends JMenuBar{

	private static final long serialVersionUID = 3820318443897760742L;
	
	private JMenu _jMenuArquivo;
	private JMenu _jMenuFerramentas;
	private JMenu _jMenuWindow;
	private JMenu _jMenuSkin;
	private JMenu _jMenuAjuda;
	
	private JMenuItem _jMenuItemImprimir;
	private JMenuItem _jMenuItemSair;
	private JMenuItem _jMenuItemCalc;	
	private JMenuItem _jMenuItemSobre;
	private JMenuItem _jMenuItemAdicionaItem;
	private JMenuItem _jMenuItemVendaItem;
	private JMenuItem _jMenuItemPesquisaItem;
	private JMenuItem _jMenuItemAtualizarItem;
	private JMenuItem _jMenuItemRelatorioVendas;
	
	private JMenuItem _jMenuItemSkin1;
	private JMenuItem _jMenuItemSkin2;
	private JMenuItem _jMenuItemSkin3;
	private JMenuItem _jMenuItemSkin4;
	private JMenuItem _jMenuItemSkin5;
	private JMenuItem _jMenuItemSkin6;
	
	private JTextArea _jTextAreaSobre;
	private JButton _jButtonWebPage;
	private JPanel _jPanelSobre;
	
	private PrintableInterface _printable;
		
	private GridBagConstraints _jButtonWebPageGBC;
	private GridBagConstraints _jTextAreaSobreGBC;
	
	public GeneralMenuBar(){
		super();	
		
		setBackground(Color.WHITE);
		
		_jMenuArquivo = new JMenu("Arquivo");			
		_jMenuArquivo.add(getJMenuItemImprimir());
		_jMenuArquivo.add(getJMenuItemSair());
		
		_jMenuFerramentas = new JMenu("Ferramentas");
		_jMenuFerramentas.add(getJMenuItemCalc());
		
		_jMenuWindow = new JMenu("Window");			
		_jMenuWindow.add(getJMenuItemAdicionaItem());
		_jMenuWindow.add(getJMenuItemVendaItem());
		_jMenuWindow.add(getJMenuItemPesquisaItem());
		_jMenuWindow.add(getJMenuItemEstoqueItem());
		_jMenuWindow.add(getJMenuItemRelatorioVendas());
		
		_jMenuSkin = new JMenu("Aparência");
		_jMenuSkin.add(getJMenuItemSkin1());
		_jMenuSkin.add(getJMenuItemSkin2());
		_jMenuSkin.add(getJMenuItemSkin3());
		_jMenuSkin.add(getJMenuItemSkin4());
		_jMenuSkin.add(getJMenuItemSkin5());
		_jMenuSkin.add(getJMenuItemSkin6());
		
		_jMenuAjuda = new JMenu("Ajuda");
		_jMenuAjuda.add(getJMenuItemSobre());
		
		add(_jMenuArquivo);
		add(_jMenuFerramentas);
		add(_jMenuWindow);
		add(_jMenuSkin);
		add(_jMenuAjuda);
	}
	
	private JMenuItem getJMenuItemImprimir(){
		if(_jMenuItemImprimir == null){
			_jMenuItemImprimir = new JMenuItem("Imprimir");
			_jMenuItemImprimir.setBackground(Color.WHITE);
			_jMenuItemImprimir.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					_printable.printJTable();					
				}				
			});
		}
		return _jMenuItemImprimir;		
	}
	
	private JMenuItem getJMenuItemSair(){
		if(_jMenuItemSair == null){
			_jMenuItemSair = new JMenuItem("Sair");
			_jMenuItemSair.setBackground(Color.WHITE);
			_jMenuItemSair.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					System.exit(0);					
				}				
			});
		}
		return _jMenuItemSair;		
	}
	
	private JMenuItem getJMenuItemCalc(){
		if(_jMenuItemCalc == null){
			_jMenuItemCalc = new JMenuItem("Calculadora");
			_jMenuItemCalc.setBackground(Color.WHITE);
			_jMenuItemCalc.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					showCalc();					
				}				
			});
		}
		return _jMenuItemCalc;		
	}
	
	private JMenuItem getJMenuItemAdicionaItem(){
		if(_jMenuItemAdicionaItem == null){
			_jMenuItemAdicionaItem = new JMenuItem("Adicionar Item");
			_jMenuItemAdicionaItem.setBackground(Color.WHITE);
			_jMenuItemAdicionaItem.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					PrincipalFrame.setView(new AddItemPanel());					
				}				
			});
		}
		return _jMenuItemAdicionaItem;		
	}
	
	private JMenuItem getJMenuItemVendaItem(){
		if(_jMenuItemVendaItem == null){
			_jMenuItemVendaItem = new JMenuItem("Registrar Venda");
			_jMenuItemVendaItem.setBackground(Color.WHITE);
			_jMenuItemVendaItem.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					PrincipalFrame.setView(new SalesPanel());					
				}				
			});
		}
		return _jMenuItemVendaItem;		
	}
	
	private JMenuItem getJMenuItemPesquisaItem(){
		if(_jMenuItemPesquisaItem == null){
			_jMenuItemPesquisaItem = new JMenuItem("Pesquisar Item");
			_jMenuItemPesquisaItem.setBackground(Color.WHITE);
			_jMenuItemPesquisaItem.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					PrincipalFrame.setView(new SearchPanel());					
				}				
			});
		}
		return _jMenuItemPesquisaItem;		
	}
	
	private JMenuItem getJMenuItemEstoqueItem(){
		if(_jMenuItemAtualizarItem == null){
			_jMenuItemAtualizarItem = new JMenuItem("Atualizar Estoque");
			_jMenuItemAtualizarItem.setBackground(Color.WHITE);
			_jMenuItemAtualizarItem.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					PrincipalFrame.setView(new StockPanel());					
				}				
			});
		}
		return _jMenuItemAtualizarItem;		
	}
	
	private JMenuItem getJMenuItemRelatorioVendas(){
		if(_jMenuItemRelatorioVendas == null){
			_jMenuItemRelatorioVendas = new JMenuItem("Relatório Vendas");
			_jMenuItemRelatorioVendas.setBackground(Color.WHITE);
			_jMenuItemRelatorioVendas.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					PrincipalFrame.setView(new ReportPanel());					
				}				
			});
		}
		return _jMenuItemRelatorioVendas;		
	}
	
	private JMenuItem getJMenuItemSkin1(){
		if(_jMenuItemSkin1 == null){
			_jMenuItemSkin1 = new JMenuItem("Business");
			_jMenuItemSkin1.setBackground(Color.WHITE);
			_jMenuItemSkin1.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					defineLookAndFeel("Business");					
				}				
			});
		}
		return _jMenuItemSkin1;		
	}
	
	private JMenuItem getJMenuItemSkin2(){
		if(_jMenuItemSkin2 == null){
			_jMenuItemSkin2 = new JMenuItem("Creme");
			_jMenuItemSkin2.setBackground(Color.WHITE);
			_jMenuItemSkin2.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					defineLookAndFeel("Creme");					
				}				
			});
		}
		return _jMenuItemSkin2;		
	}
	
	private JMenuItem getJMenuItemSkin3(){
		if(_jMenuItemSkin3 == null){
			_jMenuItemSkin3 = new JMenuItem("Legacy");
			_jMenuItemSkin3.setBackground(Color.WHITE);
			_jMenuItemSkin3.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					defineLookAndFeel("Legacy");					
				}				
			});
		}
		return _jMenuItemSkin3;		
	}
	
	private JMenuItem getJMenuItemSkin4(){
		if(_jMenuItemSkin4 == null){
			_jMenuItemSkin4 = new JMenuItem("Moderate");
			_jMenuItemSkin4.setBackground(Color.WHITE);
			_jMenuItemSkin4.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					defineLookAndFeel("Moderate");					
				}				
			});
		}
		return _jMenuItemSkin4;		
	}
	
	private JMenuItem getJMenuItemSkin5(){
		if(_jMenuItemSkin5 == null){
			_jMenuItemSkin5 = new JMenuItem("Nebula");
			_jMenuItemSkin5.setBackground(Color.WHITE);
			_jMenuItemSkin5.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					defineLookAndFeel("Nebula");					
				}				
			});
		}
		return _jMenuItemSkin5;		
	}
	
	private JMenuItem getJMenuItemSkin6(){
		if(_jMenuItemSkin6 == null){
			_jMenuItemSkin6 = new JMenuItem("Raven");
			_jMenuItemSkin6.setBackground(Color.WHITE);
			_jMenuItemSkin6.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					defineLookAndFeel("Raven");					
				}				
			});
		}
		return _jMenuItemSkin6;		
	}
	
	private JMenuItem getJMenuItemSobre(){
		if(_jMenuItemSobre == null){
			_jMenuItemSobre = new JMenuItem("Sobre");
			_jMenuItemSobre.setBackground(Color.WHITE);
			_jMenuItemSobre.addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
					showSobre();					
				}				
			});
		}
		return _jMenuItemSobre;		
	}	
	
	public void setJTableToPrint(PrintableInterface printable){
		getJMenuItemImprimir().setVisible(true);
		_printable = printable;
	}
	
	public void removeItemPrint(){		
		getJMenuItemImprimir().setVisible(false);
	}
		
	private void showCalc() {
		Calculadora calc = new Calculadora();
		calc.setVisible(true);
		
		JFrame frame = new JFrame("Calculadora");
		frame.add(calc);
		frame.setVisible(true);
		frame.setLocation(100, 100);
		frame.pack();
	}	
	
	private void showSobre() {	
		PrincipalFrame.removeItemPrint();
		PrincipalFrame.setView(getJPanelSobre());		
	}
	
	private void showWebPage() {
		Desktop desk = Desktop.getDesktop();     
		try {    
		     desk.browse(new java.net.URI("http://br.geocities.com/javafor"));    
		} catch (Exception e) {    
			JOptionPane.showMessageDialog(this, 
					"Erro! \n\n" + e.getMessage(), 
					"Erro!", JOptionPane.WARNING_MESSAGE);    
		}		
	}
	
	private void defineLookAndFeel(String lf) {
		PrincipalFrame.setLookAndFeel(lf);	
		PrincipalFrame.getInstance().repaint();
	}	

	private JPanel getJPanelSobre() {
		if(_jPanelSobre == null){
			_jPanelSobre = new JPanel(new GridBagLayout());		
			_jPanelSobre.add(getSobreTextArea(),getSobreTextAreaGBC());				
			_jPanelSobre.add(getJButtonWebPage(),getJButtonWebPageGBC());
		}
		return _jPanelSobre;
	}

	private JTextArea getSobreTextArea() {		
		if(_jTextAreaSobre == null){
			_jTextAreaSobre = new JTextArea(5,40);		
			_jTextAreaSobre.setText(
					
				"Programa desenvolvido por Luis Antonio Tavares e \n" +
				"Diego Tadeu de Almeida - alunos do curso de Sistemas \n" +
				"de Informação da Universidade do Vale do Sapucaí. \n" +
				"\nContato pelos emails: \n\nluis.tavares@msn.com\n" +
				"diegoalmeida_pa@hotmail.com\n\n\n" +
				"Pouso Alegre - Novembro de 2008"
				
				);
			_jTextAreaSobre.setEnabled(false);
		}
		return _jTextAreaSobre;
	}

	private JButton getJButtonWebPage() {
		if (_jButtonWebPage == null){
			_jButtonWebPage = new JButton("Visite nosso site!");
			_jButtonWebPage.addActionListener(new ActionListener(){
				@Override
				public void actionPerformed(ActionEvent e) {
					showWebPage();				
				}			
			});
		}
		return _jButtonWebPage;
	}

	private GridBagConstraints getSobreTextAreaGBC() {
		if (_jTextAreaSobreGBC == null){
			_jTextAreaSobreGBC = new GridBagConstraints();
			_jTextAreaSobreGBC.gridx = 0;
			_jTextAreaSobreGBC.gridy = 0;	
			_jTextAreaSobreGBC.insets = new Insets(5,5,5,5);
		}
		return _jTextAreaSobreGBC;
	}
	
	private GridBagConstraints getJButtonWebPageGBC() {
		if(_jButtonWebPageGBC == null){		
			_jButtonWebPageGBC = new GridBagConstraints();
			_jButtonWebPageGBC.gridx = 0;
			_jButtonWebPageGBC.gridy = 1;	
			_jButtonWebPageGBC.insets = new Insets(5,5,5,5);
		}
		return _jButtonWebPageGBC;
	}
}
 
