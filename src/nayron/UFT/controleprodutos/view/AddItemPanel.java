package nayron.UFT.controleprodutos.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;

import nayron.UFT.controleprodutos.bi.ProdutosBI;
import nayron.UFT.controleprodutos.components.RealTextField;
import nayron.UFT.controleprodutos.model.Produto;

public class AddItemPanel extends JPanel {

	private static final long serialVersionUID = 3200589630455659504L;

	private JPanel _jPanelFundo;
	private JPanel _jPanelCadastro;
	private JPanel _jPanelBotoes;
	private JButton _jButtonSalvar;
	private JButton _jButtonLimpar;

	private JLabel _jLabelTitulo;
	private JLabel _jLabelID;
	private JLabel _jLabelPreco;
	private JLabel _jLabelNome;
	private JLabel _jLabelTipo;
	private JLabel _jLabelModelo;
	private JLabel _jLabelMarca;
	private JLabel _jLabelDescricao;
	private JLabel _jLabelEstoque;

	// GBC
	private GridBagConstraints _jLabelIDGBC;
	private GridBagConstraints _jLabelPrecoGBC;
	private GridBagConstraints _jLabelNomeGBC;
	private GridBagConstraints _jLabelTipoGBC;
	private GridBagConstraints _jLabelModeloGBC;
	private GridBagConstraints _jLabelMarcaGBC;
	private GridBagConstraints _jLabelDescricaoGBC;
	private GridBagConstraints _jLabelEstoqueGBC;

	private GridBagConstraints _jTextFieldIDGBC;
	private GridBagConstraints _jTextFieldNomeGBC;
	private GridBagConstraints _jTextFieldModeloGBC;
	private GridBagConstraints _jTextFieldTipoGBC;
	private GridBagConstraints _jTextFieldPrecoGBC;
	private GridBagConstraints _jTextFieldMarcaGBC;
	private GridBagConstraints _jTextFieldEstoqueGBC;
	private GridBagConstraints _jScrollPaneDescricaoGBC;

	private JTextField _jTextFieldID;
	private JTextField _jTextFieldNome;
	private JTextField _jTextFieldModelo;
	private JTextField _jTextFieldTipo;
	private JTextField _jTextFieldMarca;
	private JTextField _jTextFieldEstoque;
	private RealTextField _realTextFieldPreco;

	private JScrollPane _jScrollPaneDescricao;
	private JTextArea _jTextAreaDescricao;
	private ProdutosBI produtosBI;
	
	private boolean _editingMode;

	public AddItemPanel() {
		super();
		PrincipalFrame.removeItemPrint(); // Este Panel n�o tem itens para
											// impress�o
		_editingMode = false;
		produtosBI = new ProdutosBI();
		setLayout(new BorderLayout());
		getJLabelTitulo().setText("Cadastrar Produto");
		add(get_jPanelFundo(), BorderLayout.CENTER);		
	}

	public AddItemPanel(Produto produto) {
		super();
		PrincipalFrame.removeItemPrint(); // Este Panel n�o tem itens para
											// impress�o
		_editingMode = true;
		produtosBI = new ProdutosBI();
		setLayout(new BorderLayout());
		getJLabelTitulo().setText("Editar Produto");
		getJTextFieldID().setText(produto.getId());
		getJTextFieldNome().setText(produto.getNome());
		getJTextFieldMarca().setText(produto.getMarca());
		getJTextFieldModelo().setText(produto.getModelo());
		getJTextFieldTipo().setText(produto.getTipo());
		getJTextFieldEstoque().setText(produto.getQtdEstoque() + "");
		getRealTextFieldPreco().setText(formatValue(produto.getPreco() + ""));
		getJTextAreaDescricao().setText(produto.getDescricao());
		add(get_jPanelFundo(), BorderLayout.CENTER);
	}

