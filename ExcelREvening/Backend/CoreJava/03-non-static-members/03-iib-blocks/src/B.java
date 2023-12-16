class B 
{
	{
		System.out.println("B-IIB1");
	}

	B()
	{
		//IIB //but before the excution of constructor all IIB blocks to be excecuted
		System.out.println("B()");
	}

	B(int i)
	{
		this(10, 20); //calling two argument constructor
		System.out.println("B(int)");
	}

	B(int i, int j)
	{
		this(); //calling no argument constructor
		System.out.println("B(int, int)");
	}

	public static void main(String[] args) 
	{
		B b1 = new B();
		System.out.println("-----------");
		B b2 = new B(90);  //argument constructor
		System.out.println("-----------");
		B b3 = new B(10, 20);  //argument constructor
		System.out.println("-----------");
	}

	{
		System.out.println("B-IIB2");
	}
}
