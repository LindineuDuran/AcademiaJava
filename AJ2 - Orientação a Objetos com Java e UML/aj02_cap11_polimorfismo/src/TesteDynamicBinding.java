public class TesteDynamicBinding
{
	public static void main(String[] args)
	{
		Funcionario f = new FuncionarioCLT();
		f.calculaPagamento();
		
		f = new FuncionarioPJ();
		f.calculaPagamento();
	}
}
