
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * Altere a classe Agencia utilizando associaçao de classes: 
 * 1) Substitua o atributo banco, do tipo int, por um atributo banco do tipo Banco 
 * 2) Altere os metodos que julgar necessario
 * 
 */
public class Agencia
{

	private String numero;
	private Banco banco;

	/**
	 * @param num
	 *            Numero da agencia
	 * @param bc
	 *            banco ao qual a agencia pertence
	 */
	public Agencia(String num, Banco banco)
	{
		numero = num;
		this.banco = banco;
	}

	/**
	 * @return o número do banco
	 */
	public int getBanco()
	{
		return banco.getNumero();
	}

	/**
	 * @return numero da agencia
	 */
	public String getNumero()
	{
		return numero;
	}

	/**
	 * @param b
	 *            banco
	 */
	public void setBanco(int b)
	{
		banco.setNumero(b);
	}

	/**
	 * Metodo para impressao de todos os dados da classe
	 */
	public void imprimeDados()
	{
		System.out.println("Agencia no. " + numero);
		System.out.println("Banco no. " + banco);
	}

	/**
	 * @param num
	 *            numero da agencia
	 */
	public void setNumero(String num)
	{
		numero = num;
	}
}