package br.com.season.lambdaexpressions;

import javax.swing.JButton;
import javax.swing.JFrame;

public class SwingWithLambdaExpression {

	public static void main(String[] args) {

		JFrame frame = new JFrame("ActionListener com Java 8");

		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setBounds(50, 100, 80, 50);

		btnSalvar.addActionListener(e -> System.out.println("Olá Mundo!"));

		frame.add(btnSalvar);

		frame.setSize(200, 200);
		frame.setLayout(null);
		frame.setVisible(true);
	}
}
