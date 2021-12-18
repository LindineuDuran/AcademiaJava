package br.com.lduran.aj04.swing;

import javax.swing.JFrame;
import javax.swing.JTextField;

public class ExemploJTextField extends JFrame
{
	public ExemploJTextField()
	{
		super("Teste JTextField");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JTextField textField = new JTextField();
		add(textField);

		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploJTextField t = new ExemploJTextField();
	}
}