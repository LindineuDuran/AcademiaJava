package br.com.lduran.database;

import java.sql.SQLException;

import javax.sql.RowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

import br.com.lduran.beans.Produto;

public class ExemploRowSet
{
	private static final String NOME_BANCO = "aj";
	private static final String STR_CON = "jdbc:mysql://localhost/" + NOME_BANCO + "?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "linshu";

	public static void main(String[] args)
	{
		RowSetFactory factory = null;

		try
		{
			factory = RowSetProvider.newFactory();

			try (RowSet rowSet = factory.createJdbcRowSet())
			{
				rowSet.setUrl(STR_CON);
				rowSet.setUsername(USER);
				rowSet.setPassword(PASSWORD);
				rowSet.setCommand("select * from produtos");
				rowSet.execute();

				while (rowSet.next())
				{
					int id = rowSet.getInt("id");
					String nome = rowSet.getString("nome");
					int preco = rowSet.getInt("preco");
					Produto prod = new Produto(id, nome, preco);

					System.out.println(prod);
				}
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}
}
