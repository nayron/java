/*
 * SearchPanel.java
 *
 * Created on August 6, 2008, 5:39 PM
 */

package nayron.UFT.controleprodutos.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.print.PrinterException;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import nayron.UFT.controleprodutos.bi.ProdutosBI;
import nayron.UFT.controleprodutos.components.GeneralTableModel;
import nayron.UFT.controleprodutos.model.Produto;

/**
 * 
 * @author luis.tavares
 */
public class SearchPanel extends JPanel implements PrintableInterface {

	private static final long serialVersionUID = 5633522097883101723L;

	private JPanel _jPanelCentro;
	private JPanel _jPanelSul;
	private JPanel _jPanelTable;

	private ButtonGroup _buttonGroup;
	private JRadioButton _jRadioButtonID;
	private JRadioButton _jRadioButtonNome;
	private JRadioButton _jRadioButtonMarca;
	private JRadioButton _jRadioButtonModelo;
	private JRadioButton _jRadioButtonTipo;
	private JRadioButton _jRadioButtonListar;
	private JButton _jButtonOK;
	private JButton _jButtonExcluir;
	private JButton _jButtonEditar;
	private JLabel _jLabelPesquisar;
	private JLabel _jLabelTitulo;
	private DefaultTableModel _tableModelItens;
	private JTable _tableItens;
	private JTextArea _jTextArea;
	private JTextField _jTextField;

	private GridBagConstraints _jTextFieldGBC;
	private GridBagConstraints _jButtonOKGBC;
	private GridBagConstraints _jButtonEditarGBC;
	private GridBagConstraints _jButtonExcluirGBC;
	private GridBagConstraints _jLabelPesquisarGBC;
	private GridBagConstraints _jRadioButtonIDGBC;
	private GridBagConstraints _jRadioButtonNomeGBC;
	private GridBagConstraints _jRadioButtonMarcaGBC;
	private GridBagConstraints _jRadioButtonModeloGBC;
	private GridBagConstraints _jRadioButtonTipoGBC;
	private GridBagConstraints _jRadioButtonListarGBC;

	private ProdutosBI _produtosBI;

	private int _tipoPesquisa = 0;

	public SearchPanel() {
		super();
		PrincipalFrame.setViewToPrint(this);
		_produtosBI = new ProdutosBI();
		setLayout(new BorderLayout());

		add(getJLabelTitulo(), BorderLayout.NORTH);
		add(getJPanelCentro(), BorderLayout.CENTER);
		add(getJPanelSul(), BorderLayout.SOUTH);

		atualisaTable();
		getJTextField().requestFocusInWindow();
	}

