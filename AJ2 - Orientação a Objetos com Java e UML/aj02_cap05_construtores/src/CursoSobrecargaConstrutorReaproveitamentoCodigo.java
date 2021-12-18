public class CursoSobrecargaConstrutorReaproveitamentoCodigo
{
	private String nome;
	private String descricao;
	private String codigo;
	private int cargaHoraria;
	
	public CursoSobrecargaConstrutorReaproveitamentoCodigo(String nome, String descricao, String codigo, int cargaHoraria)
	{
		this(nome, codigo, cargaHoraria); //Forma de chamar um construtor da própria classe
		this.setDescricao(descricao);
	}
	
	public CursoSobrecargaConstrutorReaproveitamentoCodigo(String nome, String codigo, int cargaHoraria)
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
