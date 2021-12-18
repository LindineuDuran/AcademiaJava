package br.com.lduran.aj04.exemplos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploSwingIncorreto extends JFrame
{
	public ExemploSwingIncorreto(String tituloJanela)
	{
		super(tituloJanela);

		JButton b1 = new JButton("Iniciar Processamento");
		add(b1);

		EventosMouse listener = new EventosMouse();
		b1.addMouseListener(listener);

		setSize(200, 75);
		setVisible(true);
	}

	public class EventosMouse extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{

		}
	}

	public static void main(String[] args)
	{
		ExemploSwingIncorreto frame = new ExemploSwingIncorreto("TesteThreadSwing");
	}
}
