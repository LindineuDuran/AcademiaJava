package br.com.lduran.database;

import java.sql.*;

import br.com.lduran.util.GlobalcodeException;

public class ConnectionManager
{
	private static final String NOME_BANCO = "aj";
	private static final String STR_CON = "jdbc:mysql://localhost/" + NOME_BANCO + "?serverTimezone=UTC";
	private static final String USER = "root";
	private static final String PASSWORD = "linshu";

	public static Connection getConexao() throws GlobalcodeException
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

	public static void close(Connection conn)
	{
		try
		{
			if (conn != null)
			{
				conn.close();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}
	}

	public static void close(Connection conn, Statement stmt)
	{
		try
		{
			if (stmt != null)
			{
				stmt.close();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		ConnectionManager.close(conn);
	}

	public static void close(Connection conn, Statement stmt, ResultSet rs)
	{
		try
		{
			if (rs != null)
			{
				rs.close();
			}
		}
		catch (SQLException e)
		{
			e.printStackTrace();
		}

		ConnectionManager.close(conn, stmt);
	}
}
