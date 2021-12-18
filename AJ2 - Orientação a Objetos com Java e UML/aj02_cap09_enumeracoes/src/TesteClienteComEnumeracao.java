public class TesteClienteComEnumeracao
{
	public static void main(String[] args)
	{
		ClienteComEnumeracao cliente = new ClienteComEnumeracao(ClienteComEnumeracao.TipoCliente.PESSOA_FISICA,"Maria", "maria@gc.com.br");
		System.out.println("tipo de cliente criado = " + cliente.getTipo());
	}
}
