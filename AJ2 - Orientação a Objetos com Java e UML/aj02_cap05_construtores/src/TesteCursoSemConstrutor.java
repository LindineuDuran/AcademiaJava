public class TesteCursoSemConstrutor
{
	public static void main(String[] args)
	{
		String nomeCurso = "Curso de Tricot";
		String descricaoCurso = "Neste curso você irá aprender tudo sobre tricot";
		String codigo = "ct1";
		int cargaHoraria = 40;
		
		//Chama o Construtor
		CursoSemConstrutor curso1 = new CursoSemConstrutor();
		
		//Inicializa Curso
		curso1.inicializaCurso(nomeCurso, descricaoCurso, codigo, cargaHoraria);
		curso1.imprime();
	}
}
