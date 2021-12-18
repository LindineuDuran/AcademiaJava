package br.com.globalcode.util;

/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 */
import java.sql.*;

import br.com.globalcode.exception.GlobalcodeException;

public class ConnectionManager
{

	/*
	 * Os valores das constantes abaixo devem estar de acordo com o banco de dados
	 * utilizado.
	 */
	private static final String NOME_BANCO = "aj";
	private static final String STR_CON = "jdbc:mysql://localhost/" + NOME_BANCO + "?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "linshu";

	public static Connection getConnection() throws GlobalcodeException
	{
		Connection conn = null;
		try
		{
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
			System.out.println("[ConnectionManager]: Obtendo conexao");
		}
		catch (SQLException e)
		{
			throw new GlobalcodeException("Erro ao obter a conexao", e);
		}
		return conn;
	}

	public static void closeAll(Connection conn)
	{
		try
		{
			if (conn != null)
			{
				conn.close();
			}
		}
		catch (Exception e)
		{
			System.out.println("---> Nao foi possivel fechar a conexao com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}

	public static void closeAll(Connection conn, Statement stmt)
	{
		try
		{
			if (stmt != null)
			{
				stmt.close();
				closeAll(conn);
			}
		}
		catch (Exception e)
		{
			System.out.println("---> Não foi possível fechar a conexão com o banco");
			System.out.println("---> Detalhamento do erro: ");
			e.printStackTrace();
		}
	}
}
