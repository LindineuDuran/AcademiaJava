package br.com.lduran.testes;

import java.util.Date;

public class TestePrintfIndexado
{
	public static void main(String[] args)
	{
		String nome = "José da Silva";
		double pagamento = 6500;
		Date data = new Date();

		System.out.printf("%s recebeu um pagamento de R$ %.2f no dia %td/%3$tm/%3$ty", nome, pagamento, data);
	}
}
