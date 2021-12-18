package br.com.lduran.testes;

import java.util.Calendar;

public class TesteCalendarManipulacao
{
	public static void main(String[] args)
	{
		Calendar cal = Calendar.getInstance();
		int minutos = cal.get(Calendar.MINUTE);
		int mes = cal.get(Calendar.MONTH);
		System.out.println("agora: " + cal.getTime());

		// dia 10 as 21h, 03 anos atrás:
		cal.add(Calendar.YEAR, -3);
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.HOUR_OF_DAY, 21);
		System.out.println("dia 10 as 21h, 03 anos atrás: " + cal.getTime());

		// o objeto cal é ajustado para representar as 2 da madrugada do dia 11
		cal.add(Calendar.HOUR_OF_DAY, 5); // +5 horas
		System.out.println("+ 5 horas com add: " + cal.getTime());

		// 9 da noite do dia 10
		cal.set(Calendar.DAY_OF_MONTH, 10);
		cal.set(Calendar.HOUR_OF_DAY, 21);
		System.out.println("9 da noite do dia 10: " + cal.getTime());

		// o oobjeto cal representa as 2 da madrugada do dia 10
		cal.roll(Calendar.HOUR_OF_DAY, 5); // + 5 horas
		System.out.println("+ 5 horas com roll: " + cal.getTime());
	}
}
