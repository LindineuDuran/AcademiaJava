public class TesteInterface
{
	public static void main(String[] args)
	{
		Mobilia mob = new Mobilia("mesa", "M�veis Silva", "madeira/f�rmica/metal", 115, 70, 90, 11);
		System.out.println("Mob�lia: " + mob.getTipo());
		System.out.println("Volume: " + mob.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("peso: " + mob.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("empilhamento m�x.: " + mob.getEmpilhamentoMaximo());
		System.out.println();
		
		Alimento junk = new Alimento("Hamburguer", -2, 260d, 350, 6, 30);
		System.out.println("Alimento: " + junk.getNome());
		System.out.println("volume: " + junk.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("peso: " + junk.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("empilhamento m�x.: " + junk.getEmpilhamentoMaximo());
		System.out.println("conserva��o: " + junk.getTemperaturaDeConservacao() + "�C");
		System.out.println("dias de validade: " + junk.getDiasDeValidade());
	}
}
