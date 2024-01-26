class E
{
	public void test()
	{
		System.out.println("from E test()");
	}
}

class F extends E
{
	public static void test(int i)
	{
		super.test();
		System.out.println("from F test(int)");
	}

	public static void main(String[] args) 
	{
		F obj = new F();
		obj.test();
		obj.test(10);
		System.out.println("done");
	}
}
