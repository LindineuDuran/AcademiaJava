package br.com.lduran.database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.lduran.beans.Produto;
import br.com.lduran.util.GlobalcodeException;

public class ProdutoDbPrepStat
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
			throw new GlobalcodeException("Erro na criação da tabela de produtos!", e);
		}
		finally
		{
			ConnectionManager.close(conn, stmt);
		}
	}

	public void save(Produto produto) throws GlobalcodeException
	{
		PreparedStatement stmt = null;
		String sql = null;

		Connection conn = ConnectionManager.getConexao();
		if (produto.getId() == 0)
		{
			sql = "INSERT INTO produtos (nome, preco) VALUES(?,?)";

			try
			{
				System.out.println("SQL = " + sql);

				stmt = conn.prepareStatement(sql);
				stmt.setString(1, produto.getNome());
				stmt.setInt(2, produto.getPreco());

				// execute the preparedstatement
				stmt.execute();
			}
			catch (SQLException e)
			{
				throw new GlobalcodeException("Erro na atualização da tabela de produtos!", e);
			}
			finally
			{
				ConnectionManager.close(conn, stmt);
			}
		}
		else
		{
			System.out.println("SQL = " + sql);

			sql = "UPDATE produtos SET nome = ?, ";
			sql += "preco = ?";
			sql += " WHERE id = ?";

			try
			{
				System.out.println("SQL = " + sql);

				stmt = conn.prepareStatement(sql);
				stmt.setString(1, produto.getNome());
				stmt.setInt(2, produto.getPreco());
				stmt.setInt(3, produto.getId());

				// execute the preparedstatement
				stmt.execute();
			}
			catch (SQLException e)
			{
				throw new GlobalcodeException("Erro na atualização da tabela de produtos!", e);
			}
			finally
			{
				ConnectionManager.close(conn, stmt);
			}
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
			throw new GlobalcodeException("Erro na execução do select: " + sql, e);
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
			throw new GlobalcodeException("Erro na execução do select: " + sql, e);
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
		String sql = "DELETE FROM produtos WHERE id = ?";
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
