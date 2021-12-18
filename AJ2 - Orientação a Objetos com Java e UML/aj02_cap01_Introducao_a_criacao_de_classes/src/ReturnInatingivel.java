public class ReturnInatingivel
{
	boolean teste()
	{
		int i = 0;
		if (i > 0)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		return false; //instrução inatingível
	}
}
