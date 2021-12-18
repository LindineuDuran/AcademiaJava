package br.com.lduran.aj04.swing;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class ExemploJFrameComLabel extends JFrame
{
	public ExemploJFrameComLabel()
	{
		super("Janela Swing");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JLabel label = new JLabel("Texto do JLabel");
		add(label);

		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploJFrameComLabel t = new ExemploJFrameComLabel();
	}
}
