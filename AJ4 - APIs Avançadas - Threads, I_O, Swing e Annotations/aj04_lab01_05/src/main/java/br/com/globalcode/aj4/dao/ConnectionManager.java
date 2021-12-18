package br.com.globalcode.aj4.dao;

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

	// Informacoes para conexao com banco de dados. Verificar antes de conectar
	// com outro banco.
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
			System.out.println("Conectado!!!");
		}
		catch (SQLException e)
		{
			// TODO: handle exception
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
}
