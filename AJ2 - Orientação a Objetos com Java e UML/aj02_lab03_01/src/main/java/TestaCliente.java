/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente
{
	public static void main(String[] args)
	{
		// Criacao do cliente
		Cliente cliente = new Cliente();
		
		// Inicializacao do cliente usando o metodo inicializaCliente
		cliente.inicializaCliente("Lindineu Duran", "000.143.607-48");
		
		// Impressao dos dados do cliente
		cliente.imprimeDados();
	}
}
