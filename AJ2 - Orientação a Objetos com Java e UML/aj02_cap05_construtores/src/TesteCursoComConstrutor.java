public class TesteCursoComConstrutor
{
	public static void main(String[] args)
	{
		String nomeCurso = "Curso de Tricot";
		String descricaoCurso = "Neste curso você irá aprender tudo sobre tricot";
		String codigo = "ct1";
		int cargaHoraria = 40;
		
		//Chama o Construtor com os parâmetros de inicialização da classe Curso
		CursoComConstrutor curso1 = new CursoComConstrutor(nomeCurso, descricaoCurso, codigo, cargaHoraria);
		curso1.imprime();
	}
}
