package br.com.lduran.aj04.eventos;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.*;

public class ExemploMouseListener4 extends JFrame
{
	private JLabel lTexto = new JLabel("Texto inicial");

	public ExemploMouseListener4(String tituloJanela)
	{
		super(tituloJanela);

		JPanel p1 = new JPanel();

		JButton b1 = new JButton("Botão 1");

		// criação de um objeto da inner class
		b1.addMouseListener(new MouseAdapter()
		{
			@Override
			public void mouseClicked(MouseEvent e)
			{
				lTexto.setText("Mouse Clicked !");
				System.out.println("Mouse Clicked INNER !");
			}
		});

		p1.add(b1);
		p1.add(lTexto);
		add(p1);

		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploMouseListener4 t = new ExemploMouseListener4("TesteEventosMouse");
	}
}
