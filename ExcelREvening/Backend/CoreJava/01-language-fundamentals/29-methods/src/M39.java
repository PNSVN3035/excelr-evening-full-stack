class M39
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		int i = test();
		System.out.println(i);
		System.out.println("main end");
	}
	static int test()
	{
		System.out.println("from test");
		return 12 - (4 * 3) / 2;
	}
} 
 