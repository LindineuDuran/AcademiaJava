package br.com.lduran.aj04.awt;

import java.awt.Frame;

public class ExemploFrame extends Frame
{
	public ExemploFrame(String title)
	{
		// Estamos indicando o t�tulo da janela
		setTitle(title);

		// Configura��o do tamanho da janela
		setSize(200, 100);

		// Fazendo a janela aparecer
		setVisible(true);
	}

	/**
	 * Ao executar a classe, o m�todo main ser� executado, criando uma inst�ncia da
	 * classe ExemploFrame que, por sua vez, far� com que a janela seja exibida.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		ExemploFrame janela = new ExemploFrame("T�tulo da Janela");
	}
}
