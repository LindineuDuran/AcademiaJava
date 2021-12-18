public class TesteOperadorInstanceOf
{
	public static void main(String[] args)
	{
		Pessoa p = new Pessoa();
		
		if (p instanceof Cliente)
			
		{
			//cast down seguro
			Cliente c = (Cliente) p;
			
			System.out.println("CPF: " + c.getCpf());
		}
		else if (p instanceof Funcionario)
		{
			//cast down seguro
			Funcionario f = (Funcionario) p;
			
			System.out.println("Sal�rio: " + f.getSalario());
		}
		else
		{
			System.out.println("N�o eh Cliente nem Funcion�rio");
		}
	}
}
