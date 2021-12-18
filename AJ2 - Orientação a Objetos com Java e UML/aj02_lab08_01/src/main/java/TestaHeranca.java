/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Esta classe e responsavel pelo teste das Herancas desenvolvidas nas classes 
 *  Conta e ContaEspecial
 * 
 * Altere o metodo main fazendo com que sejam criadas 02 contas especiais e 01 conta poupanca. 
 * Realize 1 saque na 1a. conta especial cujo valor exceda o saldo mas nao ultrapasse o limite.
 * Realize 1 saque na 2a. conta especial cujo valor ultrapasse o saldo e o limite.
 * Realize 1 saque na conta poupanca que exceda o saldo.
 * Imprima os dados das contas para conferir se estao corretas.
 * 
 * Dica: Para obter a data do sistema e transformar em String: 
 *  String strData = new java.util.Date().toString();
 * 
 */
public class TestaHeranca
{
	public static void main(String args[])
	{
		Banco banco = new Banco("Globalcode Bank", 1000);
		Agencia ag1 = new Agencia("001", banco);

		Cliente cliente1 = new Cliente("Cliente 1", "1232323");
		Cliente cliente2 = new Cliente("Cliente 2", "987789");

		Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
		conta.saque(560);
		conta.imprimeDados();
		System.out.println();
		
		ContaEspecial contaEsp1 = new ContaEspecial(1000.00,"001", cliente1, ag1, 10000); // 1a. conta especial
		ContaEspecial contaEsp2 = new ContaEspecial(150000.00,"002", cliente2, ag1, 1000000); // 2a. conta especial
		ContaPoupanca contaPoup = new ContaPoupanca(10000.00, "003", cliente1, ag1, "01/0/2004"); // conta poupanca
		
		contaEsp1.saque(2000);
		contaEsp2.saque(160000);
		contaPoup.saque(1500000);
		
		contaEsp1.imprimeDados();
		contaEsp2.imprimeDados();
		contaPoup.imprimeDados();
	}
}
