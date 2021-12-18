public class TesteClienteComConstantes
{
	public static void main(String[] args)
	{
		ClienteComConstantes cliente = new ClienteComConstantes("Maria", "maria@gc.com.br", ClienteComConstantes.PESSOA_FISICA);
		System.out.println("tipo de cliente criado = " + cliente.getTipo());
	}
}
