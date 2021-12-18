/**
 * Class TestePessoa
 */
public class TestePessoa
{
	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//Cria-se uma instância da Classe Pessoa
		Pessoa p = new Pessoa();
		
		//Acessando os atributos da classe Pessoa para definir seus valores
		p.nome = "Rodrigo";
		p.sobrenome = "Monteiro";
		p.dataNasc = "25/12/1975";
		p.rg = 11111;
		String[] telefones = {"1234-5678", "8765-4321"};
		p.telefones = telefones;
		
		//Acessando os atributos para leitura
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data de Nascimento: " + p.dataNasc);
		System.out.println("RG: " +p.rg);
		System.out.println("Telefones:");
		
		for(String tel : p.telefones)
		{
			System.out.println(tel);
		}
	}

}
