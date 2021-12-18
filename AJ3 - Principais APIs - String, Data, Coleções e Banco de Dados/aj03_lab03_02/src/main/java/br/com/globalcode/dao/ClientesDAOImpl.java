/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 */
package br.com.globalcode.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import br.com.globalcode.beans.Cliente;
import br.com.globalcode.exception.GlobalcodeException;
import br.com.globalcode.util.ConnectionManager;

public class ClientesDAOImpl implements IClientesDAO
{
	private final static String SALVAR_CLIENTE = "INSERT INTO clientes (nome,cpf,telefone) VALUES (?,?,?)";
	private final static String CREATE_TABLE = "CREATE TABLE  IF NOT EXISTS  clientes (id int(3) NOT NULL AUTO_INCREMENT   PRIMARY KEY, nome VARCHAR(20) NOT NULL, cpf varchar(20) NOT NULL, telefone varchar(20) NOT NULL)";
	private final static String DELETE_CLIENTE = "DELETE FROM clientes WHERE cpf = '";
	private final static String GET_ALL_CLIENTES = "SELECT * FROM clientes";
	private final static String GET_CLIENTE_BY_CPF = "SELECT * FROM clientes WHERE cpf = ?";

	public void createTable() throws GlobalcodeException
	{
		Connection conn = null;
		Statement stmt = null;
		try
		{
			conn = ConnectionManager.getConnection();
			stmt = conn.createStatement();
			stmt.executeUpdate(CREATE_TABLE);
		}
		catch (SQLException e)
		{
			throw new GlobalcodeException("Erro ao criar a tabela de clientes : " + CREATE_TABLE, e);
		}
		finally
		{
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#excluir(br.com.globalcode.beans.
	 * Cliente)
	 */
	@Override
	public void excluir(String cpf) throws GlobalcodeException
	{
		/*
		 * Faca a exclusao de um cliente do banco de dados usando o seu cpf A instrucao
		 * SQL esta na constante DELETE_CLIENTE no inicio desta classe.
		 */

		// Criar uma variavel para a Connection
		Connection conn = null;

		// Criar uma variavel para o Statement
		Statement stmt = null;

		try
		{
			// Abrir a conexao
			conn = ConnectionManager.getConnection();

			// Criar o Statement
			stmt = conn.createStatement();

			// Executar a instrucao de delete recuperando o numero de linhas alteradas
			String DELETE_CLIENTE_CPF = DELETE_CLIENTE + cpf + "'";

			// (executeUpdate)
			int linAlt = stmt.executeUpdate(DELETE_CLIENTE_CPF);

			// Imprimir o numero de linhas alteradas
			System.out.println("Linha alterada: " + linAlt);
		}
		catch (Exception e)
		{
			// TODO: handle exception
		}
		finally
		{
			// Fechar a Connection e o Statement
			ConnectionManager.closeAll(conn, stmt);
		}
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#salvar(br.com.globalcode.beans.
	 * Cliente)
	 */
	@Override
	public void salvar(Cliente cliente) throws GlobalcodeException
	{
	}

	/*
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getAllClientes()
	 */
	@Override
	public List getAllClientes() throws GlobalcodeException
	{
		// Criar uma variavel para a Connection
		Connection conn = null;

		// Criar uma variavel para o Statement
		Statement stmt = null;

		ResultSet rs = null;

		List clientes = new ArrayList();

		try
		{
			// Abrir a conexao
			conn = ConnectionManager.getConnection();

			// Criar o Statement
			stmt = conn.createStatement();

			// (executeConsulta)
			rs = stmt.executeQuery(GET_ALL_CLIENTES);
			while (rs.next())
			{
				String nome = rs.getNString("nome");
				String telefone = rs.getNString("telefone");
				String cpf = rs.getNString("cpf");
				int id = rs.getInt("id");

				clientes.add(new Cliente(nome, telefone, cpf, id));
			}
		}
		catch (SQLException e)
		{
			throw new GlobalcodeException("Erro na execução do select: " + GET_ALL_CLIENTES, e);
		}
		finally
		{
			ConnectionManager.closeAll(conn, stmt);
		}

		return clientes;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see br.com.globalcode.aj3.dao.ClientesDAO#getClienteByID(int)
	 */
	@Override
	public Cliente getClienteByCPF(String cpf) throws GlobalcodeException
	{
		return null;
	}
}
