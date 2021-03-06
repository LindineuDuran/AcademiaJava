package br.com.globalcode.aj.dao;

import java.util.List;

import br.com.globalcode.beans.Produto;
import br.com.globalcode.util.GlobalcodeException;

public interface ProdutoDAO
{
	public void save(Produto p) throws GlobalcodeException;

	public List<Produto> getCatalogoProdutos() throws GlobalcodeException;

	public Produto getProdutoById(int id) throws GlobalcodeException;

	public void createTable() throws GlobalcodeException;
}