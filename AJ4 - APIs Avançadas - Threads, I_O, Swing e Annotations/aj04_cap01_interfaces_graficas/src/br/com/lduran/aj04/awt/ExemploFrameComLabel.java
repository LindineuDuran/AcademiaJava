package br.com.lduran.aj04.awt;

import java.awt.Frame;
import java.awt.Label;

public class ExemploFrameComLabel extends Frame
{
	public ExemploFrameComLabel(String title)
	{
		// Estamos indicando o t�tulo da janela
		setTitle(title);

		// Configura��o do tamanho da janela
		setSize(200, 100);

		// Criando o componente Label
		Label l = new Label("AWT Label");

		// Adicionando o Label ao Frame
		add(l);

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
		ExemploFrameComLabel janela = new ExemploFrameComLabel("T�tulo da Janela");
	}
}
