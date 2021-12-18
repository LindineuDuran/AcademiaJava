public class TesteCastTiposPrimitivos
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		//cast de int para double (int é menor do que double -> cast
		//automático) por default 125 é int
		double d = 125;
		System.out.println("int 125 convertido automaticamente para double " + d);
		
		//cast de int para char (int é maior que char -> cast explícito)
		//mas neste caso é um literal, então o cast é automático, pois o
		//compilador verifica a compatibilidade
		char c = 2154;
		System.out.println("literal 2154(int) convertido automat. para char = " + c);
		
		//cast de char para short (cast automático)
		short s = 'a';
		System.out.println("char 'a' convertido automaticamente para short " + s);
		
		//cast de char para byte (byte é menor que char -> cast explícito)
		//mas novamente estamos utilizando um literal ('a') então a conversão
		//é automática
		byte b = 'a';
		System.out.println("char 'a' (literal) convertido automaticamente para byte " + b);
		
		//cast de float para int (float é maior que int -> cast explícito)
		int i = (int) 5658.0f;
		System.out.println("float 5658.0f convertido explicitamente para int " + i);
	}

}
