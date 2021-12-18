/**
 * Como a classe Funcionario estende a classe Pessoa, ela terá todos
 * os atributos e métodos da classe Pessoa.
 * @author lsdur
 *
 */
public class Funcionario extends Pessoa
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
}
