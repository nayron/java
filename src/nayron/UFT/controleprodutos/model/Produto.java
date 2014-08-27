/*
* File: Produto.java
* Creation date: 12/06/2008
* Author: Luis Antonio Tavares
* 
* Purpose: Declaration of class Produto
*
* Copyright 2008, INATEL Competence Center 

* All rights are reserved. Reproduction in whole or part is
* prohibited without the written consent of the copyright owner.
*/
package nayron.UFT.controleprodutos.model; 
  

public class Produto {
	private String _id;
	private float _preco;
	private String _nome;
	private String _modelo;
	private String _marca;
	private String _tipo;
	private String _descricao;
	private int _qtdEstoque;
	
	public int getQtdEstoque() {
		return _qtdEstoque;
	}

	public void setQtdEstoque(int qtdEstoque) {
		_qtdEstoque = qtdEstoque;
	}

	public String getId() {
		return _id;
	}
	
	public void setId(String id) {
		_id = id;
	}
	
	public float getPreco() {
		return _preco;
	}
	
	public void setPreco(float preco) {
		_preco = preco;
	}
	
	public String getNome() {
		return _nome;
	}
	
	public void setNome(String nome) {
		_nome = nome;
	}
	
	public String getModelo() {
		return _modelo;
	}
	
	public void setModelo(String modelo) {
		_modelo = modelo;
	}
	
	public String getMarca() {
		return _marca;
	}
	
	public void setMarca(String marca) {
		_marca = marca;
	}
	
	public String getTipo() {
		return _tipo;
	}
	
	public void setTipo(String cor) {
		_tipo = cor;
	}
	
	public String getDescricao() {
		return _descricao;
	}
	
	public void setDescricao(String descricao) {
		_descricao = descricao;
	}
	
	@Override
	public String toString() {
		return _nome;
	}
	
}
 
