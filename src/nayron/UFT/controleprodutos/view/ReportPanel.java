/*
 * SearchPanel.java
 *
 * Created on August 6, 2008, 5:39 PM
 */

package nayron.UFT.controleprodutos.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.print.PrinterException;
import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import org.jdesktop.swingx.JXDatePicker;

import nayron.UFT.controleprodutos.bi.VendasBI;
import nayron.UFT.controleprodutos.components.GeneralTableModel;
import nayron.UFT.controleprodutos.model.Venda;

/**
 *
 * @author  luis.tavares
 */
public class ReportPanel extends JPanel implements PrintableInterface{
	
	private static final long serialVersionUID = 5633522097883101723L;
	
	private JPanel _jPanelCentro;
	private JPanel _jPanelSul;
	private JPanel _jPanelLeste;
	private JPanel _jPanelTable;
			
	private JLabel _jLabelTitulo;
	private JLabel _jLabelPesquisar;
	private JLabel _jLabelAno;
	private JLabel _jLabelMes;
	private JLabel _jLabelDataIni;
	private JLabel _jLabelDataFim;
	
	private JComboBox _jComboBoxPeriodo;
	private JComboBox _jComboBoxAno; 
	private JComboBox _jComboBoxMes; 
	
	private DefaultTableModel _tableModelItens;
	private JTable _tableItens;
	
	private JXDatePicker _jXDatePickerDataIni; 
	private JXDatePicker _jXDatePickerDataFim; 

	private GridBagConstraints _jXDatePickerDataIniGBC;
	private GridBagConstraints _jXDatePickerDataFimGBC;	
	
	private GridBagConstraints _jComboboxPeriodoGBC;
	private GridBagConstraints _jComboboxAnoGBC;
	private GridBagConstraints _jComboboxMesGBC;
	
	private GridBagConstraints _jLabelPesquisarGBC;
	private GridBagConstraints _jLabelAnoGBC;
	private GridBagConstraints _jLabelMesGBC;
	private GridBagConstraints _jLabelDataIniGBC;
	private GridBagConstraints _jLabelDataFimGBC;
	private GridBagConstraints _jButtonGraphicGBC;
	private GridBagConstraints _jButtonImprimirGBC;
	
	private JButton _jButtonGraphic;
	private JButton _jButtonImprimir;
	
	private String[] _itensCombo = {" ","Ano","M�s","Periodo","Listar todas"};
	private VendasBI vendasBI;
	
	public ReportPanel() {
    	super();
    	setLayout(new BorderLayout());    	
    	vendasBI = new VendasBI();
    	PrincipalFrame.setViewToPrint(this);
		
		add(getJLabelTitulo(),BorderLayout.NORTH);
    	add(getJPanelCentro(),BorderLayout.CENTER);
		add(getJPanelSul(),BorderLayout.SOUTH);		
		
		getJComboBoxAno().setVisible(false);
		getJComboBoxMes().setVisible(false);
		getJLabelAno().setVisible(false);
		getJLabelMes().setVisible(false);
		getJXDatePickerDataIni().setVisible(false);
		getJXDatePickerDataFim().setVisible(false);
		getJLabelDataIni().setVisible(false);
		getJLabelDataFim().setVisible(false);
    }
	
