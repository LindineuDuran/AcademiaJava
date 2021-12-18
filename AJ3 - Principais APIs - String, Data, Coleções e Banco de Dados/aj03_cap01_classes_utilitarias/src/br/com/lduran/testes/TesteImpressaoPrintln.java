package br.com.lduran.testes;

import java.util.Date;

public class TesteImpressaoPrintln
{
	public static void main(String[] args)
	{
		String nome = "José da Silva";
		double pagamento = 6500;

		Date data = new Date();
		System.out.println(nome + " recebeu um pagamento de R$ " + pagamento + " no dia " + data);
	}
}
