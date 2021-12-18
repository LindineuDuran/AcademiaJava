package br.com.lduran.aj04.awt;

import java.awt.Frame;

public class ExemploFrame extends Frame
{
	public ExemploFrame(String title)
	{
		// Estamos indicando o título da janela
		setTitle(title);

		// Configuração do tamanho da janela
		setSize(200, 100);

		// Fazendo a janela aparecer
		setVisible(true);
	}

	/**
	 * Ao executar a classe, o método main será executado, criando uma instância da
	 * classe ExemploFrame que, por sua vez, fará com que a janela seja exibida.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		ExemploFrame janela = new ExemploFrame("Título da Janela");
	}
}
