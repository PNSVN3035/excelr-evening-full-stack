class M18
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test(); 
		System.out.println("main end");
	}
	static void test() 
	{
		System.out.println("from test begin");
		if(true)
		{
			return; //immediately it has to return to the caller
		}
		System.out.println("from test end");
	} 
} 
