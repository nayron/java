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
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

import nayron.UFT.controleprodutos.bi.ProdutosBI;
import nayron.UFT.controleprodutos.bi.VendasBI;
import nayron.UFT.controleprodutos.components.GeneralTableModel;
import nayron.UFT.controleprodutos.model.Produto;
import nayron.UFT.controleprodutos.model.Venda;

public class SalesPanel extends JPanel implements PrintableInterface {

	private static final long serialVersionUID = -31320477773666323L;

	private JLabel _jLabelTitulo;
	private JLabel _jLabelID;
	private JLabel _jLabelQTD;
	private JLabel _jLabelTotal;
	private JButton _jButtonAdd;
	private JButton _jButtonEfetuaCompra;
	private JButton _jButtonCancelaCompra;
	private JButton _jButtonExcluiItem;
	private JPanel _jPanelCenter;
	private JPanel _jPanelSouth;
	private JTextField _jTextFieldItem;
	private JTextField _jTextFieldQTD;
	private DefaultTableModel _tableModelItens;
	private JTable _tableItens;

	private GridBagConstraints _jButtonEfetuaCompraGBC;
	private GridBagConstraints _jButtonCancelaCompraGBC;
	private GridBagConstraints _jButtonExcluiItemGBC;
	private GridBagConstraints _jPanelTableGBC;
	private GridBagConstraints _jLabelIDGBC;
	private GridBagConstraints _jLabelQTDGBC;
	private GridBagConstraints _jTextFieldItemGBC;
	private GridBagConstraints _jTextFieldQTDGBC;
	private GridBagConstraints _jButtonAddGBC;

	private ProdutosBI _produtosBI;
	private VendasBI _vendasBI;

	public SalesPanel() {
		_produtosBI = new ProdutosBI();
		_vendasBI = new VendasBI();
		PrincipalFrame.setViewToPrint(this);

		setLayout(new BorderLayout());
		add(getJLabelTitulo(), BorderLayout.NORTH);
		add(getJPanelCenter(), BorderLayout.CENTER);
		add(getJPanelSouth(), BorderLayout.SOUTH);
		_jButtonCancelaCompraGBC = new GridBagConstraints();

	}

	private GridBagConstraints getJPanelTableGBC() {
		if (_jPanelTableGBC == null) {
			_jPanelTableGBC = new GridBagConstraints();
			_jPanelTableGBC.insets = new Insets(5, 5, 5, 5);
			_jPanelTableGBC.gridx = 0;
			_jPanelTableGBC.gridy = 0;
			_jPanelTableGBC.gridheight = 8;
		}
		return _jPanelTableGBC;
	}

