public class TesteCursoConstrutorDeclaradoErrado
{
	public static void main(String[] args)
	{
		String nomeCurso = "Curso de Tricot";
		String descricaoCurso = "Neste curso voc� ir� aprender tudo sobre tricot";
		String codigo = "ct1";
		int cargaHoraria = 40;
		
		//Erro - Construtor n�o declarado
		CursoConstrutorDeclaradoErrado curso1 = new CursoConstrutorDeclaradoErrado(nomeCurso, descricaoCurso, codigo, cargaHoraria);
		curso1.imprime();
	}
}
