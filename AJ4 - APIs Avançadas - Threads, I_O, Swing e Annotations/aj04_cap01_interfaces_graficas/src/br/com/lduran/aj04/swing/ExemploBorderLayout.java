package br.com.lduran.aj04.swing;

import java.awt.*;

import javax.swing.*;

public class ExemploBorderLayout extends JFrame
{
	public ExemploBorderLayout()
	{
		super("Teste Border Layout Globalcode!");
		setSize(400, 200);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel pLogin = montaJPanelLogin();
		JPanel pBotoes = montaJPanelBotoes();

		setLayout(new BorderLayout());

		add(new JLabel("Border Layout na posição North"), BorderLayout.NORTH);
		add(pLogin, BorderLayout.CENTER);
		add(pBotoes, BorderLayout.SOUTH);

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
		ExemploBorderLayout t = new ExemploBorderLayout();
	}
}
