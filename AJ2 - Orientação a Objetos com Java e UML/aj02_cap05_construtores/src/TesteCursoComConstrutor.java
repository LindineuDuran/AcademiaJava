public class TesteCursoComConstrutor
{
	public static void main(String[] args)
	{
		String nomeCurso = "Curso de Tricot";
		String descricaoCurso = "Neste curso voc� ir� aprender tudo sobre tricot";
		String codigo = "ct1";
		int cargaHoraria = 40;
		
		//Chama o Construtor com os par�metros de inicializa��o da classe Curso
		CursoComConstrutor curso1 = new CursoComConstrutor(nomeCurso, descricaoCurso, codigo, cargaHoraria);
		curso1.imprime();
	}
}
