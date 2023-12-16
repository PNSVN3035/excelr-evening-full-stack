class M35
{
	//how to make use of the return value
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		System.out.println(test());
		System.out.println("main end");
	}
	static boolean test()
	{
		System.out.println("from test");
		return true;
	}
} 
 