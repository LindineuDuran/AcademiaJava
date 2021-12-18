package br.com.lduran.aj04.swing;

import java.awt.FlowLayout;

import javax.swing.*;

public class ExemploFlowLayout extends JFrame
{
	public ExemploFlowLayout()
	{
		super("Teste FlowLayout Globalcode!");
		setSize(275, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pBotoes = montaJPanelBotoes();
		add(pBotoes);

		setVisible(true);
	}

	private JPanel montaJPanelBotoes()
	{
		JPanel p = new JPanel();
		p.setLayout(new FlowLayout(FlowLayout.CENTER));
		p.add(new JButton("Salvar"));
		p.add(new JButton("Excluir"));

		return p;
	}

	public static void main(String[] args)
	{
		ExemploFlowLayout t = new ExemploFlowLayout();
	}
}
