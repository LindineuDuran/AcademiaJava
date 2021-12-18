public class TesteReciboModeloA
{
	public static void main(String[] args)
	{
		FormatadorModeloA fr = new FormatadorModeloA();
		fr.setNomeEmpresa("Rain microsystems do Brasil");
		String texto = fr.gerarRecibo("William Gates", 2000.0, "11/04/2004", "Aluguel de Servidores");
		
		System.out.println(texto);
	}
}
