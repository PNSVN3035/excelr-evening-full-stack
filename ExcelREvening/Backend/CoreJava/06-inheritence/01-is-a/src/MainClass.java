class DriverClass 
{
	public static void main(String[] args) 
	{
		System.out.println("Hello from Driver Class");
	}
}

class Derived1 extends DriverClass
{
	static int i;
	
	static
	{
		Derived1.main(null);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello from Derived1 Class");
	}
}

class Derived2 extends DriverClass
{
	static int j;

	static
	{
		Derived2.main(null);
	}

	public static void main(String[] args) 
	{
		System.out.println("Hello from Derived2 Class");
	}
}

class MainClass
{
	public static void main(String[] args) 
	{
		System.out.println("MainClass begin");
		System.out.println(Derived1.i);
		System.out.println(Derived2.j);
		System.out.println("MainClass end");
	}
}
