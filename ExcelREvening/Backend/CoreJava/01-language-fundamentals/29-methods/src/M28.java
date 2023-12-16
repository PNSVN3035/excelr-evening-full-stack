class M28
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(); //caller
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return 100; //the 100 will be available with caller
	}
} 
