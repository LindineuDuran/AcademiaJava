public class Departamento
{
	private String nome;
	private Pessoa[] pessoas;
	private int numeroPosicoesLivres = 0;
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
	}
	
	public Pessoa[] getPessoas()
	{
		return pessoas;
	}
	
	public void setPessoas(Pessoa[] pessoas)
	{
		this.pessoas = pessoas;
	}
	
	public void addPessoa(Pessoa pessoa)
	{
		System.out.println("Adicionando " + pessoa.getNome() + " ao departamento");
		
		if (numeroPosicoesLivres > 0)
		{
			System.out.println("Existem posições livres no departamento");
			
			//Inserção na posição disponível; não será necessário redimensionar o array.
			pessoas[pessoas.length - numeroPosicoesLivres] = pessoa;
			numeroPosicoesLivres--;
		}
		else
		{
			System.out.println("Aumentando a capacidade de pessoas do departamento");			
			Pessoa[] novoArrayPessoas = new Pessoa[pessoas.length +1];
			
			for(int i = 0; i < pessoas.length; i++)
			{
				novoArrayPessoas[i] = pessoas[i];
			}
			
			novoArrayPessoas[novoArrayPessoas.length -1] = pessoa;
			pessoas = novoArrayPessoas;
		}
	}
	
	public Pessoa getPessoa(String rg)
	{
		for (int i = 0; (i < pessoas.length - numeroPosicoesLivres); i++)
		{
			if (pessoas[i].getRg().equals(rg))
			{
				return pessoas[i];
			}
		}
		
		//Se a pessoa com rg informado não for encontrada, retorna null.
		return null;
	}
	
	public Pessoa removePessoa(Pessoa pessoa)
	{
		String rgPessoa = pessoa.getRg();
		int i = 0;
		
		while (i < pessoas.length - numeroPosicoesLivres)
		{
			if (pessoas[i].getRg().equals(rgPessoa))
			{
				//Indicar que a pessoa foi removida trazendo o último elemento do array
				//para a posição e coloca null na última posição.
				Pessoa pessoaRemovida = pessoas[i];
				pessoas[i] = pessoas[pessoas.length-1-numeroPosicoesLivres];
				pessoas[pessoas.length-1-numeroPosicoesLivres] = null;
				numeroPosicoesLivres++;
				
				System.out.println(pessoaRemovida.getNome() + " foi removido(a) do departamento");
				
				return pessoaRemovida;
			}
			
			i++;
		}
		
		//Se a pessoa com o rg informado não foi encontrada retorna null,
		//indicando que a remoção não foi feita.
		return null;
	}
	
	public void imprime()
	{
		System.out.println("=====================================");
		System.out.println("Departamento: " + nome);
		
		//É preciso garantir que o array de pessoas foi inicializado, sendo diferente de null,
		//caso contrário poderá ocorrer uma NullPointerException.
		if (pessoas != null)
		{
			int i = 0;
			
			//É necessário garantir que as posições não estejam vazias, e que não estão sendo impressas posições inválidas,
			//ou seja, maiores do que o array.
			while (i < pessoas.length)
			{
				System.out.print("[" + i + "] ");
				if(pessoas[i] != null)
				{
					System.out.print(pessoas[i].getNome());
					System.out.println(" " +pessoas[i].getRg());
				}
				else
				{
					System.out.println("Posição Livre");
				}
				
				i++;
			}
		}
		else
		{
			System.out.println("Não há pessoas neste departamento");
		}
		
		System.out.println("=====================================");
	}
}
