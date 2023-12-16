class J
{
	static int x = 0; 
	
	static void test1()
	{
		System.out.println("from test1 begin: " + x);
		x = 10;
		System.out.println("from test1 end: " + x);
	}

	public static void main(String[] args) 
	{
		System.out.println("from main begin: " + x);
		test1();
		System.out.println("from main middle: " + x);
		test2();
		System.out.println("from main end: " + x);
	}
	static void test2()
	{
		System.out.println("from test2 begin: " + x);
		x = 20;
		System.out.println("from test2 end: " + x);
	}
}
