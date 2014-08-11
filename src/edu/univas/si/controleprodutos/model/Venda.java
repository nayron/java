package edu.univas.si.controleprodutos.model;

import java.util.ArrayList;
import java.util.Date;

public class Venda {

	private Date _date;
	private int _numVendas;
	private float _valorVendido;
	private ArrayList<Produto> _produtosVendidos;
	
	public Venda() {
		_produtosVendidos = new ArrayList<Produto>();
	}
	
	public Date getDate() {
		return _date;
	}
	
	public void setDate(Date date) {
		_date = date;
	}
	
	public float getValorVendido() {
		return _valorVendido;
	}
	
	public void setValorVendido(float valorVendido) {
		_valorVendido = valorVendido;
	}
	
	public ArrayList<Produto> getProdutosVendidos() {
		return _produtosVendidos;
	}
	
	public void setProdutosVendidos(ArrayList<Produto> produtosVendidos) {
		_produtosVendidos = produtosVendidos;
	}

	public void setNumVendas(int numVendas) {
		_numVendas = numVendas;		
	}
	
	public int getNumVendas(){
		return _numVendas;
	}
		
}
