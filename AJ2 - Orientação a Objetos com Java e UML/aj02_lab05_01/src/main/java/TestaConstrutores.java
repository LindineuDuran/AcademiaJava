/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores
{
	public static void main(String[] args)
	{
		Conta c1 = new Conta("001-0","João da Silva","300",001);
		c1.imprimeDados();
		
		Conta c2 = new Conta(10000.00, "001-0","João da Silva","300",001);
		c2.imprimeDados();
		
		Cliente cl1 = new Cliente("João da Silva", "000.000.000-00");
		cl1.imprimeDados();
	}
}
