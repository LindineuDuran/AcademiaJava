public class TesteData
{
	public static void main(String[] args)
	{
		Data d1 = new Data();
		d1.dia = 12;
		d1.mes = 1;
		d1.ano = 2004;
		d1.imprime();
		
		String bi1 = d1.isAnoBissexto() ? " " : " não ";
		System.out.println("O ano " + d1.ano + bi1 + "é bissexto");
		
		Data d2 = new Data();
		d2.imprime();
		
		d2.dia = -20;
		d2.mes = 23;
		d2.ano = 9;
		d2.imprime();
		
		String bi2 = d2.isAnoBissexto() ? " " : " não ";
		System.out.println("O ano " + d2.ano + bi2 + "é bissexto");
		
	}
}
