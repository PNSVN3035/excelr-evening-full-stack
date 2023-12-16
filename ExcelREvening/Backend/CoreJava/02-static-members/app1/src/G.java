class G
{
	static int i; 
	
	static void test()
	{
		System.out.println("from test begin: " + i);
		i = 20;
		System.out.println("from test end: " + i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin: " + i);
		i = 10;
		test(); //caller
		System.out.println("main end: " + i);
	}
}
