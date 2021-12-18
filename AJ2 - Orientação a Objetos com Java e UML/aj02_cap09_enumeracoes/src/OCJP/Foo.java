package OCJP;

enum FooEnum { FOO_VALUE}
public class Foo
{
	enum BarEnum { BAR_VALUE}
	
	void method()
	{
		enum BazEnum {BAZ_VALUE} //The member enum BazEnum can only be defined inside a top-level class or interface or in a static context
	}
}
