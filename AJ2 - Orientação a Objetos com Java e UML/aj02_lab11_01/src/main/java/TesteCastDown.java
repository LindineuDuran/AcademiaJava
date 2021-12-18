public class TesteCastDown
{
	public static void main(String[] args)
	{
		// double saldoInicial = args.length > 0 ? Double.parseDouble(args[0]) : 0d;

		double saldoInicial = 0d;
		if (args.length > 0)
		{
			for (int i = 0; i < args.length; i++)
			{
				saldoInicial = Double.parseDouble(args[i]);

				Banco banco = new Banco("GlobalcodeBank", 123);
				Agencia ag = new AgenciaStandard("9999", banco);
				Cliente clienteW = new Cliente("Mr. W", "55446688-77");

				// O Saldo Inicial define o Tipo da Conta
				Conta conta = ag.abrirConta(clienteW, saldoInicial);

				System.out.println("Foi criada a conta " + conta.getNumero() + " para " + conta.getTitular().getNome()
						+ " com saldo de " + conta.getSaldo());

				// Aqui estamos investigando se a conta aberta é do tipo poupanca
				if (conta instanceof ContaPoupanca)
				{
					System.out.println("Trata-se de uma conta poupanca");
					ContaPoupanca contaPoupanca = (ContaPoupanca) conta; // cast down para visualizar o aniversario
					System.out.println("Aniversario: " + contaPoupanca.getDataAniversario());

				}
				// Investigue se a conta aberta é do tipo especial
				else if (conta instanceof ContaEspecial)
				{
					// em caso afirmativo imprima uma mensagen de aviso, e o limite estabelecido
					System.out.println("Trata-se de uma conta especial");
					ContaEspecial contaEspecial = (ContaEspecial) conta; // cast down para visualizar o aniversario
					System.out.println("O Limite é: " + contaEspecial.getLimite());
				}
				else
				{
					// em caso negativo imprima uma mensagem afirmando que é uma conta simples
					System.out.println("Trata-se de uma conta simples");
				}
			}
		}

	}
}
