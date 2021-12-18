package br.com.lduran.aj04.swing;

import javax.swing.JComboBox;
import javax.swing.JFrame;

public class ExemploJComboBox extends JFrame
{
	public ExemploJComboBox()
	{
		super("Teste JComboBox");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JComboBox seletorBancos = new JComboBox<>();
		seletorBancos.addItem("Itaú");
		seletorBancos.addItem("Bradesco");
		seletorBancos.addItem("Globalcode Bank");

		add(seletorBancos);

		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploJComboBox t = new ExemploJComboBox();
	}
}