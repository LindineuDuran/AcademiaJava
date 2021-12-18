package OCJP;

enum Animal
{
	DOG("walk"), BIRD("fly"), FISH("swim");
	
	String movement;
	
	Animal(String s)
	{
		movement = s;
	}
}

public class TesteEnum
{
	static Animal animal;
	
	public static void main(String[] args)
	{
		System.out.println(animal.DOG.movement + " " + animal.FISH.movement);
	}
}
