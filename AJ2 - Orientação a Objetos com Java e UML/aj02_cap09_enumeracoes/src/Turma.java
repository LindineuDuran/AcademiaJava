public class Turma
{
	private String curso;
	private Periodo periodo;
	
	/**
	 * @param curso
	 * @param periodo
	 */
	public Turma(String curso, Periodo periodo)
	{
		super();
		this.curso = curso;
		this.periodo = periodo;
	}

	/**
	 * @return the curso
	 */
	public String getCurso()
	{
		return curso;
	}

	/**
	 * @param curso the curso to set
	 */
	public void setCurso(String curso)
	{
		this.curso = curso;
	}

	/**
	 * @return the periodo
	 */
	public Periodo getPeriodo()
	{
		return periodo;
	}

	/**
	 * @param periodo the periodo to set
	 */
	public void setPeriodo(Periodo periodo)
	{
		this.periodo = periodo;
	}
}
