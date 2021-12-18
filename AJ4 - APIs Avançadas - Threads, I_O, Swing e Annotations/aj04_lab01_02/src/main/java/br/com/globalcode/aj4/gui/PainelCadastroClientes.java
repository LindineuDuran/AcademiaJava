/*
 * Globalcode - "The Developers Company"
 *
 * Academia do Java
 *
 * Esta classe representa um Panel de cadastro de clientes,
 * para ser visualizada deve ser adicionada a um JFrame ou
 * outro container que possa ser visualizado.
 */
package br.com.globalcode.aj4.gui;

import java.awt.*;

import javax.swing.*;

import br.com.globalcode.util.GlobalcodeException;

/**
 * Esta classe monta um painel para cadastro de clientes. Para ser visualizada,
 * ela deve ser adicionada a um JFrame ou outro container.
 *
 */
public class PainelCadastroClientes extends JPanel
{

	private JLabel lNome;
	private JTextField tfNome;
	private JLabel lTelefone;
	private JTextField tfTelefone;
	private JLabel lID;
	private JTextField tfID;
	private JLabel lCPF;
	private JTextField tfCPF;
	private JPanel pCadastroCliente;
	private JPanel pBotoesCadastro;
	private JButton bExcluir;
	private JButton bSalvar;
	private JButton bNovo;

	/**
	 * Este construtor monta um Panel para insercao de dados de Cadastro de
	 * Clientes.
	 */
	public PainelCadastroClientes() throws GlobalcodeException
	{
		this.setLayout(new BorderLayout());
		pCadastroCliente = montaPanelCadastroCliente();
		pBotoesCadastro = montaPanelBotoesCadastro();
		this.add(pCadastroCliente, BorderLayout.CENTER);
		this.add(pBotoesCadastro, BorderLayout.SOUTH);
	}

	/**
	 * Metodo utilizado internamente para montagem do JPanel com o botao Salvar, por
	 * isto ele foi declarado como private.
	 *
	 * @return JPanel com o botao Salvar, para salvar um cliente
	 */
	private JPanel montaPanelBotoesCadastro()
	{
		JPanel pBotoesCadastro = new JPanel();
		pBotoesCadastro.setLayout(new FlowLayout(FlowLayout.CENTER));

		bSalvar = new JButton("Salvar");
		pBotoesCadastro.add(bSalvar);

		bExcluir = new JButton("Excluir");
		pBotoesCadastro.add(bExcluir);

		bNovo = new JButton("Novo");
		pBotoesCadastro.add(bNovo);

		return pBotoesCadastro;
	}

	/**
	 * Metodo utilizado internamente para montagem do JPanel para cadastro ou edicao
	 * de um cliente, por isto ele foi declarado como private.
	 *
	 * @return JPanel para cadastro ou edicao de um cliente
	 */
	private JPanel montaPanelCadastroCliente()
	{
		JPanel pCadastroCliente = new JPanel();
		pCadastroCliente.setLayout(new GridLayout(8, 1));

		lNome = new JLabel("Nome:");
		pCadastroCliente.add(lNome);

		tfNome = new JTextField("", 10);
		pCadastroCliente.add(tfNome);

		lTelefone = new JLabel("Telefone:");
		pCadastroCliente.add(lTelefone);

		tfTelefone = new JTextField("", 10);
		pCadastroCliente.add(tfTelefone);

		lCPF = new JLabel("CPF:");
		pCadastroCliente.add(lCPF);

		tfCPF = new JTextField("", 10);
		pCadastroCliente.add(tfCPF);

		lID = new JLabel("ID:");
		pCadastroCliente.add(lID);

		tfID = new JTextField("", 10);
		pCadastroCliente.add(tfID);

		return pCadastroCliente;
	}
}