package br.com.lduran.aj04.util;

public class GlobalcodeException extends Exception
{
	public GlobalcodeException(String mensagem, Exception e)
	{
		super(mensagem, e);
	}

	public GlobalcodeException(String mensagem)
	{
		super(mensagem);
	}
}