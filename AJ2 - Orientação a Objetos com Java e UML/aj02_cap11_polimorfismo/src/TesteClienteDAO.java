public class TesteClienteDAO
{
	public static void main(String[] args)
	{
		ClienteDAO dao = new ClienteDAO();
		Cliente c = dao.getByPrimaryKey(new Integer(20));
	}
}
