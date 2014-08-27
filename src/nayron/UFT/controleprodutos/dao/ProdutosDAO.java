package nayron.UFT.controleprodutos.dao;

import java.math.BigDecimal;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import nayron.UFT.controleprodutos.model.Produto;

public class ProdutosDAO {
	private DataConnection _dataConection = new DataConnection();

	public void insert(Produto produto) throws SQLException {
		PreparedStatement psm = null;
		psm = _dataConection
				.getConnection()
				.prepareStatement(
						"insert into PRODUTO (ProdutoId, Nome, Marca, Modelo, Tipo,"
								+ " Preco, Descricao, QtdEstoque) values (?,?,?,?,?,?,?,?)");
		psm.setString(1, produto.getId() + "");
		psm.setString(2, produto.getNome());
		psm.setString(3, produto.getMarca());
		psm.setString(4, produto.getModelo());
		psm.setString(5, produto.getTipo());
		psm.setBigDecimal(6, BigDecimal.valueOf(produto.getPreco()));
		psm.setString(7, produto.getDescricao());
		psm.setInt(8, produto.getQtdEstoque());
		psm.execute();
		psm.close();
		closeConnection();
	}
	
	public void update(Produto produto) throws SQLException {
		PreparedStatement psm = null;
		psm = _dataConection
				.getConnection()
				.prepareStatement(
						"UPDATE PRODUTO SET Nome =? , Marca =? , Modelo =? , Tipo  =?,"
								+ " Preco = ? , Descricao = ?, QtdEstoque = ? WHERE ProdutoId = ?");
		psm.setString(1, produto.getNome());
		psm.setString(2, produto.getMarca());
		psm.setString(3, produto.getModelo());
		psm.setString(4, produto.getTipo());
		psm.setBigDecimal(5, BigDecimal.valueOf(produto.getPreco()));
		psm.setString(6, produto.getDescricao());
		psm.setInt(7, produto.getQtdEstoque());
		psm.setString(8, produto.getId() + "");
		psm.execute();
		psm.close();
		closeConnection();
	}

	public ArrayList<Produto> list() throws SQLException {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		PreparedStatement psm = _dataConection.getConnection()
				.prepareStatement("SELECT * FROM PRODUTO ORDER BY ProdutoId");
		ResultSet rs = psm.executeQuery();
		while (rs.next()) {
			Produto produto = new Produto();
			produto.setId(rs.getString(1));
			produto.setNome(rs.getString(2));
			produto.setMarca(rs.getString(3));
			produto.setModelo(rs.getString(4));
			produto.setTipo(rs.getString(5));
			produto.setPreco(rs.getFloat(6));
			produto.setDescricao(rs.getString(7));
			produto.setQtdEstoque(rs.getInt(8));
			produtos.add(produto);
		}
		rs.close();
		psm.close();
		closeConnection();
		return produtos;
	}

	public void remove(String id) throws SQLException {
		PreparedStatement psm = _dataConection.getConnection()
				.prepareStatement("DELETE FROM PRODUTO WHERE ProdutoId = ?");
		psm.setString(1, id);
		psm.executeUpdate();
		psm.close();
		closeConnection();
	}

	public String getMaxId() throws SQLException {
		String sql = "SELECT MAX(ProdutoId) FROM PRODUTO";
		Statement stm = _dataConection.getConnection().createStatement();
		ResultSet rs = stm.executeQuery(sql);
		rs.next();
		String maxID = rs.getString(1);
		if (maxID == null){
			maxID = "0";
		}	
		rs.close();
		stm.close();
		closeConnection();
		return maxID;		
	}

	public Produto searchById(String id) throws SQLException {
		PreparedStatement psm = _dataConection.getConnection()
				.prepareStatement("SELECT * FROM PRODUTO WHERE ProdutoId = ?");
		psm.setString(1, id);
		ResultSet rs = psm.executeQuery();
		Produto produto = null;
		while (rs.next()) {
			produto = new Produto();
			produto.setId(rs.getString(1));
			produto.setNome(rs.getString(2));
			produto.setMarca(rs.getString(3));
			produto.setModelo(rs.getString(4));
			produto.setTipo(rs.getString(5));
			produto.setPreco(rs.getFloat(6));
			produto.setDescricao(rs.getString(7));
			produto.setQtdEstoque(rs.getInt(8));
			break;
		}
		rs.close();
		psm.close();
		closeConnection();
		return produto;
	}

	public ArrayList<Produto> search(int typeSearch, String str) throws SQLException {
		ArrayList<Produto> produtos = new ArrayList<Produto>();
		PreparedStatement psm = _dataConection.getConnection()
				.prepareStatement(getSearchQuery(typeSearch));
		psm.setString(1, str);
		ResultSet rs = psm.executeQuery();
		while (rs.next()) {
			Produto produto = new Produto();
			produto.setId(rs.getString(1));
			produto.setNome(rs.getString(2));
			produto.setMarca(rs.getString(3));
			produto.setModelo(rs.getString(4));
			produto.setTipo(rs.getString(5));
			produto.setPreco(rs.getFloat(6));
			produto.setDescricao(rs.getString(7));
			produto.setQtdEstoque(rs.getInt(8));
			produtos.add(produto);
		}
		rs.close();
		psm.close();
		closeConnection();
		return produtos;
	}

	public boolean stockUpdate(String id, int qtd) throws SQLException {
		if (searchById(id) == null) { // caso nao exita este id
			return false;
		}
		PreparedStatement psm = _dataConection
				.getConnection()
				.prepareStatement(
						"UPDATE PRODUTO SET QtdEstoque = ? WHERE ProdutoId = ?");
		psm.setInt(1, qtd);
		psm.setString(2, id);
		psm.executeUpdate();
		psm.close();
		closeConnection();
		return true;
	}

	private String getSearchQuery(int typeSearch) {
		String sql = null;
		switch (typeSearch) {
		case 1:
			sql = "SELECT * FROM PRODUTO WHERE Nome = ?";
			break;
		case 2:
			sql = "SELECT * FROM PRODUTO WHERE Tipo = ?";
			break;
		case 3:
			sql = "SELECT * FROM PRODUTO WHERE Marca = ?";
			break;
		case 4:
			sql = "SELECT * FROM PRODUTO WHERE Modelo = ?";
			break;
		}
		return sql;
	}
	
	private void closeConnection() throws SQLException {
		_dataConection.getConnection().close();		
	}
}
