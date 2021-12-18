package OCJP;

class Animal
{
	private String name;
	
	Animal(String name)
	{
		System.out.println("Inside Animal's constructor");
		this.name = name;
	}
}
public class Dog extends Animal
{
	Dog()
	{
		//É necessário atender ao construtor da classe pai. Ex.: super("João");
		System.out.println("Inside dog's constructor");
	}
	
	public static void main(String[] args)
	{
		Dog d = new Dog();
	}
}
