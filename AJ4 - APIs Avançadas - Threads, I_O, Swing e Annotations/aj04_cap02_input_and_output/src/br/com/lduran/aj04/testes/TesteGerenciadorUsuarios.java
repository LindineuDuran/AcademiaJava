package br.com.lduran.aj04.testes;

import br.com.lduran.aj04.model.Usuario;
import br.com.lduran.aj04.util.GerenciadorUsuario;
import br.com.lduran.aj04.util.GlobalcodeException;

public class TesteGerenciadorUsuarios
{
	public static void main(String[] args)
	{
		try
		{
			if (args.length == 1)
			{
				String username = args[0];
				Usuario user = GerenciadorUsuario.getUsuario(username);
				System.out.println(user);
			}
			else if (args.length == 3)
			{
				// Ex.: globalcode 1234 pt_BR
				Usuario newUser = new Usuario(args[0], args[1], args[2]);
				GerenciadorUsuario.addUsuario(newUser);
			}
			else
			{
				System.out.println("Sintaxe adequada <user>");
				System.out.println("Sintaxe adequada <user> <password> <idioma>");
			}
		}
		catch (GlobalcodeException ge)
		{
			ge.printStackTrace();
		}
	}
}
