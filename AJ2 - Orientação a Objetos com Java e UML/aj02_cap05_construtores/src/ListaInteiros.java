public class ListaInteiros
{
	private int[] inteiros;
	private int id;
	
	public ListaInteiros(int id, int tamanho)
	{
		this.id = id;
		inteiros = new int[tamanho];
	}
	
	public void finalize()
	{
		System.out.println("Removendo objeto " + id + " da memória");
	}
}
