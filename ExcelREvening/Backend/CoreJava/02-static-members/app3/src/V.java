class V
{
	static int i = test();

	static int test()
	{
		System.out.println("from test() begin");
		main(null);
		System.out.println("from test() end");
		return 10;
	}

	static
	{
		System.out.println("SIB1 begin");
		main(null);
		System.out.println("SIB1 end");
	}
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println("done");
	}

	static
	{
		System.out.println("SIB2 begin");
		main(null);
		System.out.println("SIB2 end");
	}
}
