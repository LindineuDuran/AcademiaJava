class TesteException
{

	public static void main(String args[])
	{
		Banco banco = new Banco("Globalcode Bank", 1000);
		Agencia agencia = new AgenciaStandard("321", banco);
		Cliente cliente1 = new Cliente("Cliente 1", "1232323");
		ContaEspecial contaEspecial = new ContaEspecial(2000, "876654", cliente1, agencia, 500);
		ContaPoupanca contaPoupanca = new ContaPoupanca(600, "135646", cliente1, agencia, "01/01/2005");

		try
		{
			contaEspecial.saque(2950.0);
		} catch (SaldoInsuficienteException e)
		{
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saldo e limite insuficientes");
		}

		try
		{
			contaPoupanca.saque(340.0);
		} catch (SaldoInsuficienteException e)
		{
			// TODO Auto-generated catch block
			// e.printStackTrace();
			System.out.println("Saldo e limite insuficientes");
		}

		contaEspecial.imprimeDados();
		contaPoupanca.imprimeDados();
	}
}
