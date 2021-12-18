package br.com.lduran.aj4.testes;

import java.awt.Dimension;

import javax.swing.JFrame;

import br.com.lduran.aj4.annotations.GUIGenerator;
import br.com.lduran.aj4.model.Cliente;

public class TesteGUIGenerator
{
	public static void main(String[] args)
	{
		JFrame frame = new JFrame("GUI Generator");

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		GUIGenerator generator = new GUIGenerator();
		Cliente cliente = new Cliente();
		generator.bind(cliente);
		frame.add(generator);

		frame.setPreferredSize(new Dimension(300, 300));
		frame.pack();
		frame.setVisible(true);
	}
}
