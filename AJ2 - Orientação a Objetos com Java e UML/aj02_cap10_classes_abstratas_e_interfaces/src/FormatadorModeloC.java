public class FormatadorModeloC extends FormatadorReciboMetodoAbstrato
{
	//Erro - Não foi respeitada a assinatura do método definida na superclasse
	public String gerarRecibo(double valor, String nomeCliente, String data, String motivo)
	{
		return "Nós da " + super.getNomeEmpresa() + " recebemos de " + nomeCliente + " em " + data + " o valor de R$ " + valor + " referente a " + motivo;
	}
}
