package br.com.lduran.aj04.exemplos;

import java.awt.BorderLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class ExemploThreadSwingUtilities extends JFrame
{
	JLabel lMenssagem = new JLabel("Testando");

	public ExemploThreadSwingUtilities(String tituloJanela)
	{
		super(tituloJanela);

		JButton b1 = new JButton("Iniciar Processamento");
		add(b1, BorderLayout.NORTH);
		add(lMenssagem, BorderLayout.SOUTH);

		EventosMouse listener = new EventosMouse();
		b1.addMouseListener(listener);

		setSize(200, 100);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

	public class EventosMouse extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			Processador proc = new Processador();
			Thread t = new Thread(proc);
			t.start();
		}
	}

	class Processador implements Runnable
	{
		@Override
		public void run()
		{
			for (int i = 0; i <= 1000000000; i++)
			{
				System.out.println("Processa: " + i);
			}

			// Processamento demorado
			SwingUtilities.invokeLater(new Runnable()
			{
				@Override
				public void run()
				{

				}
			});
		}
	}

	public static void main(String[] args)
	{
		ExemploThreadSwingUtilities frame = new ExemploThreadSwingUtilities("TesteThreadSwing");
	}
}