package br.com.globalcode.aj3.datas;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

// a) importacao de bibliotecas

/**
 * Classe que realiza a formatacao de datas
 *
 * @author Globalcode
 */
public class FormataDatas
{
	public static void main(String[] args)
	{
		// b) Criacao do objeto Calendar
		Calendar cal = Calendar.getInstance();

		// c) Alteracao dos dados do calendario para
		// 03 de março de 1997, as 18h57m0s
		String mascara = "dd 'de' MMMM 'de' yyyy', as 'HH'h'mm'm's's'";

		// cal.set(Calendar.DAY_OF_MONTH, 3);
		// cal.set(Calendar.MONTH, Calendar.MARCH);
		// cal.set(Calendar.YEAR, 1997);
		// cal.set(Calendar.HOUR_OF_DAY, 18);
		// cal.set(Calendar.MINUTE, 57);
		// cal.set(Calendar.SECOND, 0);
		cal.set(1997, Calendar.MARCH, 3, 18, 57, 0);

		// d) Obtencao do Date a partir do Calendar
		Date data = cal.getTime();
		System.out.println("data: " + data);

		// e) Construcao do objeto para formatacao especifica
		SimpleDateFormat formatador = new SimpleDateFormat(mascara);
		System.out.println("data formatada com SimpleDateFormat: " + formatador.format(data));
		System.out.println("data atual formatada com SimpleDateFormat: " + formatador.format(new Date()));

		// f) Construcao do objeto para formatacao padrao
		DateFormat formatador2 = DateFormat.getDateInstance(DateFormat.MEDIUM);

		System.out.println("data formatada com DateFormat: " + formatador2.format(data));
		System.out.println("data atual formatada com DateFormat: " + formatador2.format(new Date()));
	}
}
