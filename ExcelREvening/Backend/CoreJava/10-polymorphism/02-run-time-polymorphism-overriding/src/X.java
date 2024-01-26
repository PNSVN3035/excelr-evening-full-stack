class W
{
	public static void test1()
	{
		System.out.println("from test1.W");
	}
}

class X extends W
{
	public static void test1()
	{
		System.out.println("from test1.X");
	}

	public static void main(String[] args) 
	{
		W obj1 = new X();
		obj1.test1();
		System.out.println("done");
	}
}
