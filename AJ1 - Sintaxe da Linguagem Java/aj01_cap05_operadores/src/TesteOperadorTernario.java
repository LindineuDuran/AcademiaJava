public class TesteOperadorTernario
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String mensagem = "O número é ";
		int numero = 15;
		int resto = numero % 2;
		
		mensagem += (resto == 0) ? " Par": "Ímpar"; //Se resto for igual a zero então Par, caso contrário Impar
		System.out.println(mensagem);
	}

}
