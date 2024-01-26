class M
{
	public void test()
	{
		this.test(10);
		System.out.println("from M test()");
	}

	public static void test(int i)
	{
		System.out.println("from M test(int)");
	}

	public static void main(String[] args) 
	{
		M obj = new M();
		obj.test();
		System.out.println("done");
	}
}
