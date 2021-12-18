package br.com.lduran.aj04.swing;

import javax.swing.JFrame;

public class ExemploJFrameSwing extends JFrame
{
	public ExemploJFrameSwing()
	{
		super("Janela Swing");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploJFrameSwing t = new ExemploJFrameSwing();
	}
}
