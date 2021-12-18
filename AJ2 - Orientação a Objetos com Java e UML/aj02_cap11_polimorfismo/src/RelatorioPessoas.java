public class RelatorioPessoas
{
	public void imprime(Pessoa p)
	{
		System.out.print("Nome: " + p.getNome() + "\trg: " + p.getRg());

		if (p instanceof Cliente)
		{
			//cast down seguro
			Cliente c = (Cliente) p;
			
			System.out.println("\tCPF: " + c.getCpf());
		}
		else if (p instanceof Funcionario)
		{
			// cast down seguro
			Funcionario f = (Funcionario) p;

			System.out.println("\tSalário: " + f.getSalario() + "\tCarteira de Trabalho: " + f.getCarteiraProfissional());
		}
		else
		{
			System.out.println();
		}
	}
	
	public int imprimeArray(Pessoa[] pessoas)
	{
		int quantidadeImpressa = 0;
		
		for(int i = 0; i < pessoas.length; i++)
		{
			if(pessoas[i] == null)
			{
				continue;
			}
			else
			{
				imprime(pessoas[i]);
				quantidadeImpressa++;
			}
		}
		
		return quantidadeImpressa;
	}
}
