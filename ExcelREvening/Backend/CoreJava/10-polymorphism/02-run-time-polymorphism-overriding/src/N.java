class M
{
	void test1()
	{
		System.out.println("from test1-M");
	}
}

class N extends M
{
	protected void test1()
	{
		System.out.println("from test1-N");
	}

	public static void main(String[] args) 
	{
		N obj1 = new N();
		obj1.test1();
		System.out.println("done");
	}
}
