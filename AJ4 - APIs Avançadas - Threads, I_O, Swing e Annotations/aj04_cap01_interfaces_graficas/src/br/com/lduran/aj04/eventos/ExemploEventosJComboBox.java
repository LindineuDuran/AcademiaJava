package br.com.lduran.aj04.eventos;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class ExemploEventosJComboBox extends JFrame
{
	/**
	 * o seletorBancos será manipulado no handler actionPerformed e por isso é
	 * necessário declará-lo como atributo da classe.
	 */
	private JComboBox seletorBancos = new JComboBox();
	private JTextField tfBanco = new JTextField();

	public ExemploEventosJComboBox()
	{
		super("Teste Eventos JComboBox");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(2, 1));

		seletorBancos.addItem("Itaú");
		seletorBancos.addItem("Bradesco");
		seletorBancos.addItem("Globalcode Bank");
		seletorBancos.addActionListener(new SeletorBancosHandler());

		add(seletorBancos);
		add(tfBanco);
		setSize(275, 100);
		setVisible(true);
	}

	class SeletorBancosHandler implements ActionListener
	{
		@Override
		public void actionPerformed(ActionEvent e)
		{
			System.out.println("Item selecionado: " + seletorBancos.getSelectedItem());
			tfBanco.setText(seletorBancos.getSelectedItem().toString());
		}
	}

	public static void main(String[] args)
	{
		ExemploEventosJComboBox t = new ExemploEventosJComboBox();
	}
}
