/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class ParametrosMain
{
	/**
	 * M�todo para que esta classe possa ser executada com o utilit�rio java.
	 * 
	 * @param args
	 *            - argumentos para o m�todo main
	 * Para testes, configura os par�metros em "Run Configurantions --> Argumentos"
	 */
	public static void main(String[] args)
	{		
		if (args.length <= 5)
		{
			String nome= args[0];
			String dataNascimento= args[1];
			String rg= args[2];
			String sexo= args[3];
			String salario= args[4];
			
			String textNome = "O(a) Senhor(a) " + nome;
			String textNasc = ", nascido(a) em " + dataNascimento;
			String textRg = " portador(a)do rg de numero " + rg + ", \n";
			String textSexo = " do sexo " + sexo;
			String textTrabalho = ", est� registrado(a) com o sal�rio de R$ " + salario + ".";
			
			System.out.println(textNome + textNasc + textRg + textSexo + textTrabalho);
		} else
		{
			System.out
					.println("Java ParametrosMain <nome> <data nascimento> <rg> <sexo> <salario>");
		}
	}
}