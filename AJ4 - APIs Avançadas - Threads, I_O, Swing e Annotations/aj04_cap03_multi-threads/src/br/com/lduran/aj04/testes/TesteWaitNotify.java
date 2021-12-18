package br.com.lduran.aj04.testes;

import javax.swing.JOptionPane;

import br.com.lduran.aj04.threads.EntregadorDeConvite;
import br.com.lduran.aj04.threads.ListaConvidados;

public class TesteWaitNotify
{
	public static void main(String[] args)
	{
		// inicializando repositório de dados
		ListaConvidados lista = new ListaConvidados();

		Thread t1 = new Thread(new EntregadorDeConvite(lista), "entregador1");
		Thread t2 = new Thread(new EntregadorDeConvite(lista), "entregador2");

		// disparando entregadores de convites
		// são as threads consumidoras do repositório de dados
		t1.start();
		t2.start();

		// loop de entrada de dados
		// esta thread(main) é a produtora de dados
		while (true)
		{
			// obtem um novo email para adicionar na lista
			String email = JOptionPane.showInputDialog("Digite o email do próximo convidado ", "");

			if (email != null)
			{
				lista.adicionar(email);
			}
			else
			{
				lista.fecharLista();
				break; // para sair do loop
			}
		}
	}
}
