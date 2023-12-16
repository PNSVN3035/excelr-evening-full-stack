class I
{
	static int i; 
	
	static void test()
	{
		System.out.println("from test begin: " + I.i);
		I.i = 20;
		System.out.println("from test end: " + I.i);
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin: " + I.i);
		I.i = 10;
		I.test();
		System.out.println("main end: " + I.i);
	}
}
