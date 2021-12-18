package br.com.lduran.testes;

import java.sql.*;

public class TesteConexaoJDBC
{
	private static final String NOME_BANCO = "aj";
	private static final String STR_CON = "jdbc:mysql://localhost/" + NOME_BANCO + "?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "linshu";

	public static void main(String[] args)
	{
		try (Connection conn = DriverManager.getConnection(STR_CON, USER, PASSWORD)) // Try-with-resources
		{
			System.out.println("Conectado!!!");
		}
		catch (SQLException e)
		{
			System.out.println("Erro ao obter a conexão!!!");
			e.printStackTrace();
		}
	}
}
