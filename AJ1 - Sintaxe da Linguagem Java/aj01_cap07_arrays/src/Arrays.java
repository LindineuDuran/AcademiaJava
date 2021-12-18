
public class Arrays
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		String[] clientes = new String[3];
		
		for(int i=0; i< clientes.length; i++)
		{
			clientes[i] = "Cliente " +(i+1)+" email: cliente"+(i+1)+"@cliente.com.br";
		}
		
		for(String cliente: clientes)
		{
			System.out.println(cliente);
		}

	}

}
