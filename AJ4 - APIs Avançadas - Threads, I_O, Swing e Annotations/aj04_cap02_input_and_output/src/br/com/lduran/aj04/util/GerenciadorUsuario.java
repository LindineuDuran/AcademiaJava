package br.com.lduran.aj04.util;

import java.io.*;

import br.com.lduran.aj04.model.Usuario;

public class GerenciadorUsuario
{
	public static Usuario getUsuario(String username) throws GlobalcodeException
	{
		try (FileInputStream leitorArquivos = new FileInputStream(username + ".user"); ObjectInputStream leitorObjetos = new ObjectInputStream(leitorArquivos))
		{
			Usuario user = (Usuario) leitorObjetos.readObject();
			return user;
		}
		catch (IOException e)
		{
			String msg = "Erro ao tentar recuperar as prefer�ncias do usu�rio: ";
			GlobalcodeException ge = new GlobalcodeException(msg + username, e);
			throw ge;
		}
		catch (ClassNotFoundException e)
		{
			String msg = "Classe br.com.lduran.aj04.model.Usuario n�o encontrada";
			GlobalcodeException ge = new GlobalcodeException(msg, e);
			throw ge;
		}
	}

	public static void addUsuario(Usuario user) throws GlobalcodeException
	{
		String fileName = user.getUsername() + ".user";

		try (FileOutputStream escritorArquivos = new FileOutputStream(fileName); ObjectOutputStream escritorObjetos = new ObjectOutputStream(escritorArquivos))
		{
			escritorObjetos.writeObject(user);
			escritorObjetos.flush();
		}
		catch (IOException e)
		{
			String msg = "Erro ao tentar serializar o usu�rio: " + user.getUsername();
			GlobalcodeException ge = new GlobalcodeException(msg, e);
			throw ge;
		}
	}
}
