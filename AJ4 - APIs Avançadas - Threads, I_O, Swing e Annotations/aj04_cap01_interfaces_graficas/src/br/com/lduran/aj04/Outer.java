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
		// atributos, métodos ou outras inner classes
	}

	class InnerNaoEstatica
	{
		// atributos, métodos ou outras inner classes
	}

	// inner class definida no método aMethod
	public void aMethod()
	{
		class InnerDeMetodo
		{
			// atributos, métodos ou outras inner classes
		}
	}
}
