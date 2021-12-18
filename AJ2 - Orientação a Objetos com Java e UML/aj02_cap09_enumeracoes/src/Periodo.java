public enum Periodo
{
	DIURNO_INTEGRAL ("Seg a Sex", 10, 18),
	DIURNO_MATUTINO ("Seg a Sex", 8, 12),
	NOTURNO ("Seg a Sex", 19, 23);
	
	private String dias;
	private int horaInicio;
	private int horaTermino;
	
	/**
	 * @param dias
	 * @param horaInicio
	 * @param horaTermino
	 */
	private Periodo(String dias, int horaInicio, int horaTermino)
	{
		this.dias = dias;
		this.horaInicio = horaInicio;
		this.horaTermino = horaTermino;
	}

	/**
	 * @return the dias
	 */
	public String getDias()
	{
		return dias;
	}

	/**
	 * @return the horaInicio
	 */
	public int getHoraInicio()
	{
		return horaInicio;
	}

	/**
	 * @return the horaTermino
	 */
	public int getHoraTermino()
	{
		return horaTermino;
	}
	
	public int getTotalPeriodo()
	{
		return horaTermino - horaInicio;
	}
}
