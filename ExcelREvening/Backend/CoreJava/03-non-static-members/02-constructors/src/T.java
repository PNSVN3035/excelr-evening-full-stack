class T 
{
	T()
	{
		this(10);
		System.out.println("T()");
	}

	T(int i)
	{
		this();
		System.out.println("T(int)");
	}
}
