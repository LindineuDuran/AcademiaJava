package OCJP;

class Ace
{
	Case c = new Case(); //um Ace tem um Case
}

class Base
{
	
}

public class Case extends Ace //um Case é um Ace
{
	Base b = new Base(); //um Case tem um Base
}
