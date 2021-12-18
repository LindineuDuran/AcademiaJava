package br.com.globalcode.util;

public class Logger
{
	public static final int DEBUG = 0;
	public static final int ERROR = 1;

	public static void log(String msg, int level)
	{
		System.out.println("[" + level + "]" + msg);
	}
}
