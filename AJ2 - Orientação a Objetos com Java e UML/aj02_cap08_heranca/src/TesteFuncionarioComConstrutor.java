public class TesteFuncionarioComConstrutor
{
	public static void main(String[] args)
	{
		// Criando o endereço para o funcionário func
		Endereco end1 = new Endereco("Rua das Tulipas", 1200);

		// Criando o funcionário func
		FuncionarioComConstrutor func = new FuncionarioComConstrutor(123434L, 10000, "04/03/2004", end1, "Pedro da Silva", "1234545");
		func.impressaoRecibo(16, 4, 2018);
	}
}
