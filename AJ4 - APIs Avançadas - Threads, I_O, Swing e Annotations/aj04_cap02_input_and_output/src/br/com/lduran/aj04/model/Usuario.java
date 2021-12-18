package br.com.lduran.aj04.model;

import java.io.Serializable;

public class Usuario implements Serializable
{
	private String username;
	transient private String password; // modificador transient informa ao mecanismo de serialização que atributo deve ser ignorado
	private String idioma;

	/**
	 * @param username
	 * @param password
	 * @param idioma
	 */
	public Usuario(String username, String password, String idioma)
	{
		this.username = username;
		this.password = password;
		this.idioma = idioma;
	}

	public boolean passwordOk(String password)
	{
		return this.password.equals(password);
	}

	/**
	 * @return the username
	 */
	public String getUsername()
	{
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username)
	{
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}

	/**
	 * @return the idioma
	 */
	public String getIdioma()
	{
		return idioma;
	}

	/**
	 * @param idioma the idioma to set
	 */
	public void setIdioma(String idioma)
	{
		this.idioma = idioma;
	}

	/*
	 * (non-Javadoc)
	 *
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString()
	{
		return "Usuario [username=" + username + ", password=" + password + ", idioma=" + idioma + "]";
	}
}
