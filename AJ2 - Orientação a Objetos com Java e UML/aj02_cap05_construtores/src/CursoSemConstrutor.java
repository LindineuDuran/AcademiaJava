public class CursoSemConstrutor
{
	private String nome;
	private String descricao;
	private String codigo;
	private int cargaHoraria;
	
	public void inicializaCurso(String nome, String descricao, String codigo, int cargaHoraria)
	{
		setNome(nome);
		setDescricao(descricao);
		setCodigo(codigo);
		setCargaHoraria(cargaHoraria);
	}
	
	public void imprime()
	{
		System.out.println("Nome: " + this.getNome());
		System.out.println("Descrição: " + this.getDescricao());
		System.out.println("Código: " + this.getCodigo());
		System.out.println("Carga Horária: " + this.getCargaHoraria());
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
