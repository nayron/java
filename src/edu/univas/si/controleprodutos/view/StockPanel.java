package edu.univas.si.controleprodutos.view; 

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import edu.univas.si.controleprodutos.bi.ProdutosBI;
import edu.univas.si.controleprodutos.model.Produto;

public class StockPanel extends JPanel{
	
	private static final long serialVersionUID = 3754620860861494392L;
	
	private JPanel _jPanelEstoque;
	private JLabel _jLabelTitulo;
	private JLabel _jLabelID;
	private JLabel _jLabelQtd;
	private JLabel _jLabelProduto;
	private JTextField _jTextField;
	private JButton _jButtonID;
	private JButton _jButtonAtualisar;
	private JSpinner _jSpinnerStoque;
	
	private GridBagConstraints _jLabelIDGBC;	
	private GridBagConstraints _jLabelQtdGBC;
	private GridBagConstraints _jTextFieldGBC;
	private GridBagConstraints _jButtonIDGBC;
	private GridBagConstraints _jButtonAtualisarGBC;
	private GridBagConstraints _jSpinnerStoqueGBC;
	private GridBagConstraints _jLabelProdutoGBC;
	
	private ProdutosBI _produtoBI;
		
	public StockPanel(){
		PrincipalFrame.removeItemPrint(); //Este Panel não tem itens para impressão
		_produtoBI = new ProdutosBI();
		setLayout(new BorderLayout());	
		add(getJLabelTitulo(), BorderLayout.NORTH);
		add(getJPanelEstoque(), BorderLayout.CENTER);
		getJSpinner().setEnabled(false);
		getJButtonAtualisar().setEnabled(false);
	}
	
	private GridBagConstraints getJLabelIDGBC() {
		if(_jLabelIDGBC == null){
			_jLabelIDGBC = new GridBagConstraints();
			_jLabelIDGBC.insets = new Insets(5,5,5,5);
			_jLabelIDGBC.gridx = 0;
			_jLabelIDGBC.gridy = 0; 
		}
		return _jLabelIDGBC;
	}

	private GridBagConstraints getJLabelQtdGBC() {
		if (_jLabelQtdGBC == null){
			_jLabelQtdGBC = new GridBagConstraints();
			_jLabelQtdGBC.insets = new Insets(5,5,5,5);
			_jLabelQtdGBC.gridx = 0;
			_jLabelQtdGBC.gridy = 1; 
		}
		return _jLabelQtdGBC;
	}

