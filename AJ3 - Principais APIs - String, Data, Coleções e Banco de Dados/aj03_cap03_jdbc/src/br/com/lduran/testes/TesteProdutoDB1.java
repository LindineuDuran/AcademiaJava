package br.com.lduran.testes;

import br.com.lduran.beans.Produto;
import br.com.lduran.database.ProdutoDB;

public class TesteProdutoDB1
{
	public static void main(String[] args) throws Exception
	{
		ProdutoDB db = new ProdutoDB();
		db.createTable();

		String nome = "";
		int preco = 0;
		int id = 0;
		Produto produto = null;

		if (args.length == 2)
		{
			// Teste estes valores: Produto1 400
			System.out.println("O produto ser� inserido no BD!");
			nome = args[0];
			preco = Integer.parseInt(args[1]);
			produto = new Produto(nome, preco);
		}
		else if (args.length == 3)
		{
			// Teste estes valores: Produto2 400 1
			System.out.println("O produto ser� alterado no BD!");
			nome = args[0];
			preco = Integer.parseInt(args[1]);
			id = Integer.parseInt(args[2]);
			produto = new Produto(id, nome, preco);
		}
		else
		{
			System.out.println("Sintaxe para utiliza��o deste programa");
			System.out.println("Para inserir um produto novo:");
			System.out.println("<nome do produto> <pre�o do produto>");
			System.out.println("");
			System.out.println("Para alterar um produto:");
			System.out.println("<nome do produto> <pre�o do produto> <id>");
		}

		db.save(produto);
	}
}
