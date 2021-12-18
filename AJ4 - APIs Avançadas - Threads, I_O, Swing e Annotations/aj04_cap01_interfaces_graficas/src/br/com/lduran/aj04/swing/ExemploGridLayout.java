package br.com.lduran.aj04.swing;

import java.awt.GridLayout;

import javax.swing.*;

public class ExemploGridLayout extends JFrame
{
	public ExemploGridLayout()
	{
		super("Teste Grid Layout Globalcode!");
		setSize(400, 150);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pLogin = montaJPanelLogin();
		add(pLogin);

		setVisible(true);
	}

	private JPanel montaJPanelLogin()
	{
		JPanel p = new JPanel();

		JTextField tfNumeroConta = new JTextField("", 10);
		JTextField tfAgencia = new JTextField("", 10);
		JTextField tfBanco = new JTextField("", 10);
		JTextField tfLimite = new JTextField("", 10);
		JTextField tfCorrentista = new JTextField("", 30);

		p.setLayout(new GridLayout(5, 2));

		p.add(new JLabel("Número da Conta"));
		p.add(tfNumeroConta);

		p.add(new JLabel("Agência"));
		p.add(tfAgencia);

		p.add(new JLabel("Banco"));
		p.add(tfBanco);

		p.add(new JLabel("Limite"));
		p.add(tfLimite);

		p.add(new JLabel("Correntista"));
		p.add(tfCorrentista);

		return p;
	}

	public static void main(String[] args)
	{
		ExemploGridLayout t = new ExemploGridLayout();
	}
}
