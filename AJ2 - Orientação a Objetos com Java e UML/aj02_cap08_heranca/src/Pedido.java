public class Pedido
{
	//declara��o de constantes
	public final static int NOVO = 1;
	public final static int APROVADO = 2;
	public final static int CANCELADO = 3;
	
	//declara��o de atributos
	private final int codigo;
	private int status;
	
	public Pedido(int codigo)
	{
		this.codigo = codigo;
		this.setStatus(Pedido.NOVO);
	}
	
	public void setStatus(int status)
	{
		this.status = status;
	}
	
	public void setCodigo(int codigo)
	{
		//um atributo tipo final n�o pode receber nova atribui��o
		this.codigo = codigo;
	}
	
	public int getCodigo()
	{
		return this.codigo;
	}
	
	public int getStatus()
	{
		return this.status;
	}
}
