public class TesteFuncionarioAcessaAtribSuperClasse
{
	public static void main(String[] args)
	{
		//Criando o endereço para o funcionário f
		Endereco end1 = new Endereco("Rua das Tulipas", 1200);
		
		//Criando o funcionário f
		FuncAcessaAtribSuperClasse2 f = new FuncAcessaAtribSuperClasse2();
		
		//Atribuindo as características herdadas da classe Pessoa
		f.setNome("Pedro da Silva");
		f.setEndereco(end1);
		f.setRg("1234545");
		
		//Atribuindo as características específicas de Funcionários
		f.setSalario(10000);
		f.setCarteiraProfissional(123434L);
		
		//Chama um método definido na classe Pessoa que, por sua vez
		//"conhece" apenas os atributos da classe Pessoa
		f.impressaoRecibo(16, 4, 2018);
	}
}
