package br.com.lduran.aj04.eventos;

import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;

public class ExemploEventosJButton extends JFrame
{
	private JButton botao1;
	private JButton botao2;
	private JLabel lTexto;

	public ExemploEventosJButton()
	{
		super("Teste Eventos JButton");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(3, 1));

		botao1 = new JButton("bot�o 1");
		botao1.setMnemonic(KeyEvent.VK_1);
		botao1.addActionListener(new EventosActionListener());

		botao2 = new JButton("bot�o 2");
		botao2.setMnemonic(KeyEvent.VK_2);
		botao2.addActionListener(new EventosActionListener());

		lTexto = new JLabel("a��o");

		add(botao1);
		add(botao2);
		add(lTexto);

		setSize(275, 100);
		setVisible(true);
	}

	class EventosActionListener implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			String texto = "Bot�o ativado: " + e.getActionCommand();
			System.out.println(texto);
			lTexto.setText(texto);
		}
	}

	public static void main(String[] args)
	{
		ExemploEventosJButton t = new ExemploEventosJButton();
	}
}
