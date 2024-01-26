class B 
{
	static void test()
	{
		System.out.println("test()");
	}

	static void test(int i)
	{
		System.out.println("test(int i)");
	}

	static void test(int i, int j)
	{
		System.out.println("test(int, int)");
	}

	static void test(int i, int j, int k)
	{
		System.out.println("test(int, int, int)");
	}

	public static void main(String[] args) 
	{
		B.test();
		B.test(10);
		B.test(10,20);
		B.test(10,20,30);
		System.out.println("done");
	}
}
