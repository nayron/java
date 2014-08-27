package nayron.UFT.controleprodutos.components;

import javax.swing.table.DefaultTableModel;

/**
 * Classe que extende de DefaultTableModel e implementa um metodo
 * para ativar e desativar a edicao da table mas sempre permitindo 
 * a selecao das linhas da mesma.
 * @author Luis Antonio Tavares 
 */
public class GeneralTableModel extends DefaultTableModel {
	
	
	private static final long serialVersionUID = 1714767233849547322L;
	
	private boolean _editable = false;
	
	private boolean isEditable() {
		return _editable;
	}	

	public GeneralTableModel() {
		super();
	}
	
	public boolean isCellEditable(int rowIndex, int mColIndex) {
		return isEditable();
	}

}
