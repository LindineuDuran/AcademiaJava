

public class TesteData
{
	public static void main(String[] args)
	{
		Data d1 = new Data();
		d1.setDia(12);
		d1.setMes(1);
		d1.setAno(2004);
		d1.imprime();
		
		String bi1 = d1.isAnoBissexto() ? " " : " não ";
		System.out.println("O ano " + d1.getAno() + bi1 + "é bissexto");
	}
}