	private JPanel get_jPanelFundo() {
		if (_jPanelFundo == null) {
			_jPanelFundo = new JPanel();
			_jPanelFundo.setLayout(new BorderLayout());
			_jPanelFundo.setSize(new Dimension(700, 600));
			_jPanelFundo.add(getJLabelTitulo(), BorderLayout.NORTH);
			_jPanelFundo.add(get_jPanelCadastro(), BorderLayout.CENTER);
			_jPanelFundo.add(getJPanelBotoes(), BorderLayout.SOUTH);
		}
		return _jPanelFundo;
	}

	private JPanel getJPanelBotoes() {
		if (_jPanelBotoes == null) {
			_jPanelBotoes = new JPanel();
			Border borda = BorderFactory.createRaisedBevelBorder();
			borda = BorderFactory.createTitledBorder(borda);
			_jPanelBotoes.setBorder(borda);
			_jPanelBotoes.add(getJButtonSalvar());
			_jPanelBotoes.add(getJButtonLimpar());
		}
		return _jPanelBotoes;
	}

	private JPanel get_jPanelCadastro() {
		if (_jPanelCadastro == null) {
			_jPanelCadastro = new JPanel();
			_jPanelCadastro.setLayout(new GridBagLayout());
			Border borda = BorderFactory.createRaisedBevelBorder();
			borda = BorderFactory.createTitledBorder(borda,
					"Digite as informa��es do produto: ");
			_jPanelCadastro.setBorder(borda);
			_jPanelCadastro.add(getJLabelID(), getJLabelIDGBC());
			_jPanelCadastro.add(getJTextFieldID(), getJTextFieldIDGBC());
			_jPanelCadastro.add(getJTextFieldNome(), getJTextFieldNomeGBC());
			_jPanelCadastro.add(getJLabelNome(), getJLabelNomeGBC());
			_jPanelCadastro.add(getJLabelTipo(), getJLabelTipoGBC());
			_jPanelCadastro.add(getJTextFieldTipo(), getJTextFieldTipoGBC());
			_jPanelCadastro
					.add(getJTextFieldModelo(), getJTextFieldModeloGBC());
			_jPanelCadastro.add(getJLabelModelo(), getJLabelModeloGBC());
			_jPanelCadastro.add(getJLabelPreco(), getJLabelPrecoGBC());
			_jPanelCadastro
					.add(getRealTextFieldPreco(), getRealFieldPrecoGBC());
			_jPanelCadastro.add(getJLabelEstoque(), getJLabelEstoqueGBC());
			_jPanelCadastro.add(getJTextFieldEstoque(),
					getJTextFieldEstoqueGBC());
			_jPanelCadastro.add(getJLabelMarca(), getJLabelMarcaGBC());
			_jPanelCadastro.add(getJTextFieldMarca(), getJTextFieldMarcaGBC());
			_jPanelCadastro.add(get_jScrollPaneDescricao(),
					getJScrollPaneDescricaoGBC());
			_jPanelCadastro.add(getJLabelDescricao(), getJLabelDescricaoGBC());
		}
		return _jPanelCadastro;
	}

