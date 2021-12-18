package br.com.globalcode.aj.dao;

/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 */
import java.sql.*;

import br.com.globalcode.util.GlobalcodeException;

public class ConnectionManager
{

	/*
	 * 1) Coloque o valor adequado nas constantes DATABASE, USER e
	 * PASSWORD 2) Teste esta classe para garantir que esteja funcionando
	 */
	private static final String STR_DRIVER = "com.mysql.cj.jdbc.Driver";
	private static final String NOME_BANCO = "aj";
	private static final String STR_CON = "jdbc:mysql://localhost/" + NOME_BANCO + "?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "linshu";

	public static Connection getConexao() throws GlobalcodeException
	{
		Connection conn = null;
		try
		{
			Class.forName(STR_DRIVER);
			conn = DriverManager.getConnection(STR_CON, USER, PASSWORD);
		}
		catch (ClassNotFoundException e)
		{
			String errorMsg = "Driver nao encontrado";
			throw new GlobalcodeException(errorMsg, e);
		}
		catch (SQLException e)
		{
			String errorMsg = "Erro ao obter a conexao";
			throw new GlobalcodeException(errorMsg, e);
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
			e.printStackTrace();
		}
	}

	public static void closeAll(Connection conn, Statement stmt, ResultSet rs)
	{
		try
		{
			if (conn != null || stmt != null)
			{
				closeAll(conn, stmt);
			}
			if (rs != null)
			{
				rs.close();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}

	public static void closeAll(Connection conn, Statement stmt)
	{
		try
		{
			if (conn != null)
			{
				closeAll(conn);
			}
			if (stmt != null)
			{
				stmt.close();
			}
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
	}
}
