class I 
{
	void test()
	{
		System.out.println("from test()");
	}

	public static void main(String[] args) 
	{
		I i1 = new I();
		I i2 = new I();
		i1.test();
		i2.test();
		System.out.println("done");
	}
}