	private GridBagConstraints getJLabelIDGBC() {
		if (_jLabelIDGBC == null) {
			_jLabelIDGBC = new GridBagConstraints();
			_jLabelIDGBC.gridx = 1;
			_jLabelIDGBC.gridy = 0;
			_jLabelIDGBC.gridheight = 1;
			_jLabelIDGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelIDGBC;
	}

	private GridBagConstraints getJLabelQTDGBC() {
		if (_jLabelQTDGBC == null) {
			_jLabelQTDGBC = new GridBagConstraints();
			_jLabelQTDGBC.gridx = 2;
			_jLabelQTDGBC.gridy = 0;
			_jLabelQTDGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jLabelQTDGBC;
	}

	private GridBagConstraints getJTextFieldItemGBC() {
		if (_jTextFieldItemGBC == null) {
			_jTextFieldItemGBC = new GridBagConstraints();
			_jTextFieldItemGBC.gridx = 1;
			_jTextFieldItemGBC.gridy = 1;
			_jTextFieldItemGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldItemGBC;
	}

	private GridBagConstraints getJTextFieldQTDGBC() {
		if (_jTextFieldQTDGBC == null) {
			_jTextFieldQTDGBC = new GridBagConstraints();
			_jTextFieldQTDGBC.gridx = 2;
			_jTextFieldQTDGBC.gridy = 1;
			_jTextFieldQTDGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jTextFieldQTDGBC;
	}

	private GridBagConstraints getJButtonAddGBC() {
		if (_jButtonAddGBC == null) {
			_jButtonAddGBC = new GridBagConstraints();
			_jButtonAddGBC.gridx = 3;
			_jButtonAddGBC.gridy = 1;
			_jButtonAddGBC.insets = new Insets(5, 5, 5, 5);
		}
		return _jButtonAddGBC;
	}

	private GridBagConstraints getJButtonExcluiItemGBC() {
		if (_jButtonExcluiItemGBC == null) {
			_jButtonExcluiItemGBC = new GridBagConstraints();
			_jButtonExcluiItemGBC.gridx = 1;
			_jButtonExcluiItemGBC.gridy = 2;
			_jButtonExcluiItemGBC.gridwidth = 3;
			_jButtonExcluiItemGBC.insets = new Insets(100, 5, 5, 5);
			_jButtonExcluiItemGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jButtonExcluiItemGBC;
	}

	private GridBagConstraints getJButtonCancelaCompraGBC() {
		if (_jButtonCancelaCompraGBC == null) {
			_jButtonCancelaCompraGBC = new GridBagConstraints();
			_jButtonCancelaCompraGBC.gridx = 1;
			_jButtonCancelaCompraGBC.gridy = 3;
			_jButtonCancelaCompraGBC.gridwidth = 3;
			_jButtonCancelaCompraGBC.insets = new Insets(5, 5, 5, 5);
			_jButtonCancelaCompraGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jButtonCancelaCompraGBC;
	}

	private GridBagConstraints getJButtonEfetuaCompraGBC() {
		if (_jButtonEfetuaCompraGBC == null) {
			_jButtonEfetuaCompraGBC = new GridBagConstraints();
			_jButtonEfetuaCompraGBC.gridx = 1;
			_jButtonEfetuaCompraGBC.gridy = 4;
			_jButtonEfetuaCompraGBC.gridwidth = 3;
			_jButtonEfetuaCompraGBC.insets = new Insets(5, 5, 5, 5);
			_jButtonEfetuaCompraGBC.fill = GridBagConstraints.HORIZONTAL;
		}
		return _jButtonEfetuaCompraGBC;
	}

	private JButton getJButtonAdd() {
		if (_jButtonAdd == null) {
			_jButtonAdd = new JButton("Add");
			_jButtonAdd.setFont(new Font("Arial", Font.BOLD, 12));
			_jButtonAdd.setIcon(new ImageIcon(getClass().getResource(
					"/images/adicionaItem.png")));
			_jButtonAdd.addActionListener(new ActionListener() {

				public void actionPerformed(ActionEvent e) {
					addItem();
				}
			});
		}
		return _jButtonAdd;
	}

	private JButton getJButtonEfetuaCompra() {
		if (_jButtonEfetuaCompra == null) {
			_jButtonEfetuaCompra = new JButton("Finaliza Compra");
			_jButtonEfetuaCompra.setFont(new Font("Arial", Font.BOLD, 14));
			_jButtonEfetuaCompra.setHorizontalAlignment(JButton.LEFT);
			_jButtonEfetuaCompra.setIcon(new ImageIcon(getClass().getResource(
					"/images/confirmar.png")));
			_jButtonEfetuaCompra.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					registraVenda();
				}

			});
		}
		return _jButtonEfetuaCompra;
	}

	private JButton getJButtonCancelaCompra() {
		if (_jButtonCancelaCompra == null) {
			_jButtonCancelaCompra = new JButton("Cancela Compra");
			_jButtonCancelaCompra.setFont(new Font("Arial", Font.BOLD, 14));
			_jButtonCancelaCompra.setHorizontalAlignment(JButton.LEFT);
			_jButtonCancelaCompra.setIcon(new ImageIcon(getClass().getResource(
					"/images/cancelar.png")));
			_jButtonCancelaCompra.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					clearTable();
				}

			});
		}
		return _jButtonCancelaCompra;
	}

