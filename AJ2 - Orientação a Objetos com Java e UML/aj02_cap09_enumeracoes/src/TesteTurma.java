public class TesteTurma
{
	public static void main(String[] args)
	{
		Turma t = new Turma("Academia Java", Periodo.DIURNO_INTEGRAL);
		System.out.println("\t - Curso: " + t.getCurso());
		System.out.println("\t - Hora de Início: " + t.getPeriodo().getHoraInicio());
		System.out.println("\t - Hora de Término: " + t.getPeriodo().getHoraTermino());
		System.out.println("\t - Duração: " + t.getPeriodo().getTotalPeriodo());
	}
}
