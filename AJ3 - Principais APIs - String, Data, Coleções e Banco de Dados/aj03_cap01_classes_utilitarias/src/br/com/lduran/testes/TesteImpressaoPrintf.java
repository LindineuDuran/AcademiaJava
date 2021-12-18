package br.com.lduran.testes;

import java.util.Date;

public class TesteImpressaoPrintf
{
	public static void main(String[] args)
	{
		String nome = "José da Silva";
		double pagamento = 6500;
		Date data = new Date();

		System.out.printf("%s recebeu um pagamento de R$ %.2f no dia %td/%<tm/%<ty", nome, pagamento, data);
	}
}
