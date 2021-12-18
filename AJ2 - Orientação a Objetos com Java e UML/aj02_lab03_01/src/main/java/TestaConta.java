/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaConta
{

	public static void main(String[] args)
	{
		// Criar um objeto do tipo Conta
		Conta conta = new Conta();
		
		// Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
		conta.inicializaConta(9000.00, "001-0", "Lindineu Duran", 300, 10);

		// executar um deposito
		conta.deposito(100000);
		
		// Imprimir o saldo apos o deposito
		System.out.println(conta.getSaldo());
		
		// executar um saque cujo valor seja menor que o saldo
		conta.saque(2000);

		// Imprimir o saldo apos o deposito
		System.out.println(conta.getSaldo());
		
		// executar uma retirada cujo valor seja maior que o saldo
		conta.saque(110000);
		
		// Imprimir o saldo apos o deposito
		System.out.println(conta.getSaldo());
	}
}
