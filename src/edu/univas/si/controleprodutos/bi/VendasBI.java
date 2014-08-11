package edu.univas.si.controleprodutos.bi;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import edu.univas.si.controleprodutos.dao.VendasDAO;
import edu.univas.si.controleprodutos.model.Produto;
import edu.univas.si.controleprodutos.model.Venda;

public class VendasBI {

	private VendasDAO vendasDAO;
	private ProdutosBI produtosBI;

	public VendasBI() {
		vendasDAO = new VendasDAO();
		produtosBI = new ProdutosBI();
	}

	public void adicionaVenda(Venda venda) throws Exception {
		if (vendasDAO.searchByDate(venda.getDate()) == false) {
			vendasDAO.insert(venda);
		} else {
			vendasDAO.salesUpdate(venda);
		}
		atualizaEstoque(venda);
	}

	public ArrayList<Venda> buscaVendas(String ano) throws Exception {
		Calendar calendaIni = Calendar.getInstance();
		Calendar calendaFin = Calendar.getInstance();
		calendaIni.set(Integer.parseInt(ano), 0, 1);
		calendaFin.set(Integer.parseInt(ano), 11, 31);
		return vendasDAO.searchByPeriod(calendaFin.getTime(),calendaIni.getTime());
	}

	public ArrayList<Venda> buscaVendas(String ano, String mes)
			throws Exception {
		Calendar calendaIni = Calendar.getInstance();
		Calendar calendaFin = Calendar.getInstance();
		calendaIni.set(Integer.parseInt(ano), Integer.parseInt(mes)-1, 1);
		calendaFin.set(Integer.parseInt(ano), Integer.parseInt(mes)-1, 31);
		return vendasDAO.searchByPeriod(calendaFin.getTime(),calendaIni.getTime());
	}

	public ArrayList<Venda> buscaVendas(Date dataIni, Date dataFim)
			throws Exception {
		return vendasDAO.searchByPeriod(dataIni, dataFim);
	}
	
	public ArrayList<Venda> listarVendas() throws Exception {		
		return vendasDAO.list();
	}

	private void atualizaEstoque(Venda venda) throws Exception {
		for (Produto produto : venda.getProdutosVendidos()) {
			Produto produtoPesq = produtosBI.searchProductsById(produto.getId());
			int qtdAnterior = produtoPesq.getQtdEstoque();
			int qtdVendida = produto.getQtdEstoque();
			produtosBI.updateStock(produto.getId(), qtdAnterior
					- qtdVendida);
		}
	}	
}
