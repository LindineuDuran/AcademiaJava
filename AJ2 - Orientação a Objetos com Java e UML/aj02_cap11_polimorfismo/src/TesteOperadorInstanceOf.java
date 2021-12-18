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
			
			System.out.println("Salário: " + f.getSalario());
		}
		else
		{
			System.out.println("Não eh Cliente nem Funcionário");
		}
	}
}
