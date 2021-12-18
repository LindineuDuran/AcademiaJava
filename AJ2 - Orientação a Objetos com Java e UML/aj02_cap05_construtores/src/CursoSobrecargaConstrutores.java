public class CursoSobrecargaConstrutores
{
	private String nome;
	private String descricao;
	private String codigo;
	private int cargaHoraria;
	
	public CursoSobrecargaConstrutores(String nome, String descricao, String codigo, int cargaHoraria)
	{
		this.setNome(nome);
		this.setDescricao(descricao);
		this.setCodigo(codigo);
		this.setCargaHoraria(cargaHoraria);
	}
	
	public CursoSobrecargaConstrutores(String nome, String codigo, int cargaHoraria)
	{
		this.setNome(nome);
		this.setCodigo(codigo);
		this.setCargaHoraria(cargaHoraria);
	}

	public String getNome()
	{
		return nome;
	}

	public void setNome(String nome)
	{
		this.nome = nome;
	}

	public String getDescricao()
	{
		return descricao;
	}

	public void setDescricao(String descricao)
	{
		this.descricao = descricao;
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
