package br.com.lduran.aj04.threads;

public class EntregadorDeConvite implements Runnable
{
	private ListaConvidados listaConvidados;

	/**
	 * @param listaConvidados
	 */
	public EntregadorDeConvite(ListaConvidados listaConvidados)
	{
		this.listaConvidados = listaConvidados;
	}

	@Override
	public void run()
	{
		String nomeThread = Thread.currentThread().getName();
		System.out.println(nomeThread + " iniciando atividades");

		boolean estaAberta = listaConvidados.isAberta();
		int quantidadePendente = listaConvidados.getQuantidadeEmailsPendentes();

		while (estaAberta || quantidadePendente > 0)
		{
			try
			{
				String email = listaConvidados.obterEmailConvidado();

				if (email != null)
				{
					System.out.println(nomeThread + " enviando email para " + email);

					// acesso ao servidor de email e envio da mensagem, simulando uma lentidão de até 10 segundos
					Thread.sleep((long) (Math.random() * 10000));

					System.out.println("... envio de convite para " + email + " concluido");
				}
			}
			catch (InterruptedException e)
			{
				Thread.currentThread().interrupt();
			}

			// verificando situação da lista
			estaAberta = listaConvidados.isAberta();
			quantidadePendente = listaConvidados.getQuantidadeEmailsPendentes();
		}

		System.out.println(nomeThread + " encerrando atividades");
	}
}
