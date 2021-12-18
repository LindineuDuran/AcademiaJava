public class TesteFuncionarioSobrescritaImprime
{
	public static void main(String[] args)
	{
		// Criando um endere�o
		Endereco end1 = new Endereco("Rua das Tulipas", 1200);
		
		//Criando uma pessoa e imprimindo seus dados
		PessoaComConstrutor pessoa = new PessoaComConstrutor(end1, "Maria da Silva", "9876543");
		pessoa.imprime();
		
		//Imprime uma linha em branco
		System.out.println();

		// Criando o funcion�rio func e imprimindo seus dados
		FuncionarioSobrescritaImprime func = new FuncionarioSobrescritaImprime(123434L, 10000, "04/03/2004", end1, "Pedro da Silva", "1234545");
		func.imprime();
	}
}
