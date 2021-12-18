/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Tarefas: 
 * 1) Faca com que a classe ContaEspecial estenda a classe Conta 
 * 2) Adicione o atributo limite do tipo double e o encapsule 
 * 3) Crie construtores da classe obrigando a passagem do valor do limite na criacao de objetos 
 *  e todos os parametros necessarios anteriormente. 
 * 4) Faca override do metodo imprimeDados fazendo com que ele imprima tambem o
 *  valor do limite alem do tipo da conta (CONTA ESPECIAL) 
 * 5) Faca override do metodo saque para que ele considere o limite na hora de 
 *    verificar se existe ou nao saldo disponivel.
 *    Faca tambem com que este metodo acumule o CPMF devido.
 */
public class ContaEspecial extends Conta
{
	private double limite;

	/**
	 * @param saldoInicial
	 * @param num
	 * @param tit
	 * @param ag
	 * @param limite
	 */
	public ContaEspecial(double saldoInicial, String num, Cliente tit, Agencia ag, double limite)
	{
		super(saldoInicial, num, tit, ag);
		this.limite = limite;
	}

	/**
	 * @param num
	 * @param tit
	 * @param ag
	 * @param limite
	 */
	public ContaEspecial(String num, Cliente tit, Agencia ag, double limite)
	{
		super(num, tit, ag);
		this.limite = limite;
	}

	/**
	 * @return the limite
	 */
	public double getLimite()
	{
		return limite;
	}

	/**
	 * @param limite the limite to set
	 */
	public void setLimite(double limite)
	{
		this.limite = limite;
	}
	
	public void imprimeDados()
	{		
		System.out.println("======================================");
		System.out.println("Tipo da conta (CONTA ESPECIAL)");
		super.imprimeDados();
		System.out.println("Limite de crédito: " + limite);
		System.out.println("========================================");
	}
	
	/**
	 * @param valor
	 *            Valor a ser sacado da conta
	 */
	public void saque(double valor)
	{
		System.out.println("Realizando saque de R$ " + valor + " da conta " + super.getNumero());
		if (valor > 0)
		{
			if ((saldo >= valor) && (limite > valor))
			{
				saldo -= valor;
				acumularIFN(valor);
			} else
				System.out.println("Saldo insuficiente");
		} else
		{
			System.out.println("O valor de saque deve ser positivo");
		}
	}
}
