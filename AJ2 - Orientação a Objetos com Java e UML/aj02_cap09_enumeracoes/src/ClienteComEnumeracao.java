public class ClienteComEnumeracao
{
	public enum TipoCliente{PESSOA_FISICA,PESSOA_JURIDICA};
	private TipoCliente tipo;
	private String nome;
	private String email;
	
	/**
	 * @param tipo
	 * @param nome
	 * @param email
	 */
	public ClienteComEnumeracao(TipoCliente tipo, String nome, String email)
	{
		super();
		this.tipo = tipo;
		this.nome = nome;
		this.email = email;
	}

	/**
	 * @return the tipo
	 */
	public TipoCliente getTipo()
	{
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(TipoCliente tipo)
	{
		this.tipo = tipo;
	}

	/**
	 * @return the nome
	 */
	public String getNome()
	{
		return nome;
	}

	/**
	 * @param nome the nome to set
	 */
	public void setNome(String nome)
	{
		this.nome = nome;
	}

	/**
	 * @return the email
	 */
	public String getEmail()
	{
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email)
	{
		this.email = email;
	}
}