	private JButton getJButtonExcluiItem() {
		if (_jButtonExcluiItem == null) {
			_jButtonExcluiItem = new JButton("Excluir Item");
			_jButtonExcluiItem.setFont(new Font("Arial", Font.BOLD, 14));
			_jButtonExcluiItem.setHorizontalAlignment(JButton.LEFT);
			_jButtonExcluiItem.setIcon(new ImageIcon(getClass().getResource(
					"/images/excluirItem.png")));
			_jButtonExcluiItem.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					removeItem();
				}

			});

		}
		return _jButtonExcluiItem;
	}

	private JPanel getJPanelSouth() {
		if (_jPanelSouth == null) {
			Border borda = BorderFactory.createRaisedBevelBorder();
			borda = BorderFactory.createTitledBorder(borda);

			_jPanelSouth = new JPanel();
			_jPanelSouth.setBorder(borda);
			_jPanelSouth.add(getJLabelTotal());
		}
		return _jPanelSouth;
	}

	private JLabel getJLabelTotal() {
		if (_jLabelTotal == null) {
			_jLabelTotal = new JLabel("Total: 0,00");
			_jLabelTotal.setForeground(Color.RED);
			_jLabelTotal.setFont(new Font("Arial", Font.BOLD, 32));
			_jLabelTotal.setAlignmentX(CENTER_ALIGNMENT);
		}
		return _jLabelTotal;
	}

	private JLabel getJLabelTitulo() {
		if (_jLabelTitulo == null) {
			_jLabelTitulo = new JLabel("Controle de Vendas");
			_jLabelTitulo.setFont(new Font("Arial", Font.BOLD, 18));
			_jLabelTitulo.setForeground(new Color(51, 51, 255));
			_jLabelTitulo.setHorizontalAlignment(0);
		}
		return _jLabelTitulo;
	}

	private JLabel getJLabelID() {
		if (_jLabelID == null) {
			_jLabelID = new JLabel("ID: ");
			_jLabelID.setHorizontalAlignment(0);
		}
		return _jLabelID;
	}

	private JLabel getJLabelQTD() {
		if (_jLabelQTD == null) {
			_jLabelQTD = new JLabel("QTD: ");
			_jLabelQTD.setHorizontalAlignment(0);
		}
		return _jLabelQTD;
	}

	private JPanel getJPanelCenter() {
		if (_jPanelCenter == null) {
			Border borda = BorderFactory.createRaisedBevelBorder();
			borda = BorderFactory.createTitledBorder(borda);

			_jPanelCenter = new JPanel();
			_jPanelCenter.setLayout(new GridBagLayout());
			_jPanelCenter.setBorder(borda);

			_jPanelCenter.add(getJPanelTable(), getJPanelTableGBC());
			_jPanelCenter.add(getJLabelID(), getJLabelIDGBC());
			_jPanelCenter.add(getJLabelQTD(), getJLabelQTDGBC());
			_jPanelCenter.add(getJTextFieldItem(), getJTextFieldItemGBC());
			_jPanelCenter.add(getJTextFieldQTD(), getJTextFieldQTDGBC());
			_jPanelCenter.add(getJButtonAdd(), getJButtonAddGBC());
			_jPanelCenter
					.add(getJButtonExcluiItem(), getJButtonExcluiItemGBC());
			_jPanelCenter.add(getJButtonCancelaCompra(),
					getJButtonCancelaCompraGBC());
			_jPanelCenter.add(getJButtonEfetuaCompra(),
					getJButtonEfetuaCompraGBC());
		}
		return _jPanelCenter;
	}

	private JTextField getJTextFieldItem() {
		if (_jTextFieldItem == null) {
			_jTextFieldItem = new JTextField(5);
		}
		return _jTextFieldItem;
	}

	private JTextField getJTextFieldQTD() {
		if (_jTextFieldQTD == null) {
			_jTextFieldQTD = new JTextField(5);
		}
		return _jTextFieldQTD;
	}

	private void registraVenda() {

		int resposta = JOptionPane.showConfirmDialog(null,
				"Deseja realmente registrar esta venda?", "Registro de venda",
				JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (resposta == 0) {

			ArrayList<Produto> produtos = new ArrayList<Produto>();

			int rowsCount = _tableModelItens.getRowCount();
			for (int i = 0; i < rowsCount; i++) {
				String id = _tableModelItens.getValueAt(i, 0).toString();
				int qtd = Integer.parseInt(_tableModelItens.getValueAt(i, 2)
						.toString());

				Produto produto = new Produto();
				produto.setId(id);
				produto.setQtdEstoque(qtd);

				produtos.add(produto);
			}

			Venda venda = new Venda();
			venda.setDate(new Date());
			venda.setValorVendido(getTotalVendido());
			venda.setProdutosVendidos(produtos);

			try {
				_vendasBI.adicionaVenda(venda);
				JOptionPane.showMessageDialog(this,
						"A venda foi efetuada com sucesso!",
						"Venda registrada!", JOptionPane.INFORMATION_MESSAGE);
			} catch (Exception e) {
				JOptionPane.showMessageDialog(this,
						"A venda não pode ser registrada!", "Erro!",
						JOptionPane.WARNING_MESSAGE);
			}

			clearTable();
		}
	}

	private void addItem() {
		String idProduto = getJTextFieldItem().getText();
		try {
			int qtd = Integer.parseInt(_jTextFieldQTD.getText());
			if (qtd < 1) {
				JOptionPane.showMessageDialog(this, "Qtd inválida!", "Erro!",
						JOptionPane.WARNING_MESSAGE);
			} else {
				Produto produto = _produtosBI.searchProductsById(idProduto);
				if (qtd > produto.getQtdEstoque()) {
					JOptionPane.showMessageDialog(this,
							"Quantidade insuficiente em estoque!", "Erro!",
							JOptionPane.WARNING_MESSAGE);
				} else {
					adicionaProdutoTable(produto, qtd);
				}
			}
		} catch (Exception e) {
			JOptionPane.showMessageDialog(this, "Id ou Qtd inválidos!",
					"Erro!", JOptionPane.WARNING_MESSAGE);
		}
	}

	/**
	 * Remove itens selecionados.
	 */

	private void removeItem() {
		int rowsSelectedRowCount = _tableItens.getSelectedRowCount();
		int rowsCount = _tableModelItens.getRowCount();

		for (int i = 0; i < rowsSelectedRowCount; i++) {
			for (int j = 0; j < rowsCount; j++) {
				if (_tableItens.isRowSelected(j)) {
					_tableModelItens.removeRow(j);
				}
			}
		}

		getJLabelTotal().setText(
				"Total: " + formatValue(getTotalVendido() + ""));
	}

	/**
	 * Limpa tabela de compra.
	 */
	private void clearTable() {
		int rowsCount = _tableModelItens.getRowCount();
		for (int i = 0; i < rowsCount; i++) {
			_tableModelItens.removeRow(0);
		}
		getJLabelTotal().setText(
				"Total: " + formatValue(getTotalVendido() + ""));
	}

	private JPanel getJPanelTable() {
		JPanel panelTable = new JPanel(new BorderLayout());

		_tableModelItens = new GeneralTableModel();
		_tableModelItens.setColumnIdentifiers(new String[] { "ID", "Nome",
				"QTD", "Preço Total" });
		_tableModelItens.setRowCount(0);

		_tableItens = new JTable(_tableModelItens);
		_tableItens.getColumn("ID").setMaxWidth(50);
		_tableItens.getColumn("Nome").setMinWidth(90);
		_tableItens.getColumn("QTD").setMaxWidth(70);
		_tableItens.getColumn("Preço Total").setMaxWidth(70);

		JScrollPane scrollPane = new JScrollPane(_tableItens);
		panelTable.add(scrollPane, BorderLayout.CENTER);

		Border table = BorderFactory.createRaisedBevelBorder();
		panelTable.setBorder(table);

		return panelTable;
	}

	private void adicionaProdutoTable(Produto produto, int qtd) {

		int qtdInTable = 0;
		int rowToRemove = 0;
		int rowsCount = _tableModelItens.getRowCount();
		boolean isIntoTable = false;
		try {

			for (int i = 0; i < rowsCount; i++) {
				String id = _tableModelItens.getValueAt(i, 0).toString();
				if (id.equals(produto.getId())) {
					qtdInTable = Integer.parseInt(_tableModelItens.getValueAt(
							i, 2).toString());
					rowToRemove = i;
					isIntoTable = true;
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		if ((qtd + qtdInTable) > produto.getQtdEstoque()) {
			JOptionPane.showMessageDialog(this,
					"Quantidade insuficiente em estoque!", "Erro!",
					JOptionPane.WARNING_MESSAGE);
		} else {
			if (isIntoTable) {
				_tableModelItens.removeRow(rowToRemove);
			}
			_tableModelItens.addRow(new String[] {
					produto.getId(),
					produto.getNome(),
					(qtd + qtdInTable) + "",
					formatValue((formatValue(produto.getPreco()
							* (qtd + qtdInTable) + ""))) });
		}
		getJLabelTotal().setText(
				"Total: " + formatValue(getTotalVendido() + ""));
	}

	/**
	 * Calcula total vendido.
	 * @return total vendido.
	 */
	private float getTotalVendido() {
		float total = 0;
		for (int i = 0; i < _tableModelItens.getRowCount(); i++) {
			String value = _tableModelItens.getValueAt(i, 3).toString();
			value = value.replace(',', '.');
			total += Float.parseFloat(value);
		}
		return total;
	}

	@Override
	public void printJTable() {
		try {
			MessageFormat headerFormat = new MessageFormat(
					"Relatório Compra - Pg. {0}");
			MessageFormat footerFormat = new MessageFormat("Total: "
					+ formatValue(getTotalVendido() + ""));
			_tableItens.print(JTable.PrintMode.FIT_WIDTH, headerFormat,
					footerFormat);
		} catch (PrinterException pe) {
			System.err.println("Error printing: " + pe.getMessage());
		}
	}

	/**
	 * M�todo chamado para formatar a String passada como parametro para o
	 * formato do real.
	 * 
	 * @param value
	 * @return valor formatado.
	 */

	private String formatValue(String value) {
		value = value.replace('.', ',');
		if (value.charAt(value.length() - 2) == ',') {
			value = value + "0";
		}
		if (value.indexOf(",") != value.length() - 3) {
			value = value.substring(0, value.indexOf(",") + 2);
		}
		return value;
	}
}
