public class TestePessoaSobrescritaToString
{
	public static void main(String[] args)
	{
		Endereco end = new Endereco("Av, Bernardino de Campos", 32);
		PessoaSobrescritaToString pessoa1 = new PessoaSobrescritaToString(end, "Ant�nio Cl�udio", "1231321");
		
		//O m�todo toString() ser� chamado automaticamente
		System.out.println(pessoa1);
		System.out.println();
		String texto = "Dados da pessoa: \n" + pessoa1;
		System.out.println(texto);
		
		System.out.println("==========================================");
		

		PessoaComConstrutor pessoa2 = new PessoaComConstrutor(end, "Ant�nio Cl�udio", "1231321");
		
		//O m�todo toString() ser� chamado automaticamente
		System.out.println(pessoa2);
		System.out.println();
		texto = "Dados da pessoa: \n" + pessoa2;
		System.out.println(texto);
	}
}
