/**
 * Classe com o objetivo de praticar a utiliza??o de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional
{
	/**
	 * M?todo para que esta classe possa ser executada com o utilit?rio java.
	 * 
	 * @param args
	 *            - argumentos para o m?todo main
	 */
	public static void main(String[] args)
	{
		String nome = "Carolina Pereira";
		int idade = 20;
		String rg = "34.654.789-9";
		char sexo = 'F';
		double salario = 1500.0;
		int anoAtual = 2009;
		double aliquota = 0.20;
		int anoNascimento = anoAtual - idade;
		
		String sexoPorExtenso;
		if (sexo == 'M')
		{
			sexoPorExtenso = "masculino";
		}
		else
		{
			sexoPorExtenso = "feminino";
		}
		
		double impostoDevido = salario * aliquota;
		
		String textNome;
		String textNasc;
		String textRg;
		String textSexo;
		String textTrabalho;
		String textImposto;
		switch (sexo)
		{
			case 'M':
				textNome = "O Senhor " + nome;
				textNasc = ", nascido no ano de " + anoNascimento;
				textRg = " portador do rg de numero " + rg + ", \n";
				textSexo = " do sexo " + sexoPorExtenso;
				textTrabalho = ", est? registrado com o sal?rio de R$ " + salario;
				textImposto = " e pagar? R$ " + impostoDevido + " de imposto.";
				System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho + textImposto);
				break;
			
			case 'F':
				textNome = "A Senhora " + nome;
				textNasc = ", nascida no ano de " + anoNascimento;
				textRg = " portadora do rg de numero " + rg + ", \n";
				textSexo = " do sexo " + sexoPorExtenso;
				textTrabalho = ", est? registrada com o sal?rio de R$ "+ salario;
				textImposto = " e pagar? R$ " + impostoDevido + " de imposto.";
				System.out.println(textNome + textRg + textNasc + textSexo + textTrabalho + textImposto);
				break;
				
			default:
				textNome = "O(a) Senhor(a) " + nome;
				textNasc = ", nascido(a) no ano de " + anoNascimento;
				textRg = " portador(a)do rg de numero " + rg + ", \n";
				textSexo = " do sexo " + sexoPorExtenso;
				textTrabalho = ", est? registrado(a) com o sal?rio de R$ " + salario;
				textImposto = " e pagar? R$ " + impostoDevido + " de imposto.";
				System.out.println(textNome + textRg + textNasc + textSexo
						+ textTrabalho + textImposto);
				break;
				
		}
		
	}
}