	private GridBagConstraints getJLabelIDGBC() {
		if (_jLabelIDGBC == null) {
			_jLabelIDGBC = new GridBagConstraints();
			_jLabelIDGBC.gridx = 0;
			_jLabelIDGBC.gridy = 0;
			_jLabelIDGBC.gridwidth = 1;
			_jLabelIDGBC.fill = GridBagConstraints.LINE_START;
			_jLabelIDGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelIDGBC;
	}

	private GridBagConstraints getJLabelPrecoGBC() {
		if (_jLabelPrecoGBC == null) {
			_jLabelPrecoGBC = new GridBagConstraints();
			_jLabelPrecoGBC.gridx = 2;
			_jLabelPrecoGBC.gridy = 4;
			_jLabelPrecoGBC.gridwidth = 1;
			_jLabelPrecoGBC.fill = GridBagConstraints.LINE_START;
			_jLabelPrecoGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelPrecoGBC;
	}

	private GridBagConstraints getJLabelNomeGBC() {
		if (_jLabelNomeGBC == null) {
			_jLabelNomeGBC = new GridBagConstraints();
			_jLabelNomeGBC.gridx = 0;
			_jLabelNomeGBC.gridy = 1;
			_jLabelNomeGBC.gridwidth = 1;
			_jLabelNomeGBC.fill = GridBagConstraints.LINE_START;
			_jLabelNomeGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelNomeGBC;
	}

	private GridBagConstraints getJLabelTipoGBC() {
		if (_jLabelTipoGBC == null) {
			_jLabelTipoGBC = new GridBagConstraints();
			_jLabelTipoGBC.gridx = 0;
			_jLabelTipoGBC.gridy = 4;
			_jLabelTipoGBC.gridwidth = 1;
			_jLabelTipoGBC.fill = GridBagConstraints.LINE_START;
			_jLabelTipoGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelTipoGBC;
	}

	private GridBagConstraints getJLabelModeloGBC() {
		if (_jLabelModeloGBC == null) {
			_jLabelModeloGBC = new GridBagConstraints();
			_jLabelModeloGBC.gridx = 0;
			_jLabelModeloGBC.gridy = 3;
			_jLabelModeloGBC.gridwidth = 1;
			_jLabelModeloGBC.fill = GridBagConstraints.LINE_START;
			_jLabelModeloGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelModeloGBC;
	}

	private GridBagConstraints getJLabelMarcaGBC() {
		if (_jLabelMarcaGBC == null) {
			_jLabelMarcaGBC = new GridBagConstraints();
			_jLabelMarcaGBC.gridx = 0;
			_jLabelMarcaGBC.gridy = 2;
			_jLabelMarcaGBC.gridwidth = 1;
			_jLabelMarcaGBC.fill = GridBagConstraints.LINE_START;
			_jLabelMarcaGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelMarcaGBC;
	}

	private GridBagConstraints getJLabelDescricaoGBC() {
		if (_jLabelDescricaoGBC == null) {
			_jLabelDescricaoGBC = new GridBagConstraints();
			_jLabelDescricaoGBC.gridx = 0;
			_jLabelDescricaoGBC.gridy = 5;
			_jLabelDescricaoGBC.gridwidth = 1;
			_jLabelDescricaoGBC.fill = GridBagConstraints.LINE_START;
			_jLabelDescricaoGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelDescricaoGBC;
	}

	private GridBagConstraints getJLabelEstoqueGBC() {
		if (_jLabelEstoqueGBC == null) {
			_jLabelEstoqueGBC = new GridBagConstraints();
			_jLabelEstoqueGBC.gridx = 4;
			_jLabelEstoqueGBC.gridy = 4;
			_jLabelEstoqueGBC.gridwidth = 1;
			_jLabelEstoqueGBC.fill = GridBagConstraints.LINE_START;
			_jLabelEstoqueGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelEstoqueGBC;
	}

	private GridBagConstraints getJTextFieldIDGBC() {
		if (_jTextFieldIDGBC == null) {
			_jTextFieldIDGBC = new GridBagConstraints();
			_jTextFieldIDGBC.gridx = 1;
			_jTextFieldIDGBC.gridy = 0;
			_jTextFieldIDGBC.gridwidth = 1;
			_jTextFieldIDGBC.anchor = GridBagConstraints.LINE_START;
			_jTextFieldIDGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldIDGBC;
	}

	private GridBagConstraints getJTextFieldEstoqueGBC() {
		if (_jTextFieldEstoqueGBC == null) {
			_jTextFieldEstoqueGBC = new GridBagConstraints();
			_jTextFieldEstoqueGBC.gridx = 5;
			_jTextFieldEstoqueGBC.gridy = 4;
			_jTextFieldEstoqueGBC.gridwidth = 1;
			_jTextFieldEstoqueGBC.ipadx = 40;
			_jTextFieldEstoqueGBC.fill = GridBagConstraints.HORIZONTAL;
			_jTextFieldEstoqueGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldEstoqueGBC;
	}

	private GridBagConstraints getJTextFieldNomeGBC() {
		if (_jTextFieldNomeGBC == null) {
			_jTextFieldNomeGBC = new GridBagConstraints();
			_jTextFieldNomeGBC.gridx = 1;
			_jTextFieldNomeGBC.gridy = 1;
			_jTextFieldNomeGBC.gridwidth = 5;
			_jTextFieldIDGBC.ipadx = 500;
			_jTextFieldNomeGBC.fill = GridBagConstraints.HORIZONTAL;
			_jTextFieldNomeGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldNomeGBC;
	}

	private GridBagConstraints getJTextFieldModeloGBC() {
		if (_jTextFieldModeloGBC == null) {
			_jTextFieldModeloGBC = new GridBagConstraints();
			_jTextFieldModeloGBC.gridx = 1;
			_jTextFieldModeloGBC.gridy = 3;
			_jTextFieldModeloGBC.gridwidth = 5;
			_jTextFieldModeloGBC.fill = GridBagConstraints.HORIZONTAL;
			_jTextFieldModeloGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldModeloGBC;
	}

	private GridBagConstraints getJTextFieldTipoGBC() {
		if (_jTextFieldTipoGBC == null) {
			_jTextFieldTipoGBC = new GridBagConstraints();
			_jTextFieldTipoGBC.gridx = 1;
			_jTextFieldTipoGBC.gridy = 4;
			_jTextFieldTipoGBC.gridwidth = 1;
			_jTextFieldTipoGBC.ipadx = 60;
			_jTextFieldTipoGBC.fill = GridBagConstraints.HORIZONTAL;
			_jTextFieldTipoGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldTipoGBC;
	}

	private GridBagConstraints getRealFieldPrecoGBC() {
		if (_jTextFieldPrecoGBC == null) {
			_jTextFieldPrecoGBC = new GridBagConstraints();
			_jTextFieldPrecoGBC.gridx = 3;
			_jTextFieldPrecoGBC.gridy = 4;
			_jTextFieldPrecoGBC.gridwidth = 1;
			_jTextFieldPrecoGBC.ipadx = 40;
			_jTextFieldPrecoGBC.fill = GridBagConstraints.HORIZONTAL;
			_jTextFieldPrecoGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldPrecoGBC;
	}

	private GridBagConstraints getJTextFieldMarcaGBC() {
		if (_jTextFieldMarcaGBC == null) {
			_jTextFieldMarcaGBC = new GridBagConstraints();
			_jTextFieldMarcaGBC.gridx = 1;
			_jTextFieldMarcaGBC.gridy = 2;
			_jTextFieldMarcaGBC.gridwidth = 5;
			_jTextFieldMarcaGBC.fill = GridBagConstraints.HORIZONTAL;
			_jTextFieldMarcaGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldMarcaGBC;
	}

	private GridBagConstraints getJScrollPaneDescricaoGBC() {
		if (_jScrollPaneDescricaoGBC == null) {
			_jScrollPaneDescricaoGBC = new GridBagConstraints();
			_jScrollPaneDescricaoGBC.gridx = 0;
			_jScrollPaneDescricaoGBC.gridy = 6;
			_jScrollPaneDescricaoGBC.gridwidth = 6;
			_jScrollPaneDescricaoGBC.gridheight = 2;
			_jScrollPaneDescricaoGBC.ipady = 50;
			_jScrollPaneDescricaoGBC.fill = GridBagConstraints.BOTH;
			_jScrollPaneDescricaoGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jScrollPaneDescricaoGBC;
	}

	private JLabel getJLabelTitulo() {
		if (_jLabelTitulo == null) {
			_jLabelTitulo = new JLabel();
			_jLabelTitulo.setHorizontalAlignment(SwingConstants.CENTER);
			_jLabelTitulo.setHorizontalTextPosition(SwingConstants.CENTER);
			_jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 18));
			_jLabelTitulo.setForeground(new Color(51, 51, 255));			
		}
		return _jLabelTitulo;
	}

	private JLabel getJLabelID() {
		if (_jLabelID == null) {
			_jLabelID = new JLabel();
			_jLabelID.setText("ID:");
		}
		return _jLabelID;
	}

	private JLabel getJLabelPreco() {
		if (_jLabelPreco == null) {
			_jLabelPreco = new JLabel();
			_jLabelPreco.setText("Pre�o:");
		}
		return _jLabelPreco;
	}

	private JLabel getJLabelNome() {
		if (_jLabelNome == null) {
			_jLabelNome = new JLabel();
			_jLabelNome.setText("Nome:");
		}
		return _jLabelNome;
	}

	private JLabel getJLabelTipo() {
		if (_jLabelTipo == null) {
			_jLabelTipo = new JLabel();
			_jLabelTipo.setText("Tipo:");
		}
		return _jLabelTipo;
	}

	private JLabel getJLabelModelo() {
		if (_jLabelModelo == null) {
			_jLabelModelo = new JLabel();
			_jLabelModelo.setText("Modelo:");
		}
		return _jLabelModelo;
	}

	private JLabel getJLabelMarca() {
		if (_jLabelMarca == null) {
			_jLabelMarca = new JLabel();
			_jLabelMarca.setText("Marca:");
		}
		return _jLabelMarca;
	}

	private JLabel getJLabelDescricao() {
		if (_jLabelDescricao == null) {
			_jLabelDescricao = new JLabel();
			_jLabelDescricao.setText("Descri��o:");
		}
		return _jLabelDescricao;
	}

	private JLabel getJLabelEstoque() {
		if (_jLabelEstoque == null) {
			_jLabelEstoque = new JLabel();
			_jLabelEstoque.setText("Estoque inicial: ");
		}
		return _jLabelEstoque;
	}

	/**
	 * This method initializes _jButtonCadastrar
	 * 
	 * @return javax.swing.JButton
	 */
	private JButton getJButtonSalvar() {
		if (_jButtonSalvar == null) {
			_jButtonSalvar = new JButton();
			_jButtonSalvar.setForeground(new Color(51, 51, 51));
			_jButtonSalvar.setText("Salvar");
			_jButtonSalvar.setIcon(new ImageIcon(getClass().getResource(
					"/images/confirmar.png")));
			_jButtonSalvar
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							cadastrarProduto();
						}
					});
		}
		return _jButtonSalvar;
	}

	private JButton getJButtonLimpar() {
		if (_jButtonLimpar == null) {
			_jButtonLimpar = new JButton();
			_jButtonLimpar.setForeground(new Color(51, 51, 51));
			_jButtonLimpar.setText("Limpar");
			_jButtonLimpar.setIcon(new ImageIcon(getClass().getResource(
					"/images/cancelar.png")));
			_jButtonLimpar
					.addActionListener(new java.awt.event.ActionListener() {
						public void actionPerformed(java.awt.event.ActionEvent e) {
							limparCampos();
						}
					});
		}
		return _jButtonLimpar;
	}

	protected void limparCampos() {
		getJTextFieldNome().setText("");
		getJTextFieldMarca().setText("");
		getJTextFieldModelo().setText("");
		getJTextFieldTipo().setText("");
		getRealTextFieldPreco().setText("");
		getJTextFieldEstoque().setText("");
		getJTextAreaDescricao().setText("");
	}

	private JTextField getJTextFieldID() {
		if (_jTextFieldID == null) {
			_jTextFieldID = new JTextField(8);
			_jTextFieldID.setEditable(false);
			int id;
			try {
				id = Integer.parseInt(produtosBI.getNextId()) + 1;
				_jTextFieldID.setText(String.format("%04d", id));	
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this,
						"N�o foi poss�vel gerar ID!\n" + e.getMessage(),
						"Erro ao gerar ID!", JOptionPane.WARNING_MESSAGE);
			}			
		}
		return _jTextFieldID;
	}

	private JTextField getJTextFieldNome() {
		if (_jTextFieldNome == null) {
			_jTextFieldNome = new JTextField();
		}
		return _jTextFieldNome;
	}

	private JTextField getJTextFieldTipo() {
		if (_jTextFieldTipo == null) {
			_jTextFieldTipo = new JTextField(14);
		}
		return _jTextFieldTipo;
	}

	private JTextField getJTextFieldModelo() {
		if (_jTextFieldModelo == null) {
			_jTextFieldModelo = new JTextField();
		}
		return _jTextFieldModelo;
	}

	private JTextField getJTextFieldEstoque() {
		if (_jTextFieldEstoque == null) {
			_jTextFieldEstoque = new JTextField(4);
		}
		return _jTextFieldEstoque;
	}

	private RealTextField getRealTextFieldPreco() {
		if (_realTextFieldPreco == null) {
			_realTextFieldPreco = new RealTextField();
		}
		return _realTextFieldPreco;
	}

	
	private JTextField getJTextFieldMarca() {
		if (_jTextFieldMarca == null) {
			_jTextFieldMarca = new JTextField();
		}
		return _jTextFieldMarca;
	}

	
	private JScrollPane get_jScrollPaneDescricao() {
		if (_jScrollPaneDescricao == null) {
			_jScrollPaneDescricao = new JScrollPane();
			_jScrollPaneDescricao.setViewportView(getJTextAreaDescricao());
		}
		return _jScrollPaneDescricao;
	}

	
	private JTextArea getJTextAreaDescricao() {
		if (_jTextAreaDescricao == null) {
			_jTextAreaDescricao = new JTextArea(5, 50);
		}
		return _jTextAreaDescricao;
	}

	private void cadastrarProduto() {
		Produto produto = new Produto();
		float preco;
		try {
			String sPreco = getRealTextFieldPreco().getText();
			if (sPreco.indexOf(',') > -1) // se o numero estiver no formato
											// 999,99 converte para 999.99
				sPreco = sPreco.replace(",", ".");
			preco = Float.parseFloat(sPreco);
		} catch (NumberFormatException e) {
			preco = 0;
		}
		produto.setId(getJTextFieldID().getText());
		produto.setPreco(preco);
		produto.setNome(getJTextFieldNome().getText());
		produto.setMarca(getJTextFieldMarca().getText());
		produto.setModelo(getJTextFieldModelo().getText());
		produto.setTipo(getJTextFieldTipo().getText());
		produto.setDescricao(getJTextAreaDescricao().getText());
		boolean isProductRegistered = true;
		
		try {
			produto.setQtdEstoque(Integer.parseInt(getJTextFieldEstoque()
					.getText()));
			produtosBI.addProduct(produto);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this,
					"Dado muito longo ou formato inv�lido!\n" + e.getMessage(),
					"Erro ao efetuar o cadastro!", JOptionPane.WARNING_MESSAGE);
			isProductRegistered = false;
		}
		
		if (isProductRegistered == true && _editingMode == false){
			JOptionPane.showMessageDialog(this,
					"Produto cadastrado com sucesso!",
					"Cadastro Produto", JOptionPane.INFORMATION_MESSAGE);
		}
		
		if (_editingMode){
			PrincipalFrame.setView(new SearchPanel());
		}
		else {
			try {
				getJTextFieldID().setText(
						String.format("%04d", Integer.parseInt(produtosBI.getNextId()) + 1));
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this,
						"N�o foi poss�vel gerar ID!\n" + e.getMessage(),
						"Erro ao gerar ID!", JOptionPane.WARNING_MESSAGE);
			}
		}
	}
	
	private String formatValue(String value) {
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
