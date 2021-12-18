public class TesteListaInteiros
{
	public static void main(String[] args)
	{
		//Faz a leitura do tamanho da lista de inteiros a ser criada
		//Este valor deve ser passado como parâmetro do Construtor.
		int tamanhoLista = Integer.parseInt(args[0]);
		
		for(int i = 0; i < 5; i++)
		{
			ListaInteiros lista = new ListaInteiros(i, tamanhoLista);
		}
		
		System.out.println("Finaliza programa");
	}
}
