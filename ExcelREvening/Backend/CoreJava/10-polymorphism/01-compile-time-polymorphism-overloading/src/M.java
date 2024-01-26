class L
{
	public void test()
	{
		System.out.println("from L test()");
	}
}

class M extends L
{
	static public void test(int i)
	{
		System.out.println("from M test(int)");
	}

	public static void main(String[] args) 
	{
		M m1 = new M();
		m1.test();
		m1.test(10);
		M.test(10);
		System.out.println("done");
	}
}
