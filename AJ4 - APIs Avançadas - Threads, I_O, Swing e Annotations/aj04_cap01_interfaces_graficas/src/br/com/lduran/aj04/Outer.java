package br.com.lduran.aj04;

public class Outer
{
	/**
	 * static nested class
	 * 
	 * @author lsdur
	 *
	 */
	static class InnerEstatica
	{
		// atributos, m�todos ou outras inner classes
	}

	class InnerNaoEstatica
	{
		// atributos, m�todos ou outras inner classes
	}

	// inner class definida no m�todo aMethod
	public void aMethod()
	{
		class InnerDeMetodo
		{
			// atributos, m�todos ou outras inner classes
		}
	}
}
