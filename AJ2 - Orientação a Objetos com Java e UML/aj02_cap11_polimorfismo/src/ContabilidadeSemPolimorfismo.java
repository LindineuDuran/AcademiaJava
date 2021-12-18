public class ContabilidadeSemPolimorfismo
{
	public void gerarDemonstrativo(FuncionarioCLT func)
	{
		System.out.println("O funcionário: " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
	}
	
	public void gerarDemonstrativo(FuncionarioPJ func)
	{
		System.out.println("O funcionário: " + func.getNome());
		System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
	}
}
