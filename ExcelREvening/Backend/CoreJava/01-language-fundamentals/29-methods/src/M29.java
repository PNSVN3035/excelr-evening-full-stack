class M29
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(); //caller
		System.out.println("main end");
	} //method can have any kind of return type incliuding void
	static String test()
	{
		System.out.println("from test");
		return "abc"; 
	}
} 
