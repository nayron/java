package edu.univas.si.controleprodutos.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;

import edu.univas.si.controleprodutos.model.Venda;

public class VendasDAO {
	private DataConnection _dataConection = new DataConnection();

	public boolean searchByDate(Date date) throws SQLException {
		boolean isDateThere = false;
		PreparedStatement psm = _dataConection.getConnection()
				.prepareStatement("SELECT * FROM VENDA WHERE Data = ?");
		psm.setDate(1, new java.sql.Date(date.getTime()));
		ResultSet rs = psm.executeQuery();
		while (rs.next()) {
			isDateThere = true;
		}
		rs.close();
		psm.close();
		closeConnection();
		return isDateThere;
	}

	public ArrayList<Venda> searchByPeriod(Date dateIni, Date dateFin)
			throws SQLException {
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		PreparedStatement psm = _dataConection.getConnection()
				.prepareStatement(
						"SELECT * FROM VENDA WHERE Data BETWEEN ? AND ?");
		psm.setDate(1, new java.sql.Date(dateFin.getTime()));
		psm.setDate(2, new java.sql.Date(dateIni.getTime()));
		ResultSet rs = psm.executeQuery();
		while (rs.next()) {
			Venda venda = new Venda();
			venda.setDate(rs.getDate(1));
			venda.setNumVendas(rs.getInt(2));
			venda.setValorVendido(rs.getFloat(3));
			vendas.add(venda);
		}
		rs.close();
		psm.close();
		closeConnection();
		return vendas;
	}

	public void insert(Venda venda) throws Exception {
		PreparedStatement psm = null;
		psm = _dataConection.getConnection().prepareStatement(
				"insert into VENDA (Data, NumVendas, ValorVendido) "
						+ "values (?,?,?)");
		psm.setDate(1, new java.sql.Date(venda.getDate().getTime()));
		psm.setInt(2, 1);
		psm.setFloat(3, venda.getValorVendido());
		psm.executeUpdate();
		psm.close();
		closeConnection();
	}

	public void salesUpdate(Venda venda) throws Exception {
		PreparedStatement psm = null;
		psm = _dataConection.getConnection().prepareStatement(
				"UPDATE VENDA SET NumVendas = Numvendas+1, "
						+ "ValorVendido = ValorVendido+? WHERE Data = ?");
		psm.setFloat(1, venda.getValorVendido());
		psm.setDate(2, new java.sql.Date(venda.getDate().getTime()));
		psm.executeUpdate();
		psm.close();
		closeConnection();
	}

	public ArrayList<Venda> list() throws SQLException {
		ArrayList<Venda> vendas = new ArrayList<Venda>();
		String sql = "SELECT * FROM VENDA";
		Statement stm = _dataConection.getConnection()
				.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			Venda venda = new Venda();
			venda.setDate(rs.getDate(1));
			venda.setNumVendas(rs.getInt(2));
			venda.setValorVendido(rs.getFloat(3));
			vendas.add(venda);
		}
		rs.close();
		stm.close();
		closeConnection();
		return vendas;
	}
	
	private void closeConnection() throws SQLException {
		_dataConection.getConnection().close();		
	}
}
