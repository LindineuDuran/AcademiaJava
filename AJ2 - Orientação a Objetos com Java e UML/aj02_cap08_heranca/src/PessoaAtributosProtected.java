public class PessoaAtributosProtected
{
	protected Endereco endereco;
	protected String nome;
	protected String rg;
	
	/**
	 * @return the endereco
	 */
	public Endereco getEndereco()
	{
		return endereco;
	}
	
	/**
	 * @param endereco the endereco to set
	 */
	public void setEndereco(Endereco endereco)
	{
		this.endereco = endereco;
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
	 * @return the rg
	 */
	public String getRg()
	{
		return rg;
	}
	
	/**
	 * @param rg the rg to set
	 */
	public void setRg(String rg)
	{
		this.rg = rg;
	}
	
	public void imprime()
	{
		System.out.println("Nome: " + this.getNome());
		System.out.println("RG: " + this.getRg());
		System.out.print("Endereço: " + this.getEndereco().getRua());
		System.out.println(", " + this.getEndereco().getNumero());
	}
}
