package br.com.lduran.aj04.eventos;

import javax.swing.*;

public class ExemploEventosMouse extends JFrame
{
	public ExemploEventosMouse(String tituloJanela)
	{
		super(tituloJanela);

		JPanel p1 = new JPanel();

		JButton b1 = new JButton("Botão 1");
		EventosMouseListener listener = new EventosMouseListener();
		b1.addMouseListener(listener);

		p1.add(b1);
		add(p1);

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploEventosMouse t = new ExemploEventosMouse("TesteEventosMouse");
	}
}