	private GridBagConstraints getJTextFieldGBC() {
		if(_jTextFieldGBC == null){
			_jTextFieldGBC = new GridBagConstraints();
			_jTextFieldGBC.insets = new Insets(5,5,5,5);
			_jTextFieldGBC.gridx = 1;
			_jTextFieldGBC.gridy = 0; 
			_jTextFieldGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jTextFieldGBC;
	}

	private GridBagConstraints getJButtonIDGBC() {
		if (_jButtonIDGBC == null){
			_jButtonIDGBC = new GridBagConstraints();
			_jButtonIDGBC.insets = new Insets(5,5,5,5);
			_jButtonIDGBC.gridx = 2;
			_jButtonIDGBC.gridy = 0; 
			_jButtonIDGBC.fill = GridBagConstraints.BOTH;
		}
		return _jButtonIDGBC;
	}

	private GridBagConstraints getJButtonAtualisarGBC() {
		if(_jButtonAtualisarGBC == null){
			_jButtonAtualisarGBC = new GridBagConstraints();
			_jButtonAtualisarGBC.insets = new Insets(5,5,5,5);
			_jButtonAtualisarGBC.gridx = 2;
			_jButtonAtualisarGBC.gridy = 1;
		}
		return _jButtonAtualisarGBC;
	}

	private GridBagConstraints getJSpinnerStoqueGBC() {
		if (_jSpinnerStoqueGBC == null){
			_jSpinnerStoqueGBC = new GridBagConstraints();
			_jSpinnerStoqueGBC.insets = new Insets(5,5,5,5);
			_jSpinnerStoqueGBC.gridx = 1;
			_jSpinnerStoqueGBC.gridy = 1;
			_jSpinnerStoqueGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jSpinnerStoqueGBC;
	}

	private GridBagConstraints getJLabelProdutoGBC() {
		if(_jLabelProdutoGBC == null){
			_jLabelProdutoGBC = new GridBagConstraints();
			_jLabelProdutoGBC.insets = new Insets(5,5,5,5);
			_jLabelProdutoGBC.gridx = 0;
			_jLabelProdutoGBC.gridy = 2;
			_jLabelProdutoGBC.gridwidth = 3;
			_jLabelProdutoGBC.anchor = GridBagConstraints.CENTER;
			_jLabelProdutoGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jLabelProdutoGBC;
	}

	
	private JPanel getJPanelEstoque(){
		if(_jPanelEstoque == null){
			Border borda = BorderFactory.createRaisedBevelBorder();
			Border bordaPanel = BorderFactory.createTitledBorder(borda);
			
			_jPanelEstoque = new JPanel(new GridBagLayout());
			_jPanelEstoque.setBorder(bordaPanel);			
			_jPanelEstoque.add(getJLabelID(), getJLabelIDGBC());			
			_jPanelEstoque.add(getJTextField(), getJTextFieldGBC());			
			_jPanelEstoque.add(getJButtonID(), getJButtonIDGBC());			
			_jPanelEstoque.add(getJLabelQtd(), getJLabelQtdGBC());			
			_jPanelEstoque.add(getJSpinner(), getJSpinnerStoqueGBC());			
			_jPanelEstoque.add(getJButtonAtualisar(), getJButtonAtualisarGBC());
			_jPanelEstoque.add(getJLabelProduto(), getJLabelProdutoGBC());
		}
		return _jPanelEstoque;
	}
	
	private JLabel getJLabelTitulo(){
		if(_jLabelTitulo == null){
			_jLabelTitulo = new JLabel("Atualizar Estoque");	
			_jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 18)); 
			_jLabelTitulo.setForeground(new Color(51, 51, 255));
			_jLabelTitulo.setHorizontalAlignment(0);
		}
		return _jLabelTitulo;
	}
	
	private JLabel getJLabelID(){
		if(_jLabelID == null){
			_jLabelID = new JLabel("ID do produto: ");	
		}
		return _jLabelID;
	}
	
	private JLabel getJLabelQtd(){
		if(_jLabelQtd == null){
			_jLabelQtd = new JLabel("Quantidade no estoque: ");	
		}
		return _jLabelQtd;
	}
	
	private JLabel getJLabelProduto(){
		if(_jLabelProduto == null){
			_jLabelProduto = new JLabel("Insira o ID de um produto!");	
			_jLabelProduto.setBorder(new TitledBorder(""));
			_jLabelProduto.setForeground(Color.BLUE);
			_jLabelProduto.setHorizontalAlignment(JLabel.CENTER);
		}
		return _jLabelProduto;
	}
	
	private JTextField getJTextField(){
		if (_jTextField == null){
			_jTextField = new JTextField(6);
		}
		return _jTextField;
	}
	
	private JButton getJButtonID(){
		if (_jButtonID == null){
			_jButtonID = new JButton("Buscar");	
			_jButtonID.setIcon(new ImageIcon(getClass().getResource("/images/busca.png")));
			_jButtonID.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					buscaEstoque();					
				}				
			});
		}
		return _jButtonID;
	}
	
	private JButton getJButtonAtualisar(){
		if (_jButtonAtualisar == null){
			_jButtonAtualisar = new JButton("Salvar");
			_jButtonAtualisar.setIcon(new ImageIcon(getClass().getResource("/images/confirmar.png")));
			_jButtonAtualisar.addActionListener(new ActionListener(){

				public void actionPerformed(ActionEvent e) {
					atualisaEstoque();					
				}				
			});
		}
		return _jButtonAtualisar;
	}
	
	private JSpinner getJSpinner(){
		if (_jSpinnerStoque == null){
			_jSpinnerStoque = new JSpinner();	
			_jSpinnerStoque.setSize(80, 20);
		}
		return _jSpinnerStoque;
	}
	
	protected void buscaEstoque() {
		Produto produto = null;
		try {
			produto = _produtoBI.searchProductsById(getJTextField().getText());
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(this, "Id inválido!"+e.getMessage(), 
					"Erro!", JOptionPane.WARNING_MESSAGE);
		}
		if (produto!= null){
			getJSpinner().setValue(produto.getQtdEstoque());		
			getJSpinner().setEnabled(true);
			getJButtonAtualisar().setEnabled(true);
			getJLabelProduto().setText("Produto: " + produto.getNome());
		}
		else{
			getJLabelProduto().setText("Id Inválido!");
		}
	}
	
	protected void atualisaEstoque() {
		int qtd = (Integer)getJSpinner().getValue();
		String id = getJTextField().getText();
		boolean foiAtualizado = false;
		if (qtd>0){
			try {
				foiAtualizado = _produtoBI.updateStock(id, qtd);
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this, "Id ou Qtd inválidos!"+e.getMessage(), 
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
		}
		if (!foiAtualizado){
			JOptionPane.showMessageDialog(this, "Id ou Qtd estão inválidos!", 
					"Erro!", JOptionPane.WARNING_MESSAGE);
		}
		else{
			getJLabelProduto().setText("Dados atualizados!");
		}
	}
}
 
