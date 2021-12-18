/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta
{

	public static void main(String[] args)
	{
		// Criacao da conta
		Conta c = new Conta();
		
		// Inicializacao da conta
		c.inicializaConta(100, "001-0", "XXX", 100, 300);
		
		// Impressao dos dados da conta
		c.imprimeDados();
		
		// Saque da conta
		c.saque(-10);
		
		// Impressao dos dados da conta
		c.imprimeDados();
		
		// Saque da conta
		c.saque(10);
		
		// Impressao dos dados da conta
		c.imprimeDados();
		
		// Deposito em conta
		c.deposito(20);
		
		// Impressao dos dados da conta
		c.imprimeDados();
	}
}
