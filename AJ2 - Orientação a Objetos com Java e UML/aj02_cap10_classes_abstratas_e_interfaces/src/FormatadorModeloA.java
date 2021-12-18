public class FormatadorModeloA extends FormatadorRecibo
{
	public String gerarRecibo(String nomeCliente, double valor, String data, String motivo)
	{
		return "Nós da " + super.getNomeEmpresa() + " recebemos de " + nomeCliente + " em " + data + " o valor de R$ " + valor + " referente a " + motivo;
	}
}
