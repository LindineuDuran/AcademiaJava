package br.com.lduran.aj04.swing;

import java.awt.Color;

import javax.swing.*;

public class ExemploJButtonComIcone extends JFrame
{
	public ExemploJButtonComIcone()
	{
		super("Teste JButton");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		// Criação de um icone com uma imagem
		ImageIcon iconeBotao = new ImageIcon("duke.png");

		// Criação de um botão com o icone
		JButton botaoIcone = new JButton(iconeBotao);

		// Alteração da cor de fundo do botão
		botaoIcone.setBackground(Color.WHITE);

		add(botaoIcone);

		setVisible(true);
	}

	public static void main(String[] args)
	{
		ExemploJButtonComIcone t = new ExemploJButtonComIcone();
	}
}