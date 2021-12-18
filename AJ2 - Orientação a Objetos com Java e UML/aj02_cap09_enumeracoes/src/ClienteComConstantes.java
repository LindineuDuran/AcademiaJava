public class ClienteComConstantes
{
	public final static int PESSOA_JURIDICA = 1;
	public final static int PESSOA_FISICA = 2;
	private String nome;
	private String email;
	private int tipo;
	
	/**
	 * @param nome
	 * @param email
	 * @param tipo
	 */
	public ClienteComConstantes(String nome, String email, int tipo)
	{
		super();
		this.nome = nome;
		this.email = email;
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

	/**
	 * @return the tipo
	 */
	public int getTipo()
	{
		return tipo;
	}

	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(int tipo)
	{
		this.tipo = tipo;
	}
}
