package br.com.lduran.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.lduran.beans.Produto;
import br.com.lduran.util.GlobalcodeException;

public class ProdutoDbRecupChaveGerada
{
	public void createTable() throws GlobalcodeException
	{
		Connection conn = ConnectionManager.getConexao();
		Statement stmt = null;

		String sql = "CREATE TABLE IF NOT EXISTS produtos";
		sql += "(id int(3) NOT NULL AUTO_INCREMENT PRIMARY KEY,";
		sql += "nome varchar(20) NOT NULL,";
		sql += "preco int(10) NOT NULL)";

		try
		{
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);
			System.out.println("Tabela de produtos criada com sucesso!");
		}
		catch (SQLException e)
		{
			throw new GlobalcodeException("Erro na cria??o da tabela de produtos!", e);
		}
		finally
		{
			ConnectionManager.close(conn, stmt);
		}
	}

	public Produto save(Produto produto) throws GlobalcodeException
	{
		Statement stmt = null;
		String sql = null;

		if (produto.getId() == 0)
		{
			sql = "INSERT INTO produtos (nome, preco) ";
			sql += "VALUES('" + produto.getNome() + "', ";
			sql += produto.getPreco() + ")";
		}
		else
		{
			sql = "UPDATE produtos SET nome = '" + produto.getNome() + "', ";
			sql += "preco = " + produto.getPreco();
			sql += " WHERE id = " + produto.getId();
		}

		Connection conn = ConnectionManager.getConexao();
		try
		{
			stmt = conn.createStatement();
			stmt.executeUpdate(sql);

			if (produto.getId() == 0)
			{
				ResultSet generatedKeys = stmt.getGeneratedKeys();

				if (generatedKeys.next())
				{
					int id = generatedKeys.getInt(1);
					produto.setId(id);
				}
			}

			System.out.println("SQL = " + sql);
			return produto;
		}
		catch (SQLException e)
		{
			throw new GlobalcodeException("Erro na atualiza??o da tabela de produtos!", e);
		}
		finally
		{
			ConnectionManager.close(conn, stmt);
		}
	}

	public Produto getProduto(int id) throws GlobalcodeException
	{
		String sql = "SELECT * FROM produtos WHERE id = " + id;
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		Produto produto = null;

		try
		{
			conn = ConnectionManager.getConexao();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);
			if (rs.next())
			{
				String nome = rs.getNString("nome");
				int preco = rs.getInt("preco");

				produto = new Produto(id, nome, preco);
			}
		}
		catch (SQLException e)
		{
			throw new GlobalcodeException("Erro na execu??o do select: " + sql, e);
		}
		finally
		{
			ConnectionManager.close(conn, stmt, rs);
		}

		return produto;
	}

	public List getAllProdutos() throws GlobalcodeException
	{
		String sql = "SELECT * FROM produtos";
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		List produtos = new ArrayList();

		try
		{
			conn = ConnectionManager.getConexao();
			stmt = conn.createStatement();

			rs = stmt.executeQuery(sql);
			while (rs.next())
			{
				String nome = rs.getNString("nome");
				int preco = rs.getInt("preco");
				int id = rs.getInt("id");

				produtos.add(new Produto(id, nome, preco));
			}
		}
		catch (SQLException e)
		{
			throw new GlobalcodeException("Erro na execu??o do select: " + sql, e);
		}
		finally
		{
			ConnectionManager.close(conn, stmt, rs);
		}

		return produtos;
	}

	public int delete(int id) throws GlobalcodeException
	{
		Connection conn = null;
		PreparedStatement stmt = null;
		String sql = "DELETE FROM produtos WHERE id = ? ";
		int qtdRemovido = 0;

		try
		{
			conn = ConnectionManager.getConexao();
			stmt = conn.prepareStatement(sql);
			stmt.setInt(1, id);
			qtdRemovido = stmt.executeUpdate();
		}
		catch (SQLException e)
		{
			String errorMsg = "Erro ao tentar remover produto de id " + id;
			throw new GlobalcodeException(errorMsg, e);
		}
		finally
		{
			ConnectionManager.close(conn, stmt);
		}

		return qtdRemovido;
	}
}