	private GridBagConstraints getJLabelPesquisarGBC() {
		if (_jLabelPesquisarGBC == null) {
			_jLabelPesquisarGBC = new GridBagConstraints();
			_jLabelPesquisarGBC.gridx = 0;
			_jLabelPesquisarGBC.gridy = 0;
			_jLabelPesquisarGBC.gridwidth = 5;
			_jLabelPesquisarGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jLabelPesquisarGBC;
	}

	private GridBagConstraints getJRadioButtonIDGBC() {
		if (_jRadioButtonIDGBC == null) {
			_jRadioButtonIDGBC = new GridBagConstraints();
			_jRadioButtonIDGBC.gridx = 0;
			_jRadioButtonIDGBC.gridy = 1;
			_jRadioButtonIDGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jRadioButtonIDGBC;
	}

	private GridBagConstraints getJRadioButtonNomeGBC() {
		if (_jRadioButtonNomeGBC == null) {
			_jRadioButtonNomeGBC = new GridBagConstraints();
			_jRadioButtonNomeGBC.gridx = 1;
			_jRadioButtonNomeGBC.gridy = 1;
			_jRadioButtonNomeGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jRadioButtonNomeGBC;
	}

	private GridBagConstraints getJRadioButtonMarcaGBC() {
		if (_jRadioButtonMarcaGBC == null) {
			_jRadioButtonMarcaGBC = new GridBagConstraints();
			_jRadioButtonMarcaGBC.gridx = 2;
			_jRadioButtonMarcaGBC.gridy = 1;
			_jRadioButtonMarcaGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jRadioButtonMarcaGBC;
	}

	private GridBagConstraints getJRadioButtonModeloGBC() {
		if (_jRadioButtonModeloGBC == null) {
			_jRadioButtonModeloGBC = new GridBagConstraints();
			_jRadioButtonModeloGBC.gridx = 3;
			_jRadioButtonModeloGBC.gridy = 1;
			_jRadioButtonMarcaGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jRadioButtonModeloGBC;
	}

	private GridBagConstraints getJRadioButtonTipoGBC() {
		if (_jRadioButtonTipoGBC == null) {
			_jRadioButtonTipoGBC = new GridBagConstraints();
			_jRadioButtonTipoGBC.gridx = 4;
			_jRadioButtonTipoGBC.gridy = 1;
			_jRadioButtonTipoGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jRadioButtonTipoGBC;
	}

	private GridBagConstraints getJRadioButtonListarGBC() {
		if (_jRadioButtonListarGBC == null) {
			_jRadioButtonListarGBC = new GridBagConstraints();
			_jRadioButtonListarGBC.gridx = 5;
			_jRadioButtonListarGBC.gridy = 1;
			_jRadioButtonListarGBC.anchor = GridBagConstraints.LINE_START;
		}
		return _jRadioButtonListarGBC;
	}

	private GridBagConstraints getJButtonOKGBC() {
		if (_jButtonOKGBC == null) {
			_jButtonOKGBC = new GridBagConstraints();
			_jButtonOKGBC.gridx = 5;
			_jButtonOKGBC.gridy = 2;
			_jButtonOKGBC.gridwidth = 1;
			_jButtonOKGBC.insets = new Insets(5, 5, 5, 5);
			_jButtonOKGBC.fill = GridBagConstraints.BOTH;
		}
		return _jButtonOKGBC;
	}

	private GridBagConstraints getJButtonEditarGBC() {
		if (_jButtonEditarGBC == null) {
			_jButtonEditarGBC = new GridBagConstraints();
			_jButtonEditarGBC.gridx = 1;
			_jButtonEditarGBC.gridy = 3;
			_jButtonEditarGBC.gridwidth = 2;
			_jButtonEditarGBC.insets = new Insets(8, 5, 2, 5);
			_jButtonEditarGBC.fill = GridBagConstraints.BOTH;
		}
		return _jButtonEditarGBC;
	}

	private GridBagConstraints getJButtonExcluirGBC() {
		if (_jButtonExcluirGBC == null) {
			_jButtonExcluirGBC = new GridBagConstraints();
			_jButtonExcluirGBC.gridx = 3;
			_jButtonExcluirGBC.gridy = 3;
			_jButtonExcluirGBC.gridwidth = 2;
			_jButtonExcluirGBC.insets = new Insets(8, 5, 2, 5);
			_jButtonExcluirGBC.fill = GridBagConstraints.BOTH;
		}
		return _jButtonExcluirGBC;
	}

	private GridBagConstraints getJTextFieldGBC() {
		if (_jTextFieldGBC == null) {
			_jTextFieldGBC = new GridBagConstraints();
			_jTextFieldGBC.gridx = 0;
			_jTextFieldGBC.gridy = 2;
			_jTextFieldGBC.gridwidth = 5;
			_jTextFieldGBC.insets = new Insets(5, 5, 5, 5);
			_jTextFieldGBC.fill = GridBagConstraints.BOTH;
		}
		return _jTextFieldGBC;
	}

	private void atualisaTable() {
		int rowsCount = getGeneralTableModel().getRowCount();
		for (int i = 0; i < rowsCount; i++) {
			getGeneralTableModel().removeRow(0);
		}
		ArrayList<Produto> produtos = null;

		switch (_tipoPesquisa) {

		case 0: // lista todos String.format("%04d", id));
			try {
				for (Produto produto : _produtosBI.listProducts()) {
					getGeneralTableModel().addRow(new String[] { produto.getId(),
							produto.getNome(), produto.getMarca(),
							produto.getModelo(), produto.getTipo(),
							formatValue(produto.getPreco() + ""),
							produto.getQtdEstoque() + "" });
				}
			} catch (SQLException e1) {
				JOptionPane.showMessageDialog(this,
						"N�o foi poss�vel listar os produtos!\n" + e1.getMessage(),
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			break;
		case 1: // pesquisa por id
			try {
				Produto produto = _produtosBI.searchProductsById(getJTextField()
						.getText());
				if (produto != null) {
					getGeneralTableModel().addRow(new String[] { produto.getId(),
							produto.getNome(), produto.getMarca(),
							produto.getModelo(), produto.getTipo(),
							formatValue(produto.getPreco() + ""),
							produto.getQtdEstoque() + "" });
				}
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this,
						"ID Inv�lido! Tente novamente.\n\n" + e.getMessage(),
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			break;

		case 2: // pesquisa por nome
			try {
				produtos = _produtosBI.searchProductByName(getJTextField().getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this,
						"Nome inv�lido! Tente novamente.\n\n" + e.getMessage(),
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			for (Produto prod : produtos) {
				getGeneralTableModel().addRow(new String[] { prod.getId(),
					prod.getNome(), prod.getMarca(), prod.getModelo(),
					prod.getTipo(), formatValue(prod.getPreco() + ""),
					prod.getQtdEstoque() + "" });
			}
			break;
		case 3: // pesquisa por marca
			try {
				produtos = _produtosBI.searchProductByMark(getJTextField().getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this,
						"Marca inv�lida! Tente novamente.\n\n" + e.getMessage(),
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			for (Produto prod : produtos) {
				getGeneralTableModel().addRow(new String[] { prod.getId(),
					prod.getNome(), prod.getMarca(), prod.getModelo(),
					prod.getTipo(), formatValue(prod.getPreco() + ""),
					prod.getQtdEstoque() + "" });
			}
			break;
		case 4: // pesquisa por modelo
			try {
				produtos = _produtosBI.searchProductByModel(getJTextField().getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this,
						"Modelo inv�lido! Tente novamente.\n\n" + e.getMessage(),
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			for (Produto prod : produtos) {
				getGeneralTableModel().addRow(new String[] { prod.getId(),
					prod.getNome(), prod.getMarca(), prod.getModelo(),
					prod.getTipo(), formatValue(prod.getPreco() + ""),
					prod.getQtdEstoque() + "" });
			}
			break;
		case 5: // pesquisa por tipo
			try {
				produtos = _produtosBI.searchProductByType(getJTextField().getText());
			} catch (SQLException e) {
				JOptionPane.showMessageDialog(this,
						"Tipo inv�lido! Tente novamente.\n\n" + e.getMessage(),
						"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			for (Produto prod : produtos) {
				getGeneralTableModel().addRow(new String[] { prod.getId(),
					prod.getNome(), prod.getMarca(), prod.getModelo(),
					prod.getTipo(), formatValue(prod.getPreco() + ""),
					prod.getQtdEstoque() + "" });
			}
			break;
		}			
	}

	private JPanel getJPanelTable() {
		if (_jPanelTable == null) {
			Border border = BorderFactory.createRaisedBevelBorder();
			JScrollPane scrollPane = new JScrollPane(getJTableItens());
			_jPanelTable = new JPanel(new BorderLayout());
			_jPanelTable.add(scrollPane, BorderLayout.CENTER);
			_jPanelTable.setBorder(border);
		}
		return _jPanelTable;
	}

	private JLabel getJLabelTitulo() {
		if (_jLabelTitulo == null) {
			_jLabelTitulo = new JLabel();
			_jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 18));
			_jLabelTitulo.setForeground(new Color(51, 51, 255));
			_jLabelTitulo.setText("Pesquisar Item");
			_jLabelTitulo.setHorizontalAlignment(0);
		}
		return _jLabelTitulo;
	}

	private JLabel getJLabelPesquisar() {
		if (_jLabelPesquisar == null) {
			_jLabelPesquisar = new JLabel("Pesquisar itens por: ");
		}
		return _jLabelPesquisar;
	}

	private JTextField getJTextField() {
		if (_jTextField == null) {
			_jTextField = new JTextField();
		}
		return _jTextField;
	}

	private JButton getJButtonOK() {
		if (_jButtonOK == null) {
			_jButtonOK = new JButton("Ok");
			_jButtonOK.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					atualisaTable();
				}

			});
		}
		return _jButtonOK;
	}

	private JButton getJButtonEditar() {
		if (_jButtonEditar == null) {
			_jButtonEditar = new JButton("Editar");
			_jButtonEditar.setIcon(new ImageIcon(getClass().getResource("/images/editar.png")));
			_jButtonEditar.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					editItem();
				}

			});
		}
		return _jButtonEditar;
	}

	private JButton getJButtonExcluir() {
		if (_jButtonExcluir == null) {
			_jButtonExcluir = new JButton("Excluir");
			_jButtonExcluir.setIcon(new ImageIcon(getClass().getResource("/images/excluir.png")));
			_jButtonExcluir.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
				
					removeItem();
				}
			});
		}
		return _jButtonExcluir;
	}

	private DefaultTableModel getGeneralTableModel() {
		if (_tableModelItens == null) {
			_tableModelItens = new GeneralTableModel();
			_tableModelItens.setColumnIdentifiers(new String[] { "ID", "Nome",
					"Marca", "Modelo", "Tipo", "Pre�o", "QTD" });			
		}
		return _tableModelItens;
	}

	private JTable getJTableItens() {
		if (_tableItens == null) {
			_tableItens = new JTable(getGeneralTableModel());
			_tableItens.getColumn("ID").setMaxWidth(40);
			_tableItens.getColumn("Nome").setMinWidth(160);
			_tableItens.getColumn("Marca").setMinWidth(110);
			_tableItens.getColumn("Modelo").setMinWidth(110);
			_tableItens.getColumn("Tipo").setMaxWidth(100);
			_tableItens.getColumn("Pre�o").setMaxWidth(90);
			_tableItens.getColumn("QTD").setMaxWidth(90);
			_tableItens.setMaximumSize(new Dimension(500,200));
			_tableItens.addMouseListener(new MouseListener() {
				public void mouseClicked(MouseEvent e) {
				}

				public void mouseEntered(MouseEvent e) {
				}

				public void mouseExited(MouseEvent e) {
				}

				public void mousePressed(MouseEvent e) {
				}

				public void mouseReleased(MouseEvent e) {
					int row = _tableItens.getSelectedRow();
					try {
						for (Produto produto : _produtosBI.listProducts()) {
							if (Integer.parseInt(produto.getId()) == Integer
									.parseInt((_tableItens.getValueAt(row, 0)
											.toString()))) {
								getJTextArea().setText(produto.getDescricao());
							}
						}
					} catch (Exception e1) {
						JOptionPane.showMessageDialog(null,
								"Erro ao listar produtos! Tente novamente.\n\n" + e1.getMessage(),
								"Erro!", JOptionPane.WARNING_MESSAGE);
					}
				}
			});
		}
		return _tableItens;
	}

	private JPanel getJPanelSul() {
		if (_jPanelSul == null) {
			_jPanelSul = new JPanel();
			_jPanelSul.setLayout(new BorderLayout());
			_jPanelSul.add(getJPanelTable(), BorderLayout.NORTH);
			_jPanelSul.add(getJTextArea(), BorderLayout.CENTER);
		}
		return _jPanelSul;
	}

	private JPanel getJPanelCentro() {
		if (_jPanelCentro == null) {
			Border borda = BorderFactory.createRaisedBevelBorder();
			Border bordaPanel = BorderFactory.createTitledBorder(borda);

			_jPanelCentro = new JPanel();
			_jPanelCentro.setLayout(new GridBagLayout());
			_jPanelCentro.setBorder(bordaPanel);

			_jRadioButtonID = new JRadioButton("ID");
			_jRadioButtonID.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					_tipoPesquisa = 1;
					_jTextField.setEditable(true);
				}

			});
			_jRadioButtonNome = new JRadioButton("Nome");
			_jRadioButtonNome.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					_tipoPesquisa = 2;
					_jTextField.setEditable(true);
				}

			});
			_jRadioButtonMarca = new JRadioButton("Marca");
			_jRadioButtonMarca.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					_tipoPesquisa = 3;
					_jTextField.setEditable(true);
				}

			});

			_jRadioButtonModelo = new JRadioButton("Modelo");
			_jRadioButtonModelo.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					_tipoPesquisa = 4;
					_jTextField.setEditable(true);
				}

			});

			_jRadioButtonTipo = new JRadioButton("Tipo");
			_jRadioButtonTipo.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					_tipoPesquisa = 5;
					_jTextField.setEditable(true);
				}

			});

			_jRadioButtonListar = new JRadioButton("Listar Itens");
			_jRadioButtonListar.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					_tipoPesquisa = 0;
					_jTextField.setEditable(false);
					_jTextField.setText("");
					atualisaTable();
				}

			});

			_buttonGroup = new ButtonGroup();
			_buttonGroup.add(_jRadioButtonID);
			_buttonGroup.add(_jRadioButtonNome);
			_buttonGroup.add(_jRadioButtonMarca);
			_buttonGroup.add(_jRadioButtonModelo);
			_buttonGroup.add(_jRadioButtonTipo);
			_buttonGroup.add(_jRadioButtonListar);

			_jPanelCentro.add(getJLabelPesquisar(), getJLabelPesquisarGBC());
			_jPanelCentro.add(_jRadioButtonID, getJRadioButtonIDGBC());
			_jPanelCentro.add(_jRadioButtonMarca, getJRadioButtonMarcaGBC());
			_jPanelCentro.add(_jRadioButtonNome, getJRadioButtonNomeGBC());
			_jPanelCentro.add(_jRadioButtonModelo, getJRadioButtonModeloGBC());
			_jPanelCentro.add(_jRadioButtonTipo, getJRadioButtonTipoGBC());
			_jPanelCentro.add(_jRadioButtonListar, getJRadioButtonListarGBC());
			_jPanelCentro.add(getJTextField(), getJTextFieldGBC());
			_jPanelCentro.add(getJButtonOK(), getJButtonOKGBC());
			_jPanelCentro.add(getJButtonEditar(), getJButtonEditarGBC());
			_jPanelCentro.add(getJButtonExcluir(), getJButtonExcluirGBC());
		}
		return _jPanelCentro;
	}

	private JTextArea getJTextArea() {
		if (_jTextArea == null) {
			Border borda = BorderFactory.createRaisedBevelBorder();
			borda = BorderFactory.createTitledBorder(borda,
					"Descri��o do Item: ");
			_jTextArea = new JTextArea(2,50);		
			_jTextArea.setEditable(false);
			_jTextArea.setBorder(borda);
		}
		return _jTextArea;
	}
	
	private void removeItem(){
		
		int resposta = JOptionPane.showConfirmDialog(null,
				"Deseja realmente excluir este item?",
				"Confirma��o de exclus�o",
				JOptionPane.YES_NO_OPTION,
				JOptionPane.QUESTION_MESSAGE);
		if (resposta == 0){
			try {				
				ArrayList<String> itensToRemove = new ArrayList<String>();
				int selectedRowCount = getJTableItens().getSelectedRowCount();
				int rowsCount = _tableModelItens.getRowCount();
				for(int i = 0; i < selectedRowCount; i++){
					for (int j = 0; j < rowsCount; j++){
						if (_tableItens.isRowSelected(j)){
							int selectedRow = getJTableItens().getSelectedRow();
							itensToRemove.add(getJTableItens().getValueAt(
									selectedRow, 0).toString());
							getGeneralTableModel().removeRow(selectedRow);
						}
					}
				}
				_produtosBI.removeProduct(itensToRemove);
			} catch (Exception e1) {
				e1.printStackTrace();
				JOptionPane.showMessageDialog(null,
					"Erro ao remover item.\n\n" + e1.getMessage(),
					"Erro!", JOptionPane.WARNING_MESSAGE);
			}
			atualisaTable();
		}
	}	

	private void editItem() {
		int selectedRow = getJTableItens().getSelectedRow();
		String id = null;
		try {
			id = getJTableItens().getValueAt(selectedRow, 0).toString();
		}catch (Exception e) {
			// do nothing
		}
		Produto produto = null;
		try {
			produto = _produtosBI.searchProductsById(id);
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,
					"Erro ao buscar dados do item.\n\n" + e.getMessage(),
					"Erro!", JOptionPane.WARNING_MESSAGE);			
		}
		PrincipalFrame.setView(new AddItemPanel(produto));
	}
		

	/**
	 * M�todos chamados para formatar a String passada como parametro para o
	 * formato do real.
	 * 
	 * @param value
	 * @return valor formatado.
	 */

	private String formatValue(String value) {
		value = value.replace('.', ',');
		if (value.charAt(0) == ',') {
			value = "0" + value;
		}
		if (value.charAt(value.length() - 2) == ',') {
			value = value + "0";
		}
		return value;
	}

	@Override
	public void printJTable() {
		try {
			MessageFormat headerFormat = new MessageFormat(
					"Relat�rio - Produtos");
			MessageFormat footerFormat = new MessageFormat("- {0} -");
			getJTableItens().print(JTable.PrintMode.FIT_WIDTH, headerFormat,
					footerFormat);
		} catch (PrinterException pe) {
			System.err.println("Error printing: " + pe.getMessage());
		}
	}

}
