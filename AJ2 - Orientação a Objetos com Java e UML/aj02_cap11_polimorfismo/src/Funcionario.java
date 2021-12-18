public class Funcionario extends Pessoa
{
	private String carteiraProfissional;
	private double salario;
	
	/**
	 * @return the carteiraProfissional
	 */
	public String getCarteiraProfissional()
	{
		return carteiraProfissional;
	}
	
	/**
	 * @param carteiraProfissional the carteiraProfissional to set
	 */
	public void setCarteiraProfissional(String carteiraProfissional)
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
	
	public double calculaPagamento()
	{
		return salario;
	}
}
