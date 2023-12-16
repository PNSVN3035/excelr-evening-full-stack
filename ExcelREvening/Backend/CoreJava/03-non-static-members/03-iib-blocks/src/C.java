class C
{
	static
	{
		System.out.println("C-SIB1");
	}

	{
		System.out.println("C-IIB1");
	}

	C()
	{
		//IIB
		System.out.println("C()");
	}

	C(int i)
	{
		this(10, 20); 
		System.out.println("C(int)");
	}

	C(int i, int j)
	{
		this(); 
		System.out.println("C(int,int)");
	}

	public static void main(String[] args) 
	{
		C b1 = new C();
		System.out.println("-----------");
		C b2 = new C(90);  
		System.out.println("-----------");
		C b3 = new C(10, 20);  
		System.out.println("-----------");
	}

	{
		System.out.println("C-IIB2");
	}

	static
	{
		System.out.println("C-SIB2");
	}
}
