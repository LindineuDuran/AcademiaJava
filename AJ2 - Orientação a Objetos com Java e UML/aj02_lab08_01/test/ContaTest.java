import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class ContaTest
{

	@Test
	void test()
	{
		Banco banco = new Banco("Globalcode Bank", 1000);
		Agencia ag1 = new Agencia("001", banco);

		Cliente cliente1 = new Cliente("Cliente 1", "1232323");
		Cliente cliente2 = new Cliente("Cliente 2", "987789");

		Conta conta = new Conta(500, "741852", cliente1, ag1); // conta comum
		conta.saque(560);
	}

}