	private GridBagConstraints getJLabelPesquisarGBC() {
		if (_jLabelPesquisarGBC == null){
			_jLabelPesquisarGBC = new GridBagConstraints();
			_jLabelPesquisarGBC.gridx = 0;
			_jLabelPesquisarGBC.gridy = 0; 
			_jLabelPesquisarGBC.insets = new Insets(5,5,5,5);
			_jLabelPesquisarGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jLabelPesquisarGBC;
	}
	
	private GridBagConstraints getJLabelAnoGBC() {
		if (_jLabelAnoGBC == null){
			_jLabelAnoGBC = new GridBagConstraints();
			_jLabelAnoGBC.gridx = 0;
			_jLabelAnoGBC.gridy = 1; 
			_jLabelAnoGBC.insets = new Insets(5,5,5,5);
			_jLabelAnoGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jLabelAnoGBC;
	}
	
	private GridBagConstraints getJLabelMesGBC() {
		if (_jLabelMesGBC == null){
			_jLabelMesGBC = new GridBagConstraints();
			_jLabelMesGBC.gridx = 0;
			_jLabelMesGBC.gridy = 2; 
			_jLabelMesGBC.insets = new Insets(5,5,5,5);
			_jLabelMesGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jLabelMesGBC;
	}
	
	private GridBagConstraints getJComboBoxPeriodoGBC() {
		if (_jComboboxPeriodoGBC == null){
			_jComboboxPeriodoGBC = new GridBagConstraints();
			_jComboboxPeriodoGBC.gridx = 1;
			_jComboboxPeriodoGBC.gridy = 0; 
			_jComboboxPeriodoGBC.ipadx = 24;
			_jComboboxPeriodoGBC.insets = new Insets(5,5,5,5);
			_jComboboxPeriodoGBC.anchor = GridBagConstraints.LINE_START;
			_jComboboxPeriodoGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jComboboxPeriodoGBC;
	}
	
	private GridBagConstraints getJComboBoxAnoGBC() {
		if (_jComboboxAnoGBC == null){
			_jComboboxAnoGBC = new GridBagConstraints();
			_jComboboxAnoGBC.gridx = 1;
			_jComboboxAnoGBC.gridy = 1; 
			_jComboboxAnoGBC.insets = new Insets(5,5,5,5);
			_jComboboxAnoGBC.anchor = GridBagConstraints.LINE_START;
			_jComboboxAnoGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jComboboxAnoGBC;
	}
	
	private GridBagConstraints getJComboBoxMesGBC() {
		if (_jComboboxMesGBC == null){
			_jComboboxMesGBC = new GridBagConstraints();
			_jComboboxMesGBC.gridx = 1;
			_jComboboxMesGBC.gridy = 2; 
			_jComboboxMesGBC.insets = new Insets(5,5,5,5);
			_jComboboxMesGBC.anchor = GridBagConstraints.LINE_START;
			_jComboboxMesGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jComboboxMesGBC;
	}	
	
	private GridBagConstraints getJLabelDataIniGBC() {
		if (_jLabelDataIniGBC == null){
			_jLabelDataIniGBC = new GridBagConstraints();
			_jLabelDataIniGBC.gridx = 0;
			_jLabelDataIniGBC.gridy = 1; 
			_jLabelDataIniGBC.insets = new Insets(15,5,5,5);
			_jLabelDataIniGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jLabelDataIniGBC;
	}
	
	private GridBagConstraints getJLabelDataFimGBC() {
		if (_jLabelDataFimGBC == null){
			_jLabelDataFimGBC = new GridBagConstraints();
			_jLabelDataFimGBC.gridx = 1;
			_jLabelDataFimGBC.gridy = 1; 
			_jLabelDataFimGBC.insets = new Insets(15,5,5,5);
			_jLabelDataFimGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jLabelDataFimGBC;
	}
	
	private GridBagConstraints getJXDatePickerDataIniGBC() {
		if (_jXDatePickerDataIniGBC == null){
			_jXDatePickerDataIniGBC = new GridBagConstraints();			
			_jXDatePickerDataIniGBC.gridx = 1;
			_jXDatePickerDataIniGBC.gridy = 2;			
			_jXDatePickerDataIniGBC.insets = new Insets(5,5,5,5);
			_jXDatePickerDataIniGBC.fill = GridBagConstraints.HORIZONTAL;			
		}
		return _jXDatePickerDataIniGBC;
	}

	private GridBagConstraints getJXDatePickerFimGBC() {
		if (_jXDatePickerDataFimGBC == null){
			_jXDatePickerDataFimGBC = new GridBagConstraints();			
			_jXDatePickerDataFimGBC.gridx = 0;
			_jXDatePickerDataFimGBC.gridy = 2;			
			_jXDatePickerDataFimGBC.insets = new Insets(5,5,5,5);
			_jXDatePickerDataFimGBC.fill = GridBagConstraints.HORIZONTAL;			
		}
		return _jXDatePickerDataFimGBC;
	}
	
	private GridBagConstraints getJButtonGraphicGBC() {
		if (_jButtonGraphicGBC == null){
			_jButtonGraphicGBC = new GridBagConstraints();			
			_jButtonGraphicGBC.gridx = 0;
			_jButtonGraphicGBC.gridy = 0;			
			_jButtonGraphicGBC.insets = new Insets(5,5,5,5);
			_jButtonGraphicGBC.fill = GridBagConstraints.HORIZONTAL;			
		}
		return _jButtonGraphicGBC;
	}
	
	private GridBagConstraints getJButtonImprimirGBC() {
		if (_jButtonImprimirGBC == null){
			_jButtonImprimirGBC = new GridBagConstraints();			
			_jButtonImprimirGBC.gridx = 0;
			_jButtonImprimirGBC.gridy = 1;			
			_jButtonImprimirGBC.insets = new Insets(5,5,5,5);
			_jButtonImprimirGBC.fill = GridBagConstraints.HORIZONTAL;			
		}
		return _jButtonImprimirGBC;
	}
			
	private JPanel getJPanelTable() {
		if (_jPanelTable==null){
			JScrollPane scrollPane = new JScrollPane(getJTableItens());
			Border border = BorderFactory.createRaisedBevelBorder();
			_jPanelTable = new JPanel(new BorderLayout());		
			_jPanelTable.add(scrollPane, BorderLayout.CENTER);		
			_jPanelTable.setBorder(border);
		}		
		return _jPanelTable;
	}
	
	private JTable getJTableItens(){
		if (_tableItens == null){
			_tableItens = new JTable(getTableModelItens());			
			_tableItens.getColumn("Data").setMinWidth(120);
			_tableItens.getColumn("Numero de Vendas").setMinWidth(80);	
			_tableItens.getColumn("Valor Vendido").setMinWidth(100);
		}
		return _tableItens;
	}
	
	private DefaultTableModel getTableModelItens(){
		if (_tableModelItens == null){
			_tableModelItens = new GeneralTableModel();
			_tableModelItens.setColumnIdentifiers(new String[]{
					"Data", "Numero de Vendas", "Valor Vendido"});			
		}
		return _tableModelItens;
	}

	private JLabel getJLabelTitulo(){
		if(_jLabelTitulo == null){	
			_jLabelTitulo = new JLabel();
			_jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 18)); 
			_jLabelTitulo.setForeground(new Color(51, 51, 255));
			_jLabelTitulo.setText("Relatório de Vendas");
			_jLabelTitulo.setHorizontalAlignment(0);
		}
        return _jLabelTitulo;
	}
	
	private JLabel getJLabelPesquisar(){
		if(_jLabelPesquisar == null){	
			_jLabelPesquisar = new JLabel("Pesquisar vendas por: ");			
		}
        return _jLabelPesquisar;
	}
	
	private JLabel getJLabelAno(){
		if(_jLabelAno == null){	
			_jLabelAno = new JLabel("Ano: ");			
		}
        return _jLabelAno;
	}
	
	private JLabel getJLabelMes(){
		if(_jLabelMes == null){	
			_jLabelMes = new JLabel("Mês: ");			
		}
        return _jLabelMes;
	}
	
	private JLabel getJLabelDataIni(){
		if(_jLabelDataIni == null){	
			_jLabelDataIni = new JLabel("Data Inicial: ");			
		}
        return _jLabelDataIni;
	}
	
	private JLabel getJLabelDataFim(){
		if(_jLabelDataFim == null){	
			_jLabelDataFim = new JLabel("Data Final: ");			
		}
        return _jLabelDataFim;
	}	 
    
    private JButton getJButtonGraphic(){
		if(_jButtonGraphic == null){	
			_jButtonGraphic = new JButton("Gráfico");
			_jButtonGraphic.setIcon(new ImageIcon(getClass().getResource("/images/grafico.png")));
			_jButtonGraphic.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					exibeGrafico();					
				}
				
			});
		}
        return _jButtonGraphic;
	}
    
    private JButton getJButtonImprimir(){
		if(_jButtonImprimir == null){	
			_jButtonImprimir = new JButton("Imprimir");	
			_jButtonImprimir.setIcon(new ImageIcon(getClass().getResource("/images/imprimir.png")));
			_jButtonImprimir.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					printJTable();					
				}
				
			});
		}
        return _jButtonImprimir;
	}
   
