public class Contabilidade
{
	public void gerarDemonstrativo(Funcionario func)
	{
		System.out.println("O funcion�rio: " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
	}
}
