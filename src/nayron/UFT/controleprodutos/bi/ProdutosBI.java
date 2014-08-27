package nayron.UFT.controleprodutos.bi; 

import java.sql.SQLException;
import java.util.ArrayList;
import nayron.UFT.controleprodutos.model.Produto; 
import nayron.UFT.controleprodutos.dao.ProdutosDAO;

public class ProdutosBI {
	
	private final ProdutosDAO _produtosDAO;
	
	public ProdutosBI(){
		_produtosDAO = new ProdutosDAO();
	}
	
	public void addProduct(Produto product) throws Exception{
		if (searchProductsById(product.getId()) == null){
			_produtosDAO.insert(product);
		}
		else{
			_produtosDAO.update(product);
		}
	}
	
	public void removeProduct(ArrayList<String> itensToRemove) throws Exception{
		for (String id:itensToRemove){
			_produtosDAO.remove(id);
		}		
	}
	
	public ArrayList<Produto> listProducts() throws SQLException{
		return _produtosDAO.list();
	}
	
	public Produto searchProductsById(String productId) throws SQLException{
		return _produtosDAO.searchById(productId);
	}
	
	public ArrayList<Produto> searchProductByName(String productName) throws SQLException{
		return _produtosDAO.search(1,productName);
	}
	
	public ArrayList<Produto> searchProductByType(String productType) throws SQLException{
		return _produtosDAO.search(2,productType);
	}
	
	public ArrayList<Produto> searchProductByMark(String productMark) throws SQLException{
		return _produtosDAO.search(3,productMark);
	}
	
	public ArrayList<Produto> searchProductByModel(String productModel) throws SQLException{
		return _produtosDAO.search(4,productModel);
	}	
	
	public String getNextId() throws SQLException{
		if (_produtosDAO.getMaxId() == null){
			return "0";
		}
		return _produtosDAO.getMaxId();
	}
	
	public boolean updateStock(String id, int qtd) throws SQLException{
		return _produtosDAO.stockUpdate(id, qtd); 
	}
	
}