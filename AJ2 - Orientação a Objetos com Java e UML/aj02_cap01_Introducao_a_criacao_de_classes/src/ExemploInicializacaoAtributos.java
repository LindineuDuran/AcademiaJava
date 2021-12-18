public class ExemploInicializacaoAtributos
{
	public static void main(String[] args)
	{
		// Cria-se uma instância da classe Pessoa
		Pessoa p = new Pessoa();

		// Acessando os atributos para leitura
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data de Nascimento: " + p.dataNasc);
		System.out.println("RG: " + p.rg);
		System.out.println("Telefones:" + p.telefones);
	}
}
