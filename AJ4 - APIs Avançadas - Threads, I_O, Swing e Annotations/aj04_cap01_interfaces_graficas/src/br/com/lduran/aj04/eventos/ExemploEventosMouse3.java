package br.com.lduran.aj04.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class ExemploEventosMouse3 extends JFrame
{
	private JLabel lTexto = new JLabel("Texto inicial");

	public ExemploEventosMouse3(String tituloJanela)
	{
		super(tituloJanela);

		JPanel p1 = new JPanel();

		JButton b1 = new JButton("Botão 1");

		// criação de um objeto da inner class
		EventosMouseListener listener = new EventosMouseListener();
		b1.addMouseListener(listener);

		p1.add(b1);
		p1.add(lTexto);
		add(p1);

		setSize(200, 200);
		setVisible(true);
	}

	public class EventosMouseListener extends MouseAdapter
	{
		@Override
		public void mouseClicked(MouseEvent e)
		{
			lTexto.setText("Mouse Clicked !");
			System.out.println("Mouse Clicked !");
		}
	}

	public static void main(String[] args)
	{
		ExemploEventosMouse3 t = new ExemploEventosMouse3("TesteEventosMouse");
	}
}
