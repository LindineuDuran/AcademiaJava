/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaAgencia
{

	public static void main(String[] args)
	{
		// Criacao da agencia
		Agencia age = new Agencia();

		// Inicializacao da agencia
		age.inicializaCliente("100", 300);

		// Impressao dos dados da agencia
		age.imprimeDados();
	}
}
