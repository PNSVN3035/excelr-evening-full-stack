class N
{
	public void test()
	{
		System.out.println("from N test() begin");
		this.test(10);
		System.out.println("from N test() end");
	}

	public static void test(int i)
	{
		System.out.println("from N test(int i)");
	}

	public static void main(String[] args) 
	{
		N obj = new N();
		obj.test();
		System.out.println("done");
	}
}
