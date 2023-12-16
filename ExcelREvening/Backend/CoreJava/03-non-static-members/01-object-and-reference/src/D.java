class D 
{
	void test1()
	{
		System.out.println("test1()");
	}

	static void test2() 
	{
		test1();
		System.out.println("test2()");
	}
}
