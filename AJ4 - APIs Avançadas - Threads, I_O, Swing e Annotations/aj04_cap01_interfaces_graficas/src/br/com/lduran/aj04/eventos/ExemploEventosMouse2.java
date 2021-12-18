package br.com.lduran.aj04.eventos;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

public class ExemploEventosMouse2 extends JFrame implements MouseListener
{
	private JLabel lTexto = new JLabel("Texto inicial");

	public ExemploEventosMouse2(String tituloJanela)
	{
		super(tituloJanela);

		JPanel p1 = new JPanel();

		JButton b1 = new JButton("Botão 1");
		b1.addMouseListener(this); // o listener é o próprio frame

		p1.add(b1);
		p1.add(lTexto);
		add(p1);

		setSize(200, 200);
		setVisible(true);
	}

	@Override
	public void mouseClicked(MouseEvent e)
	{
		lTexto.setText("Mouse Clicked !");
		System.out.println("Mouse Clicked !");
	}

	@Override
	public void mousePressed(MouseEvent e)
	{
		lTexto.setText("Mouse Pressed !");
		System.out.println("Mouse Pressed !");
	}

	@Override
	public void mouseReleased(MouseEvent e)
	{
		lTexto.setText("Mouse Released !");
		System.out.println("Mouse Released !");
	}

	@Override
	public void mouseEntered(MouseEvent e)
	{
		lTexto.setText("Mouse Entered !");
		System.out.println("Mouse Entered !");
	}

	@Override
	public void mouseExited(MouseEvent e)
	{
		lTexto.setText("Mouse Exited !");
		System.out.println("Mouse Exited !");
	}

	public static void main(String[] args)
	{
		ExemploEventosMouse2 t = new ExemploEventosMouse2("TesteEventosMouse");
	}
}
