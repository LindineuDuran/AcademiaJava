public class FuncionarioVariavelImplicitaSuper extends PessoaAtributosProtected
{
	private long carteiraProfissional;
	private double salario;
	private String dataAdmissao;
	
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
	
	public void impressaoRecibo(int dia, int mes, int ano)
	{
		//Classe filha pode acessar atributos Protected da Classe pai
		System.out.println("\n\n------- Recibo de Pagamento -------");
		System.out.println("Eu, " + super.nome + ", portador do RG de número: " + super.rg + " declaro que recebi o valor de R$ " + salario + " referente ao meu pagamento no dia " + dia + "/" + mes + "/" +ano);
		System.out.println("\n-------------------------------------\n\n");
	}
}
