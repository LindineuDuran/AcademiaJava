public class TesteImpressaoEnum
{
	public static void main(String[] args)
	{
		ClienteComEnumeracao cliente = new ClienteComEnumeracao(ClienteComEnumeracao.TipoCliente.PESSOA_FISICA, "Maria", "maria@gc.com.br");
		System.out.println("Tipos de cliente:");
		
		for(ClienteComEnumeracao.TipoCliente tipo : ClienteComEnumeracao.TipoCliente.values())
		{
			System.out.println(tipo);
		}
	}
}
