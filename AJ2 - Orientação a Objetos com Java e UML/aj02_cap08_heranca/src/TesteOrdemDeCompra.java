public class TesteOrdemDeCompra
{
	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente("Ant�nio Pereira");
		OrdemDeCompra ordem = new OrdemDeCompra(cliente1);
		
		//� poss�vel alterarcos dados do cliente
		ordem.cliente.setNome("Marcos Pereira");
		
		//n�o � poss�vel atribuir um novo cliente ao pedido
		Cliente cliente2 = new Cliente("Ana Silva");
		ordem.cliente = cliente2;
	}
}
