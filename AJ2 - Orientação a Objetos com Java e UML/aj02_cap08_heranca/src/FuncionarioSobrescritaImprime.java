public class FuncionarioSobrescritaImprime extends PessoaComConstrutor
{
	private long carteiraProfissional;
	private double salario;
	private String dataAdmissao;
	
	/**
	 * @param carteiraProfissional
	 * @param salario
	 * @param dataAdmissao
	 */
	public FuncionarioSobrescritaImprime(long carteiraProfissional, double salario, String dataAdmissao, Endereco endereco, String nome, String rg)
	{
		super(endereco, nome, rg); //A chamada ao Construtor da superclasse deverá ser a primeira instrução do Construtor da classe filha
		this.carteiraProfissional = carteiraProfissional;
		this.salario = salario;
		this.dataAdmissao = dataAdmissao;
	}

	/**
	 * @return the carteiraProfissional
	 */
	public long getCarteiraProfissional()
	{
		return carteiraProfissional;
	}
	
	/**
	 * @param carteiraProfissional the carteiraProfissional to set
	 */
	public void setCarteiraProfissional(long carteiraProfissional)
	{
		this.carteiraProfissional = carteiraProfissional;
	}
	
	/**
	 * @return the salario
	 */
	public double getSalario()
	{
		return salario;
	}
	
	/**
	 * @param salario the salario to set
	 */
	public void setSalario(double salario)
	{
		this.salario = salario;
	}
	
	/**
	 * @return the dataAdmissao
	 */
	public String getDataAdmissao()
	{
		return dataAdmissao;
	}
	
	/**
	 * @param dataAdmissao the dataAdmissao to set
	 */
	public void setDataAdmissao(String dataAdmissao)
	{
		this.dataAdmissao = dataAdmissao;
	}
	
	public void imprime()
	{
		System.out.println("Imprimindo dados do funcionário");
		super.imprime();
		System.out.println("Carteira Profissional: " + carteiraProfissional);
		System.out.println("Salário: " + salario);
		System.out.println("Data de Admissão: " + dataAdmissao);
	}
}
