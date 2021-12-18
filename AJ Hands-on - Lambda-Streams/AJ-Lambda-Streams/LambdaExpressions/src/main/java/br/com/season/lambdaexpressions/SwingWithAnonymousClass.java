package br.com.season.lambdaexpressions;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingWithAnonymousClass {

	public static void main(String[] args) {

		JFrame frame = new JFrame("ActionListener antes do Java 8");

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(50, 100, 80, 50);

		btnSalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Olá Mundo!");
			}
		});

		frame.add(btnSalvar);

		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
