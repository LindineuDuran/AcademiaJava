public class TesteInterface
{
	public static void main(String[] args)
	{
		Mobilia mob = new Mobilia("mesa", "Móveis Silva", "madeira/fórmica/metal", 115, 70, 90, 11);
		System.out.println("Mobília: " + mob.getTipo());
		System.out.println("Volume: " + mob.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("peso: " + mob.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("empilhamento máx.: " + mob.getEmpilhamentoMaximo());
		System.out.println();
		
		Alimento junk = new Alimento("Hamburguer", -2, 260d, 350, 6, 30);
		System.out.println("Alimento: " + junk.getNome());
		System.out.println("volume: " + junk.getVolume() + Transportavel.UNIDADE_VOLUME);
		System.out.println("peso: " + junk.getPeso() + Transportavel.UNIDADE_PESO);
		System.out.println("empilhamento máx.: " + junk.getEmpilhamentoMaximo());
		System.out.println("conservação: " + junk.getTemperaturaDeConservacao() + "ºC");
		System.out.println("dias de validade: " + junk.getDiasDeValidade());
	}
}
