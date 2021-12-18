public class ContaPoupancaEspecial extends ContaPoupanca
{
	public double limite = 1000;
	
	ContaPoupancaEspecial(double saldo)
	{
		super(saldo);
	}
	
	//N�o � poss�vel sobrescrever um m�todo final
	public void saque(double valor)
	{
		if(saldo + limite > valor)
		{
			saldo -= valor;
		}
	}
}
