package br.com.lduran.testes;

import java.util.List;

import br.com.lduran.database.ProdutoDbPrepStat;

public class TesteProdutoDB3
{
	public static void main(String[] args) throws Exception
	{
		ProdutoDbPrepStat db = new ProdutoDbPrepStat();

		if (args.length == 1)
		{
			int id = Integer.parseInt(args[0]);
			int qtdRemovido = db.delete(id);

			System.out.println(qtdRemovido + " produto(s) removido(s).");
		}
		else
		{
			List produtos = db.getAllProdutos();

			System.out.println("Foram encontrados " + produtos.size() + " produto(s).");
			for (int i = 0; i < produtos.size(); i++)
			{
				System.out.println(produtos.get(i));
			}
		}
	}
}
