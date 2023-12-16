class M30
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(); //caller
		System.out.println("main end");
	} 
	static boolean test()
	{
		System.out.println("from test");
		return false; 
	}
} 
