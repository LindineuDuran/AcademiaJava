public class TesteReciboModeloB_Corrigido
{
	public static void main(String[] args)
	{
		FormatadorModeloB_Corrigido fr = new FormatadorModeloB_Corrigido();
		fr.setNomeEmpresa("Coffe & Milk");
		String texto = fr.gerarRecibo("Serafim da Silva", 4, "16/09/2004", "café com bolinhos");

		System.out.println(texto);
	}
}
