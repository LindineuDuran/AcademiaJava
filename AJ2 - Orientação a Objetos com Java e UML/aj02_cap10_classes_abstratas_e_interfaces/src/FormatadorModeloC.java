public class FormatadorModeloC extends FormatadorReciboMetodoAbstrato
{
	//Erro - N�o foi respeitada a assinatura do m�todo definida na superclasse
	public String gerarRecibo(double valor, String nomeCliente, String data, String motivo)
	{
		return "N�s da " + super.getNomeEmpresa() + " recebemos de " + nomeCliente + " em " + data + " o valor de R$ " + valor + " referente a " + motivo;
	}
}
