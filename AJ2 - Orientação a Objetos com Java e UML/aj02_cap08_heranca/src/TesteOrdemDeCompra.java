public class TesteOrdemDeCompra
{
	public static void main(String[] args)
	{
		Cliente cliente1 = new Cliente("Antônio Pereira");
		OrdemDeCompra ordem = new OrdemDeCompra(cliente1);
		
		//é possível alterarcos dados do cliente
		ordem.cliente.setNome("Marcos Pereira");
		
		//não é possível atribuir um novo cliente ao pedido
		Cliente cliente2 = new Cliente("Ana Silva");
		ordem.cliente = cliente2;
	}
}
