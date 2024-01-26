abstract class H
{
	abstract void test1();
	abstract void test2();
	abstract void test3();
}

class I extends H
{
	void test1()
	{
		System.out.println("from test1()");
	}

	void test2()
	{
		System.out.println("from test2()");
	}

	void test3()
	{
		System.out.println("from test3()");
	}

	public static void main(String[] args) 
	{
		I obj1 = new I();
		obj1.test1();
		obj1.test2();
		obj1.test3();
		System.out.println("done");
	}
}
