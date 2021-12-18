package br.com.lduran.aj04.exemplos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

public class ExemploThreadSwing extends JFrame
{
	public ExemploThreadSwing(String tituloJanela)
	{
		super(tituloJanela);

		JButton b1 = new JButton("Iniciar Processamento");
		add(b1);

		EventosMouse listener = new EventosMouse();
		b1.addMouseListener(listener);

		setSize(200, 75);
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
			// TODO Auto-generated method stub
			for (int i = 0; i <= 1000000; i++)
			{
				System.out.println("Processa: " + i);
			}
		}

	}

	public static void main(String[] args)
	{
		ExemploThreadSwing frame = new ExemploThreadSwing("TesteThreadSwing");
	}
}
