class P 
{
	static String str = "abc";
	int i = 10;

	public void test()
	{
		System.out.println("from P test() begin");
		System.out.println(this.str);
		System.out.println(this.i);
		System.out.println("from P test() end");
	}

	public static void main(String[] args) 
	{
		System.out.println("main begin");
		P obj = new P();
		obj.test();
		System.out.println("main end");
	}
}
