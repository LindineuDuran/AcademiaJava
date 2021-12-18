package OCJP;

class Vehicle
{
	public void move()
	{
		System.out.println("move");
	}
}

class VehicleOnWheels extends Vehicle
{
	public void move()
	{
		System.out.println("moves on wheels");
	}
}

public class Car extends VehicleOnWheels
{
	public void move()
	{
		System.out.println("move on 4 wheels");
	}
	
	public static void main(String[]args)
	{
		Car car = new Car();
	}
}