	private JComboBox getJComboBoxPeriodo(){
		if(_jComboBoxPeriodo == null){	
			_jComboBoxPeriodo = new JComboBox(_itensCombo);
			_jComboBoxPeriodo.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
									
					if (_jComboBoxPeriodo.getSelectedItem().toString().equals("Ano")){
						getJComboBoxAno().setSelectedIndex(0);
						getJComboBoxAno().setVisible(true);	
						getJLabelAno().setVisible(true);	
						getJComboBoxMes().setVisible(false);
						getJLabelMes().setVisible(false);
						getJLabelDataIni().setVisible(false);
						getJLabelDataFim().setVisible(false);
						getJXDatePickerDataIni().setVisible(false);
						getJXDatePickerDataFim().setVisible(false);
					}else if(_jComboBoxPeriodo.getSelectedItem().toString().equals("Período")){
						getJComboBoxAno().setVisible(false);
						getJLabelAno().setVisible(false);
						getJComboBoxMes().setVisible(false);
						getJLabelMes().setVisible(false);
						getJLabelDataIni().setVisible(true);
						getJLabelDataFim().setVisible(true);
						getJXDatePickerDataIni().setVisible(true);
						getJXDatePickerDataFim().setVisible(true);
					}else if(_jComboBoxPeriodo.getSelectedItem().toString().equals("Mês")){
						getJComboBoxAno().setSelectedIndex(0);
						getJComboBoxAno().setVisible(true);	
						getJLabelAno().setVisible(true);	
						getJComboBoxMes().setVisible(true);
						getJLabelMes().setVisible(true);
						getJLabelDataIni().setVisible(false);
						getJLabelDataFim().setVisible(false);
						getJXDatePickerDataIni().setVisible(false);
						getJXDatePickerDataFim().setVisible(false);
					}else if(_jComboBoxPeriodo.getSelectedItem().toString().equals("Listar todas")){
						getJComboBoxAno().setVisible(false);	
						getJLabelAno().setVisible(false);	
						getJComboBoxMes().setVisible(false);
						getJLabelMes().setVisible(false);
						getJLabelDataIni().setVisible(false);
						getJLabelDataFim().setVisible(false);
						getJXDatePickerDataIni().setVisible(false);
						getJXDatePickerDataFim().setVisible(false);
						listarVendas();
					}
				}
				
			});
		}
        return _jComboBoxPeriodo;
	}
	
	private JComboBox getJComboBoxAno(){
		if(_jComboBoxAno == null){	
			GregorianCalendar calendario = new GregorianCalendar();  		
			int ano = calendario.get(GregorianCalendar.YEAR);		
			String[] anos = new String[11];	
			anos[0] = " ";
			for(int i = 1; i<11; i++){
				anos[i] = (ano--)+"";
			}			
			_jComboBoxAno = new JComboBox(anos);
			_jComboBoxAno.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					if (getJComboBoxPeriodo().getSelectedItem().toString().equals("Mês")){
						getJComboBoxMes().setSelectedIndex(0);
						getJComboBoxMes().setVisible(true);
						getJLabelMes().setVisible(true);
					}else if (getJComboBoxPeriodo().getSelectedItem().toString().equals("Ano")){
						getJComboBoxMes().setVisible(false);
						getJLabelMes().setVisible(false);
						if (!getJComboBoxAno().getSelectedItem().toString().equals(" "))
							buscaVendaAno(getJComboBoxAno().getSelectedItem().toString());
					}
				}
				
			});
			
		}
        return _jComboBoxAno;
	}
	
	private JComboBox getJComboBoxMes(){
		if(_jComboBoxMes == null){	
			String meses[] = {" ", "Janeiro", "Fevereiro", "Mar�o", 
					"Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", 
					"Outubro", "Novembro", "Dezembro"};
			_jComboBoxMes = new JComboBox(meses);		
			_jComboBoxMes.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					if (!_jComboBoxMes.getSelectedItem().toString().equals(" ") && 
							!_jComboBoxAno.getSelectedItem().toString().equals(" "))
						buscaVendaMes(getJComboBoxAno().getSelectedItem().toString(),
							(_jComboBoxMes.getSelectedIndex())+"");					
				}
				
			});
		}
        return _jComboBoxMes;
	}

	private JXDatePicker getJXDatePickerDataIni(){
		if (_jXDatePickerDataIni == null){
			_jXDatePickerDataIni = new JXDatePicker();
			_jXDatePickerDataIni.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					if (getJXDatePickerDataFim().getDate() != null){
						buscaVendaPeriodo();						
					}
				}
				
			});
		}
		return _jXDatePickerDataIni;
	}
	
	private JXDatePicker getJXDatePickerDataFim(){
		if (_jXDatePickerDataFim == null){
			_jXDatePickerDataFim = new JXDatePicker();	
			_jXDatePickerDataFim.addActionListener(new ActionListener(){

				@Override
				public void actionPerformed(ActionEvent e) {
					if (getJXDatePickerDataIni().getDate() != null){
						buscaVendaPeriodo();						
					}
				}
				
			});
		}
		return _jXDatePickerDataFim;
	}
	
	private JPanel getJPanelSul(){
		if(_jPanelSul == null){
			_jPanelSul = new JPanel();
			_jPanelSul.add(getJPanelTable());
			_jPanelSul.add(getJPanelLeste());
		}
		return _jPanelSul;
	}	
	
    private JPanel getJPanelCentro(){
    	if(_jPanelCentro == null){
    		Border borda = BorderFactory.createRaisedBevelBorder();
			Border bordaPanel = BorderFactory.createTitledBorder(borda);
			
			_jPanelCentro = new JPanel();
    		_jPanelCentro.setLayout(new GridBagLayout());
    		_jPanelCentro.setBorder(bordaPanel);    		   	   
    		_jPanelCentro.add(getJLabelPesquisar(), getJLabelPesquisarGBC());
    		_jPanelCentro.add(getJComboBoxPeriodo(), getJComboBoxPeriodoGBC());
    		_jPanelCentro.add(getJComboBoxAno(), getJComboBoxAnoGBC());
    		_jPanelCentro.add(getJComboBoxMes(), getJComboBoxMesGBC());
    		_jPanelCentro.add(getJLabelAno(), getJLabelAnoGBC());
    		_jPanelCentro.add(getJLabelMes(), getJLabelMesGBC()); 
    		_jPanelCentro.add(getJLabelDataIni(), getJLabelDataIniGBC());
    		_jPanelCentro.add(getJLabelDataFim(), getJLabelDataFimGBC());
    		_jPanelCentro.add(getJXDatePickerDataIni(), getJXDatePickerDataIniGBC());
    		_jPanelCentro.add(getJXDatePickerDataFim(), getJXDatePickerFimGBC());    
    	}
    	return _jPanelCentro;
    }   
   
    private JPanel getJPanelLeste(){
		if(_jPanelLeste == null){
			_jPanelLeste = new JPanel(new GridBagLayout());
			_jPanelLeste.add(getJButtonGraphic(),getJButtonGraphicGBC());
			_jPanelLeste.add(getJButtonImprimir(),getJButtonImprimirGBC());
		}
		return _jPanelLeste;
	}
    
    private void buscaVendaAno(String ano) {
    	int rowsCount = getJTableItens().getRowCount();
    	for (int i = 0; i < rowsCount; i++){
    		getTableModelItens().removeRow(0);
    	}
    	try {
			for (Venda venda: vendasBI.buscaVendas(ano)){			
				DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");     
				String sDate = df.format(venda.getDate()); 				
				getTableModelItens().addRow(new String[]{sDate,
					venda.getNumVendas()+"",formatValue(venda.getValorVendido()+"")});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, 
				"Erro ao pesquisar vendas!\n\n" + e.getMessage(), 
				"Erro!", JOptionPane.WARNING_MESSAGE);			
		}
    			
	}
	
    private void buscaVendaMes(String ano, String mes) {
    	int rowsCount = getJTableItens().getRowCount();
    	for (int i = 0; i < rowsCount; i++){
    		getTableModelItens().removeRow(0);
    	}
    	try {
			for (Venda venda: vendasBI.buscaVendas(ano,mes)){			
				DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");     
				String sDate = df.format(venda.getDate()); 				
				getTableModelItens().addRow(new String[]{sDate,
					venda.getNumVendas()+"",formatValue(venda.getValorVendido()+"")});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, 
				"Erro ao pesquisar vendas!\n\n" + e.getMessage(), 
				"Erro!", JOptionPane.WARNING_MESSAGE);			
		}
    			
	}
    
    private void buscaVendaPeriodo() {
    	Date dataIni = _jXDatePickerDataIni.getDate();
    	Date dataFim = _jXDatePickerDataFim.getDate();
    	int rowsCount = getJTableItens().getRowCount();
    	for (int i = 0; i < rowsCount; i++){
    		getTableModelItens().removeRow(0);
    	}
    	try {
			for (Venda venda: vendasBI.buscaVendas(dataIni,dataFim)){			
				DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");     
				String sDate = df.format(venda.getDate()); 				
				getTableModelItens().addRow(new String[]{sDate,
					venda.getNumVendas()+"",formatValue(venda.getValorVendido()+"")});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, 
				"Erro ao pesquisar vendas!\n\n"+ e.getMessage(), 
				"Erro!", JOptionPane.WARNING_MESSAGE);			
		}
    			
	}
    
    private void listarVendas() {
    	int rowsCount = getJTableItens().getRowCount();
    	for (int i = 0; i < rowsCount; i++){
    		getTableModelItens().removeRow(0);
    	} 
    	try {
			for (Venda venda: vendasBI.listarVendas()){			
				DateFormat df = new SimpleDateFormat("dd/MMM/yyyy");     
				String sDate = df.format(venda.getDate()); 				
				getTableModelItens().addRow(new String[]{sDate,
					venda.getNumVendas()+"",formatValue(venda.getValorVendido()+"")});
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, 
				"Erro ao pesquisar vendas!\n\n"+ e.getMessage(), 
				"Erro!", JOptionPane.WARNING_MESSAGE);			
		}		
    }
    
    @Override
    public void printJTable(){
		try {
			MessageFormat headerFormat = new MessageFormat("Relat�rio - Vendas");
			MessageFormat footerFormat = new MessageFormat("- {0} -");
			getJTableItens().print(JTable.PrintMode.FIT_WIDTH, headerFormat, footerFormat);
		} catch (PrinterException pe) {
			System.err.println("Error printing: " + pe.getMessage());
		}
	}    
    
	private void exibeGrafico() {
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		int rowsCount = getJTableItens().getRowCount();
    	for (int i = 0; i < rowsCount; i++){
    		String sDataVenda = getJTableItens().getValueAt(i, 0).toString();		
    		String sNumVendas = getJTableItens().getValueAt(i, 1).toString();
    		String sValorVendido = getJTableItens().getValueAt(i, 2).toString();
    		
    		SimpleDateFormat format = new SimpleDateFormat("dd/MMM/yyyy");  
    		Date dDataVenda = null;
			try {
				dDataVenda = new Date(format.parse(sDataVenda).getTime());
			} catch (ParseException e) {
				JOptionPane.showMessageDialog(this, 
						"Erro ao converter data!\n\n"+ e.getMessage(), 
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			sValorVendido = sValorVendido.replace(",", ".");
    		int iNumVendas = Integer.parseInt(sNumVendas);    		
    		float fValorVendido = Float.parseFloat(sValorVendido);    		
    		Venda venda = new Venda();
    		venda.setDate(dDataVenda);
    		venda.setValorVendido(fValorVendido);
    		venda.setNumVendas(iNumVendas);
    		vendas.add(venda);
    	}
    	PrincipalFrame.setView(new SalesGraphicPanel(vendas,this));
	}
    
	/**
	 * Abaixo segue alguns m�todos chamados para formatar
	 * a String passada como parametro para o formato do real.
	 * @param value
	 * @return valor formatado.
	 */	
	
	private String formatValue(String value){
		value = value.replace('.',',');				
		if (value.charAt(0)==','){
			value = "0" + value;
		}
		if (value.charAt(value.length()-2)==','){
			value = value + "0";
		}
		return value;		
	}		
}
