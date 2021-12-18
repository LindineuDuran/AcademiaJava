package br.com.lduran.aj04.swing;

import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploJButton extends JFrame
{
	public ExemploJButton()
	{
		super("Teste JButton");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JButton botaoOK = new JButton("OK");
		botaoOK.setMnemonic(KeyEvent.VK_O);
		add(botaoOK);

		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploJButton t = new ExemploJButton();
	}
}
