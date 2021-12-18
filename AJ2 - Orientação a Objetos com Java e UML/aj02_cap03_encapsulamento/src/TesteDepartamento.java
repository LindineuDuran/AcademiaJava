public class TesteDepartamento
{
	public static void main(String[] args)
	{
		//Criação das pessoas para o array de pessoas do departamento
		Pessoa p1 = new Pessoa();
		p1.setNome("Renato");
		p1.setRg("111111");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Fernanda");
		p2.setRg("222222");
		
		//Criação do array de pessoas para o departamento
		Pessoa[] pessoasDepto = {p1, p2};
		
		//Criação do Departamento
		Departamento d = new Departamento();
		d.setNome("Departamentode Compras");
		d.setPessoas(pessoasDepto);
		
		System.out.println("Departamento recem criado");
		d.imprime();
		
		Pessoa p3 = new Pessoa();
		p3.setNome("João da Silva");
		p3.setRg("333333");
		d.addPessoa(p3);
		d.imprime();
		
		d.removePessoa(p1);
		d.imprime();
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Raquel");
		p4.setRg("333333");
		d.addPessoa(p4);
		d.imprime();
		
		Pessoa p5 = new Pessoa();
		p5.setNome("Gustavo");
		p5.setRg("444444");
		d.addPessoa(p5);
		d.imprime();
		
		System.out.println("Procurando a pessoa com rg = 333333");
		Pessoa procurada1 = d.getPessoa("333333");
		
		if(procurada1 != null)
		{
			System.out.println(procurada1.getNome());
		}
		
		System.out.println("Procurando a pessoa com rg = 555555");
		Pessoa procurada2 = d.getPessoa("555555");
		
		if (procurada2 != null)
		{
			System.out.println(procurada2.getNome());
		}
		else
		{
			System.out.println("Pessoa não encontrada");
		}
	}
}
