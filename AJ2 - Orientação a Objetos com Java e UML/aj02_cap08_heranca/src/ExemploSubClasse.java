public class ExemploSubClasse extends ExemploSuperClasse
{
	int campo = 15;

	{
		System.out.println("Bloco de inicializa��o da Subclasse");
	}

	ExemploSubClasse()
	{
		System.out.println("Construtor da SubClasse");
	}
}
