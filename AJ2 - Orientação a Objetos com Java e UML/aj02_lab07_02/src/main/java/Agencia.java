/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Implemente o metodo abrirConta seguindo como modelo o metodo 
 * abrirAgencia da classe Banco. Para isto sera necessario criar os
 * atributos e alterar o construtor conforme foi feito na classe Banco.
 * 
 * 2) Depois de alterar o construtor sera necessario alterar na classe 
 * Banco o metodo abrirAgencia para chamar o construtor valido, ou seja,
 * informando o numero de contas que a agencia podera abrir, utilize um 
 * valor fixo, por exemplo 10.
 *  
 * 3) Crie um metodo que faca a impressao das contas que estao dentro da
 * agencia usando como modelo o metodo imprimirAgencias que esta na classe Banco.
 * 
 */
public class Agencia
{
	private String numero;
	private Banco banco;
	private Conta contas[];
	private static int numContasAbertas = 0;
	private static int numeroProximaConta = 1234;

	/**
	 * @param num
	 *            Numero da agencia
	 * @param bc
	 *            banco ao qual a agencia pertence
	 */
	public Agencia(String num, Banco bc, int numeroMaxContas)
	{
		numero = num;
		banco = bc;
		this.contas = new Conta[numeroMaxContas];
	}

	/**
	 * @return Numero do banco
	 */
	public Banco getBanco()
	{
		return banco;
	}

	/**
	 * @return Numero da agencia
	 */
	public String getNumero()
	{
		return numero;
	}

	/**
	 * @param b
	 *            banco
	 */
	public void setBanco(Banco b)
	{
		banco = b;
	}

	/**
	 * Metodo para impressao de todos os dados da classe
	 */
	public void imprimeDados()
	{
		System.out.println("\nAgencia no. " + numero);
		banco.imprimeDados();
	}

	/**
	 * Metodo para abertura de uma Agencia dentro da instancia da classe Banco
	 * 
	 * @return Agencia que foi criada
	 */
	public Conta abrirConta(double saldoInicial, Cliente cliente)
	{
		Conta c = new Conta(saldoInicial, ""+numeroProximaConta, cliente, this);
		boolean contaAdicionada = adicionaArrayContas(c);
		if (contaAdicionada)
		{
			return c;
		} else
		{
			return null;
		}
	}

	/**
	 * Metodo para inclusao da agencia recem aberta dentro do array de agencias
	 * 
	 * @return Retorna um booleano identificando se a agencia foi inserida com
	 *         sucesso
	 */
	private boolean adicionaArrayContas(Conta conta)
	{
		if (this.contas.length <= numContasAbertas)
		{
			System.out.println("Banco ERROR: Nao foi possivel criar uma nova agencia");
			return false;
		} else
		{
			System.out.println("Banco DEBUG: Conta adicionada ao array "
					+ numContasAbertas);
			this.contas[numContasAbertas] = conta;
			numContasAbertas++;
			return true;
		}
	}

	/**
	 * @param num
	 *            Numero da agencia
	 */
	public void setNumero(String num)
	{
		numero = num;
	}

	/**
	 * Metodo para imprimir todas as agencias que fazem parte deste banco
	 */
	public void imprimeContas()
	{
		System.out.println(
				"\n\n=============== RELATORIO DE AGENCIAS DO BANCO ==================\n");
		System.out.println("Numero de agencias abertas: " + this.contas.length);
		for (int i = 0; i < numContasAbertas; i++)
		{
			contas[i].imprimeDados();
		}
		System.out.println("===============================================");
	}
}