
public class Curso
{
	//Atributos
	private String nome;
	private String codigo;
	private int cargaHoraria;
	
	//Construtores
	/**
	 * @param nome
	 * @param codigo
	 * @param cargaHoraria
	 */
	public Curso(String nome, String codigo, int cargaHoraria)
	{
		super();
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setCargaHoraria(cargaHoraria);
	}
	
	public void imprime()
	{
		System.out.println("O curso " + this.getNome() + ", c�digo " + this.getCodigo() + " tem carga hor�ria de " + this.getCargaHoraria() + " horas");
	}
	
	//Getters e Setters
	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getCodigo()
	{
		return codigo;
	}

	public void setCodigo(String codigo)
	{
		this.codigo = codigo;
	}

	public int getCargaHoraria()
	{
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria)
	{
		this.cargaHoraria = cargaHoraria;
	}	
}
