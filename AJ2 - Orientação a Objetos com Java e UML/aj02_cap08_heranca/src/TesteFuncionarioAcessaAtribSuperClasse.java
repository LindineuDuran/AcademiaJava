public class TesteFuncionarioAcessaAtribSuperClasse
{
	public static void main(String[] args)
	{
		//Criando o endere�o para o funcion�rio f
		Endereco end1 = new Endereco("Rua das Tulipas", 1200);
		
		//Criando o funcion�rio f
		FuncAcessaAtribSuperClasse2 f = new FuncAcessaAtribSuperClasse2();
		
		//Atribuindo as caracter�sticas herdadas da classe Pessoa
		f.setNome("Pedro da Silva");
		f.setEndereco(end1);
		f.setRg("1234545");
		
		//Atribuindo as caracter�sticas espec�ficas de Funcion�rios
		f.setSalario(10000);
		f.setCarteiraProfissional(123434L);
		
		//Chama um m�todo definido na classe Pessoa que, por sua vez
		//"conhece" apenas os atributos da classe Pessoa
		f.impressaoRecibo(16, 4, 2018);
	}
}
