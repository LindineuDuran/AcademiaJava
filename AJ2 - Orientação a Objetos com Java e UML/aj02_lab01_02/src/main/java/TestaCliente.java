/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaCliente
{

	public static void main(String[] args)
	{
		// Criacao do cliente
		Cliente clie = new Cliente();
		
		// Inicializacao do cliente
		clie.inicializaCliente("Lindineu Duran", "000.143.607-48");
		
		// Impressao dos dados do cliente
		clie.imprimeDados();
	}
}
